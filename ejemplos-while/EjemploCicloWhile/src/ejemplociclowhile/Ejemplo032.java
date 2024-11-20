/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo032 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite = 5;
        int contador = 1;
        int suma = 0;
        int valor_ingresado;
        double promedio;
        
        while (contador <= limite) { 
            System.out.println("Ingrese el valor a sumar");
            valor_ingresado = entrada.nextInt();
            suma = suma + valor_ingresado;
            System.out.printf("Valor ingresado %d\n", valor_ingresado);
            contador = contador + 1;
        }
        promedio = suma / limite;
        System.out.printf("La suma final es %d\n", suma);
        System.out.printf("EL promedio final es %.2f\n", promedio);

    }
}
