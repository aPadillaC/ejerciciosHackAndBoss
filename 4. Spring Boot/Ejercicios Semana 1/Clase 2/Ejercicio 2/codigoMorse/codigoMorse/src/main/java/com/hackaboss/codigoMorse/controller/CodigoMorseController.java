package com.hackaboss.codigoMorse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class CodigoMorseController {

    @GetMapping("morse/{palabra}")
    public String convertirAMorse(@PathVariable String palabra) {

        //if( palabra.contains(" ")) return "Solo debe incluir una palabra";

        String codigoMorse = convertirCodigoMorse(palabra);

        return "La palabra `" + palabra + "` en codigo morse es: " + codigoMorse;
    }

//    private String convertirCodigoMorse(String palabra) {
//
//        String[] alfabeto = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
//                "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
//
//        String[] codigoMorse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
//                ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
//                ".--", "-..-", "-.--", "--.." };
//
//        String[] palabraString = palabra.split("");
//
//
//        String palabraMorse = "";
//
//        for( int i = 0; i < palabra.length(); i++) {
//
//            for( int j = 0; j < alfabeto.length; j++) {
//
//                if(alfabeto[j].equalsIgnoreCase(palabraString[i])){
//                    palabraMorse += codigoMorse[j] + " ";
//                }
//            }
//        }
//
//        return palabraMorse;
//    }

    private String convertirCodigoMorse(String palabra) {

        String[] codigoMorse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
                ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
                ".--", "-..-", "-.--", "--.." };

        String[] numerosMorse = {
                "-----", ".----", "..---", "...--", "....-", ".....",
                "-....", "--...", "---..", "----."
        };


        StringBuilder morse = new StringBuilder();

        for (char c : palabra.toUpperCase().toCharArray()) {
            if (Character.isLetter(c)) {
                morse.append(codigoMorse[c - 'A']).append(" ");
            }
            else if (Character.isDigit(c)) {
                morse.append(numerosMorse[c - '0']).append(" ");
            }
            else{
                morse.append("  ");
            }
        }
        return morse.toString().trim();
    }
}
