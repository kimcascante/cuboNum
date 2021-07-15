package Semana10;
/**
 * Nombre del programa: 
 * Descripcion: Haga una función que calcule el cubo de un número. Pruébela en un main.
 * Autor: Kimberly C y Jessica R.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ej1w10 {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream out = System.out;

    public static void main(String[] args) throws IOException{ 

        calcularCubo();
    }

    public static void calcularCubo() throws IOException{
        double num;
        double cubo;

        out.println("Digite un numero:");
        num = Double.parseDouble(in.readLine());

        //cubo = num * num * num;
        cubo = Math.pow(num, 3);

        out.println("El cubo del numero " +num+ " es: " +cubo);
    }
}