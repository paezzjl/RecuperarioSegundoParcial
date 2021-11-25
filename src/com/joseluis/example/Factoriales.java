package com.joseluis.example;

public class Factoriales extends Operaciones implements CalcularOperaciones{

    public Factoriales(int numero) {
        super(numero);
    }

    @Override
    public int calcular() {
        return this.factorial(numero);
    }

    private int factorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }


    public String obtenerPasos() {
        //Inicializo el string a mostrar con el numero y voy concatenando x con el numero restado en el numero de
        //iteracion hasta llegar a 1
        String mostrar = String.valueOf(numero);
        for (int i = 1; i < numero; i++) {
            mostrar = mostrar + "X" + (numero - i);
        }
        return mostrar;
    }
}
