
package ejercicio3_l1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author marym
 */
public class Ejercicio3_L1 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        ArrayList <Integer> numeros = new ArrayList<>();
        ArrayList <Integer> Par = new ArrayList<>();
        ArrayList <Integer> Impar = new ArrayList<>();
        int longitud, unNumero,opcionMenu,suma = 0, par=0, impar=0;
        float media = 0;
        boolean Opcion = true;
        
  
        System.out.print("Ingrese una longitud: ");
        longitud = entrada.nextInt();
        
        //Agregando los numero al ArrayList
        for (int i = 0; i < longitud; i++) {
            System.out.print("Ingrese un numero: ");
            unNumero = entrada.nextInt();
            numeros.add(unNumero);
        }
        
        while (Opcion){
            
            System.out.println("\n*********** MENU *****************");
            System.out.println("\r\n\t1.Suma\r\n\t2.Media aritmetica\r\n\t3.Numero pares e impares\r\n\t4.Mostrar lista\r\n\t5.Salir");
            System.out.print("Opcion: ");
            opcionMenu = entrada.nextInt();
            
            switch (opcionMenu){
                case 1:
                    //sumando los elementos de la lista
                    for (int i = 0; i < numeros.size(); i++) {
                        suma=suma + numeros.get(i);
                    }
                    System.out.println("suma es: " + suma);
                    break;
                    
                case 2:
                    //Media Aritmetica
                    media = suma / longitud;
                    System.out.println("Media Aritmetica= " + media);
                    break;
                    
                case 3:
                    //Calculo de pares e impares
                    for (int i = 0; i < numeros.size(); i++) {
                        if (numeros.get(i)%2 == 0){
                            par++;
                            Par.add(numeros.get(i));
                        }
                        else{
                            impar++;
                            Impar.add(numeros.get(i));
                        }
                    }
                    System.out.println("\nPares: " + par);
                    System.out.println(Par);
                    System.out.println("\nImpares: " + impar);
                    System.out.println(Impar);
                    break;
                
                case 4:
                    System.out.println("Lista: "+ numeros);
                    break;
                    
                case 5:
                    Opcion = false;
                    break;
    
            }   
        
        }
     
    }
    
}
