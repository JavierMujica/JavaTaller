/* Realizar un programa que permita leer una frase y dos valores nunericos no mayor a la cantidad de caracteres de la frase y determine:
A) La frase en mayuscula sin modificar la frase 
B) La frase en minuscula sin modificar la frase 
C) Invertir mayusculas por minusculas y viceversa 
D) Mostrar los caracteres desde el menor valor hasta el mayor valor ingresado 
E) Intercambiar los caracteres de la primera posicion ingresada por la siguiente ingresada */

import java.util.Scanner;

public class leeroracion {
    public static void main(String[] args) {

        String oracion;
        char char1, char2;
        int num1, num2, l, i, aux;   
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa una oración:");
        oracion = scanner.nextLine();
        System.out.println("digite el primer numero: ");
        num1 = scanner.nextInt();
        System.out.println("digite el segundo numero: ");
        num2 = scanner.nextInt();
        l = oracion.length();

        System.out.println("\nLa frase en mayusculas quedaria de la sigiente forma: ");
        for(i=0; i<l; i++){
            if(oracion.charAt(i)>='a' && oracion.charAt(i)<='z'){
                System.out.print((char)((int)oracion.charAt(i)-32));
            }else{
                System.out.print(oracion.charAt(i));
            }
        }

        System.out.println("\nLa frase en minuscula quedaria de la sigiente forma: ");
        for(i=0; i<l; i++){
            if(oracion.charAt(i)>='A' && oracion.charAt(i)<='Z'){
                System.out.print((char)((int)oracion.charAt(i)+32));
            }else{
                System.out.print(oracion.charAt(i));
            }
        }

        System.out.println("\nLa frase invertida quedaria de la sigiente forma: ");
        for(i=0; i<l; i++){
            if(oracion.charAt(i)>='A' && oracion.charAt(i)<='Z'){
                System.out.print((char)((int)oracion.charAt(i)+32));
            }else{
                if(oracion.charAt(i)==' '){
                    System.out.print(" ");
                }else{
                    System.out.print((char)((int)oracion.charAt(i)-32));
                }
            }
        }

        if(num1>num2){
            aux=num1;
            num1=num2;
            num2=aux;
        }
        System.out.println("\nLa frase desde la posicion "+num1+" hasta la "+num2+" es: ");
        for(i=num1; i<=num2; i++){
            System.out.print(oracion.charAt(i));
        }

        System.out.println("\nEl intercambio de posiciones queda: ");
        char1=oracion.charAt(1);
        char2=oracion.charAt(2);
        for(i=0; i<l; i++){
            if (oracion.charAt(i)==char1){
                System.out.print(char2);
            }else{
                if (oracion.charAt(i)==char2) {
                    System.out.print(char1);
                }else{
                    System.out.print(oracion.charAt(i));
                }
            }
        }

        scanner.close();
    }
}
