package codigosecreto;

import java.util.Scanner;//permite que el usuario ingrese informacion por pantalla

public class CodigoSecreto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = (int) ((Math.random() * 1000)+1); // Número aleatorio de 1 a 100.
        int b; // Número introducido por el usuario.
        int i; // Contador para bucle for.
        
        System.out.println("El juego consiste en adivinar el numero que escogio el ordnador");
        System.out.println("Para ello, debe introducir un número comprendido entre 0 y 1000.");
        System.out.println("El juego finaliza cuando adivina el numero");
        
        
        for (i=0; i<=100000; i++) { 

        // Primero se evalúa si se ha acertado.
        System.out.println("Ingrese un numero: ");
        b = sc.nextInt();
        if (a == b) {  
        System.out.println("¡Has acertado!"); 
        break; } 
    
    // Si no es el caso anterior, comparamos números y decimos si es mayor o menor el numero ingresado
    
    else if (a > b) 
      System.out.println("El número secreto es MAYOR que " + b);
    else if (a < b)
      System.out.println("El número secreto es MENOR que " + b);
        }
    }
    
}
