package org.factoriaf5.java_list;

public class Imc {
    public String IMCPersona (Double peso, Double altura) {
        Double IMC = peso / Math.pow(altura, 2);
        if (IMC <= 16 && IMC >= 10) {
            return "Delgadez severa";
        } else if (IMC > 16 && IMC <= 17) {
            return "Delgadez moderada";
        } else if (IMC >= 17 && IMC <= 18.5) {
            return "Delgadez leve";
        } else if (IMC >= 18.5 && IMC <= 25) {
            return "Peso normal";
        } else if (IMC >= 25 && IMC <= 30) {
            return "Sobre peso";
        } else if (IMC >= 30 && IMC <= 35) {
            return "Obesidad leve";
        } else if (IMC >= 35 && IMC <= 40) {
            return "Obesidad moderada";
        } else if (IMC >= 40) {
            return "Obesidad morbida";
        } else {
            return "Probablemente introdujiste mal los datos, prueba otra vez";
        }
    }
}