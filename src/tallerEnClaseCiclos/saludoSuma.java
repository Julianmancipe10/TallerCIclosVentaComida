package tallerEnClaseCiclos;
import java.util.Scanner;
public class saludoSuma {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir la cantidad de veces que se repetirá el proceso
        System.out.println("Ingrese la cantidad de veces que desea realizar el proceso: ");
        int veces = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        
        // Ciclo for para repetir el proceso 'veces' veces
        for (int i = 0; i < veces; i++) {
            // Pedir al usuario que ingrese el código
            System.out.println("Ingrese el código (1 para saludar, 2 para pedir nombre, 3 para sumar dos números): ");
            int codigo = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            
            // Realizar la acción correspondiente según el código ingresado
            switch (codigo) {
                case 1:
                    System.out.println("¡Hola! Bienvenido.");
                    break;
                case 2:
                    System.out.println("Por favor, ingrese su nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Hola, " + nombre);
                    break;
                case 3:
         
                	System.out.println("Ingrese el primer número: ");
                    int num1 = scanner.nextInt();
                    System.out.println("Ingrese el segundo número: ");
                    int num2 = scanner.nextInt();
                    int suma = num1 + num2;
                    System.out.println("La suma de los números es: " + suma);
                    break;
                default:
                    System.out.println("Código inválido. Inténtelo de nuevo.");
                    break;
            }
        }
    }
}

