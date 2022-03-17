package numerorepetidamente;

import java.util.Scanner;//permite que el usuario ingrese informacion por pantalla

public class NumeroRepetidamente {

    public static void main(String[] args) {
        
        int num,suma=0,mayor=0,menor=0;//Variables
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un número repetidamente hasta que ingrese un -1\n" +
                            "y en ese caso se terminará el programa.");
        do{//Utilizamos el ciclo do while hasta que se ingrese -1 y finaliza el ciclo
            
            System.out.println("Introducir un numero: ");
            num=sc.nextInt();
            suma=suma+num;//Sumamos los valores ingresados
            if(num==0){//guarda el menor valor
                menor=num;
            }else if(num<menor){
                menor=num;
            }
            if(num==0){//guarda el mayor valor
                mayor=num;
            }else if(num>mayor){
                mayor=num;
            }
            
        }while(num!=-1);//condicion
        System.out.println("La suma de todos los numeros es: "+suma);//Mostramos los resultados
        System.out.println("El mayor numero ingresado es: "+mayor);
        System.out.println("El menor numero ingresado es: "+menor);
    }
    
}
