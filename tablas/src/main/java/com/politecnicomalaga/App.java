package com.politecnicomalaga;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Tabla tabla = new Tabla();
        String resultado = "";
        for (int i=1; i<11; i++) {
            resultado += "Tabla del " + i + "\n";
            resultado += tabla.calcular(i) + "\n";
            resultado += "--------------------------\n";
        }
        System.out.println(resultado);
    }
}
