/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package textjava;
import java.util.Scanner;
/**
 *
 * @author samgomgom
 */
public class Textjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner (System.in);
 
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Concatenar dos palabras");
            System.out.println("2. Visualizar el número de palabras de una frase");
            System.out.println("3. Contar cuántas veces aparece una letra en una frase");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("cocncatenar");
                   
                    break;

                case 2:
                    System.out.print("frase: ");
                    
                    break;

                case 3:
                    System.out.print("letra ");
                    System.out.print("Ingresa una frase: ");
                    String fraseParaContar = scanner.nextLine();
                    System.out.print("Ingresa una letra: ");
                    char letra = scanner.nextLine().charAt(0);
                    int contador = 0;
                    for (char c : fraseParaContar.toCharArray()) {
                        if (c == letra) {
                            contador++;
                        }
                    }
                   
                    break;

                case 4:
                    System.out.print("¿Estás seguro de que deseas salir? (s/n): ");
                    String confirmacion = scanner.nextLine();
                    if (confirmacion.equalsIgnoreCase("s")) {
                        salir = true;
                        System.out.println("¡Hasta luego!");
                    }
                    break;

                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
                    break;
            }
        }

        scanner.close();
    }
    }
    
}
