package org.factoriaf5.java_list;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    // Un método que crea la lista de los días de la semana
    // Y al mismo tiempo un método que retorna los días de la semana
    public List<String> diasSemana() {
        List<String> dias = new ArrayList<>();
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miercoles");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Sabado");
        dias.add("Domingo");
        return dias;
    }
    // Un método que retorne el largo de la lista
    public Integer largoLista(List<String> dias) {
        System.out.println("LARGO: " + dias.size());
        return dias.size();
    }
    // Un método para eliminar un día de la semana
    public List<String> eliminarDia(List<String> dias, int indice) {
        dias.remove(indice);
        return dias;
    }
    // Un método que retorna el día de la semana solicitado
    // Y al mismo tiempo un método que retorna si el día solicitado existe en la lista
    public String retornarDia(List<String> dias, String dia) {
        if (dias.contains(dia)) {
            return dia;
        }
        return "El dia no se encuentra en la lista";
    }
    // Un método para ordenar la lista de días por orden alfabético
    public List<String> ordenarLista(List<String> dias) {
        for (int i = 0; i < dias.size(); i++) {
            String menor = dias.get(i);
            for (int j = i + 1; j < dias.size(); j++) {
                if (dias.get(j).compareTo(menor) < 0) {
                    String temp = dias.get(i);
                    dias.set(i, dias.get(j));
                    dias.set(j, temp);
                }
            }
        }
        System.out.println(dias);
        return dias;
    }
    // Un método para vaciar la lista
    public void vaciarLista(List<String> dias) {
        dias.clear();
    }
}
