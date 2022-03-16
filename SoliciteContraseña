package solicitecontraseña;
import java.util.Scanner; //permite que el usuario ingrese informacion por pantalla

public class SoliciteContraseña {
    
    public static boolean esSegura(String contrasenia){//Funcion que valida si la contrasenia es Segura o no
        //nos va a devolver un valor booleano, verificando la longitud, las letras mayusculas y numeros de la contrasenia
        //La Funcion recibe un String como parametro
        if(contrasenia.length()>8){// verifica la condicion de que la contrasenia tenga mas de 8 caracteres
            //contrasenia.length() nos dice el largo de la cadena de caracteres de la contrasenia
            //Variables:
            boolean mayuscula=false;
            boolean numero = false;
            char c;
            
            for(int i=0;i<contrasenia.length();i++){//Ciclo for: Va a recorrer toda la cadena de caracateres de la contrasenia
                c = contrasenia.charAt(i);//Creamos una variable y le asignamos el valor en la posicion i de la cadena de caracteres
                if(Character.isDigit(c)){//Verificamos si el caracter es un numero
                    numero = true;}
                if(Character.isUpperCase(c)){//Verificamos si esa letra es mayuscula
                    mayuscula = true;}
            }
            
            if(numero && mayuscula){//Verificamos si se cumpplen las dos condiciones
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
        
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String usuario, contrasenia;//variables
        
        System.out.print("Ingresesu usuario: ");
        usuario = input.nextLine();
        
        System.out.println("Ingrese su contrasenia: ");
        contrasenia = input.nextLine();
        System.out.println("Su contrasenia es: "+contrasenia);
        
        if(esSegura(contrasenia)){//hacemos una validacion, llamamos a la funcion y le  pasamos la contrasenia y decimos si la contrasenia es segura o no
            System.out.println("La contrasenia es Segura!");
        }
        else{
            System.out.println("La contrasenia NO es Segura!");
        }   
    }
}
