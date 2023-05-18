package prueba;
import java.util.Scanner;
public class Prueba {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        boolean seguir = true;
        while (seguir) {
            System.out.print("Ingresa un número: ");
            int num = input.nextInt();
    
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("trifiv");
            } else if (num % 3 == 0) {
                System.out.println("tri");
            } else if (num % 5 == 0) {
                System.out.println("fiv");
            } else {
                System.out.println("El número no es múltiplo de 3 ni de 5");
            }
            
            System.out.print("¿Quieres ingresar otro número? (s/n): ");
            String respuesta = input.next();
            if (respuesta.equals("n")) {
                seguir = false;
            }
        }
    }
}
