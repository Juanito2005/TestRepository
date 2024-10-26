package org.factoriaf5.java_list;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ImcTest {
    private Imc imc;
    @BeforeEach
    public void init () {
        this.imc = new Imc();
    }
    @Test
    public void delgadezSevera () {
        assertEquals("Delgadez severa", imc.IMCPersona(45.0, 1.70));
    }
    @Test
    public void delgadezModerada () {
        assertEquals("Delgadez moderada", imc.IMCPersona(47.0, 1.70));
    }
    @Test
    public void delgadezLeve () {
        assertEquals("Delgadez leve", imc.IMCPersona(53.0, 1.70));
    }
    @Test
    public void pesoNormal () {
        assertEquals("Peso normal", imc.IMCPersona(70.0, 1.70));
    }
    @Test
    public void sobrePeso () {
        assertEquals("Sobre peso", imc.IMCPersona(73.0, 1.70));
    }
    @Test
    public void obesidadLeve () {
        assertEquals("Obesidad leve", imc.IMCPersona(90.0, 1.70));
    }
    @Test
    public void obesidadModerada () {
        assertEquals("Obesidad moderada", imc.IMCPersona(103.0, 1.70));
    }
    @Test
    public void obesidadMorbida () {
        assertEquals("Obesidad morbida", imc.IMCPersona(120.0, 1.70));
    }
    @Test
    public void formaRedonda () {
        assertEquals("Probablemente introdujiste mal los datos, prueba otra vez", imc.IMCPersona(0.0, 1.70));
    }
}
