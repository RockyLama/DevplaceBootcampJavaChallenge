package recordarcontrasenia;

import java.util.Scanner;//permite que el usuario ingrese informacion por pantalla
public class RecordarContrasenia {


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        //Variables
        String contrasenia="devplace";
        String seguir;
        Scanner teclado = new Scanner(System.in);
        
        int i,intentos=3;
        boolean coincide=false;
        
        for(i=0;i<intentos && !coincide;i++){//ciclo for con condiciones 
            System.out.println("Ingrese la contraseña: ");
            String password = sc.nextLine();
            
            if(password.equals(contrasenia)){//Verificamos si la ocntraseña ingresada coincide o no
                System.out.println("Felicitaciones,\n" +
                "recordás tu contraseña");
                coincide=true;
            }else{
                System.out.println("Tenes que\n" +
                "ejercitar la memoria");
            }
        }
        System.out.println("Precione una tecla para cerrar el programa");//finalizamos el programa
        seguir = teclado.nextLine();
    }  
}
