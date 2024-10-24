package org.factoriaf5.java_list;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public List<String> diasSemana() {
        List<String> dias = new ArrayList<String>();
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miercoles");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Sabado");
        dias.add("Domingo");
        dias.add("Viernes");
        dias.add("Sabado");
        dias.add("Domingo");
        return dias;
    }
    public Integer largoLista(List<String> dias) {
        System.out.println("LARGO: " + dias.size());
        return dias.size();
    }
}
