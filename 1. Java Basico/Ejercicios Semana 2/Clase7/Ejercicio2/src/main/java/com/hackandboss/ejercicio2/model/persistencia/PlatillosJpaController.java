package com.hackandboss.ejercicio2.model.persistencia;

import com.hackandboss.ejercicio2.model.Platillo;
import com.hackandboss.ejercicio2.model.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author tacte
 */
public class PlatillosJpaController implements Serializable {
    
    public PlatillosJpaController() {
      emf = Persistence.createEntityManagerFactory("restaurantePU");
    }

    public PlatillosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Platillo platillos) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(platillos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Platillo platillos) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            platillos = em.merge(platillos);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = platillos.getId();
                if (findPlatillos(id) == null) {
                    throw new NonexistentEntityException("The platillos with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Platillo platillo;
            try {
                platillo = em.getReference(Platillo.class, id);
                platillo.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The platillos with id " + id + " no longer exists.", enfe);
            }
            em.remove(platillo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Platillo> findPlatillosEntities() {
        return findPlatillosEntities(true, -1, -1);
    }

    public List<Platillo> findPlatillosEntities(int maxResults, int firstResult) {
        return findPlatillosEntities(false, maxResults, firstResult);
    }

    private List<Platillo> findPlatillosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Platillo.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Platillo findPlatillos(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Platillo.class, id);
        } finally {
            em.close();
        }
    }

    public int getPlatillosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Platillo> rt = cq.from(Platillo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
