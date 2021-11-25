package com.joseluis.example;


//Calcular el número factorial
//Cree un programa para realizar el cálculo del factorial de un número introducido por el usuario desde una ventana.
//El factorial de un número es igual a ese número multiplicado por todos los que le preceden. Por ejemplo, el factorial de 5 es igual a 5x4x3x2x1=120.
//
//Se pide que el programa tenga como mínimo:
//Una clase “Principal” donde se realizarán los ingresos del usuario y se mostrarán los resultados.
//Una clase llamada “Operaciones”  con un constructor que solicite un entero entero
//Una clase llamada “Factoriales” hija de la clase “Operaciones”.
//La clase Factorial deberá tener un método que devuelva el factorial del número con el que es construida.
//Una interface que posea un método y la misma sea implementada por Factorial.
//La clase que calcule el factorial deberá tener otro método que devuelva el factorial como String mostrando todas las multiplicaciones y el resultado. Ej: si ingreso 5 me devolverá “5x4x3x2x1”
//La clase Principal deberá hacer uso de los dos métodos de la clase Factoriales para mostrar el resultado al usuario de la siguiente manera: “5x4x3x2x1=120”
//La clase Principal deberá contemplar el caso de que el usuario ingrese caracteres en vez de números emitiendo un mensaje de “Sólo se admiten números enteros”.


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroIngresado = -1;
        //El numero no puede ser negativo asi que pido que ingrese numeros hasta que sea positivo
        while (numeroIngresado < 0) {
            System.out.println("Ingrese un numero positivo");
            try {
                numeroIngresado = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Solo se admiten numeros enteros");
                numeroIngresado = 9999;
            }
        }
        if (numeroIngresado < 9999) {
            Factoriales factoriales = new Factoriales(numeroIngresado);
            String pasosFactorial = factoriales.obtenerPasos();
            int resultadoFactorial = factoriales.calcular();
            System.out.println(pasosFactorial + "=" + resultadoFactorial);
        }
    }
}
