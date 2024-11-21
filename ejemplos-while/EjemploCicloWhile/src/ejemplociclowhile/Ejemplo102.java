/*
 Generar una solución que permita ingresar y presentar por teclado las operaciones básicas de suma, resta, multiplicación.
El usuario ingresará por teclado el número de la tabla a generar, el límite de la tabla.

Ejemplo:

Si el usuario ingresa el número de tabla: 4
Si el usuario ingresa el límite de tabla: 5

El programa debe presentar:

Tabla de sumar

4 + 1 = 5
4 + 2 = 6
4 + 3 = 7
4 + 4 = 8
4 + 5 = 9

Tabla de restar

4 - 1 = 3
4 - 2 = 2
4 - 3 = 1
4 - 4 = 0
4 - 5 = -1

Tabla de multiplicar

4 * 1 = 4
4 * 2 = 8
4 * 3 = 12
4 * 4 = 16
4 * 5 = 20
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo102 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite_tabla = 5;
        int contador = 1;
        int operacion;
        int tabla;
        int suma;
        int resta;
      
        
        System.out.println("Ingrese el número de tabla a generar");
        tabla = entrada.nextInt();
        
        String cadena_multi = ""; // cadena acumulador
        
        
        String cadena_suma = "";
        
        
        String cadena_resta = "";
        
        
        String cadena = "";
        
        while (contador <= limite_tabla){
            operacion = tabla * contador;
           
            
            cadena_multi = String.format("%s%d*%d=%d\n", 
                    cadena_multi, 
                    tabla, 
                    contador,
                    operacion);
            
            
            operacion = tabla + contador;
           
            
            cadena_suma = String.format("%s%d+%d=%d\n", 
                    cadena_suma, 
                    tabla, 
                    contador,
                    operacion);
            
            
            operacion = tabla - contador;
           
            
            cadena_resta = String.format("%s%d-%d=%d\n", 
                    cadena_resta, 
                    tabla, 
                    contador,
                    operacion);
            contador = contador + 1;
            
            
        }
        cadena = String.format("Tabla de sumar\n%s\n"
                + "Tabla de restar \n%s\n"
                + "Tabla de multiplicar\n%s\n", cadena_suma, cadena_resta, cadena );
        System.out.printf("%s\n%s\n%s\n", cadena);
        
    }
}