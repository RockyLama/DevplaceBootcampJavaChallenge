#include <stdio.h>
#include <stdlib.h>

void main()
{
    // Se definen las variables que se quieren utilizar
    // para realizar los calculos
    float valor_hora = 0.0;
    char nombre[20];
    int horas_trabajadas = 0;
    int antiguedad = 0;
    float salario = 0.0;
    float salario_total = 0.0;


    // Solicitud de datos
    printf("Ingrese el valor de la Hora: ");
    scanf(" %g",&valor_hora);
    printf("Ingrese el nombre del empleado: ");
    scanf(" %s",&nombre);
    printf("Ingrese la Antiguedad del empleado: ");
    scanf(" %d",&antiguedad);
    printf("Ingrese las horas Trabajadas en el mes: ");
    scanf(" %d",&horas_trabajadas);

    // Realizar calculos matematicos
    salario = horas_trabajadas * valor_hora;
    if(antiguedad>10){
        salario_total = antiguedad*30;
    }
    salario_total += salario;

    // Visualización de resultados
    fflush(stdin);
    printf("-------------------------------------------------------\n");
    printf("Nombre: %s\n",nombre);
    printf("Tiene %d anios de Antiguedad\n",antiguedad);
    printf("El total a cobrar que le corresponde a %s es: %g\n",nombre,salario_total);
    printf("-------------------------------------------------------\n");


}
