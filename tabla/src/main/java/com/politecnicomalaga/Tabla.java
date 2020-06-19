package com.politecnicomalaga;

public class Tabla {
    public String calcular (int i){
        String resultado = "";
        for(int a=1; a<11; a++){
            resultado += i + " * " + a + " = " + (i*a) + "\n" ;
        }
        return resultado;
    }
}