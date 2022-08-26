package Test;

import contextoestatico.Persona;

public class Main {
    private int contador;
    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Alex");
        Persona persona2 = new Persona("Lu");
        imprimir(persona1);
        imprimir(persona2);
    }
    public static void imprimir(Persona persona)
    {
        System.out.println(persona);
    }

    public int getContador()
    {
        imprimir(new Persona("Mika"));
        return this.contador;
    }
}
