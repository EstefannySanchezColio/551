package excepcion10;

public class Excepcion10 {

    public static void main(String[] args) {
         try {
            int numerator = 10;
            Object denominator = "2"; // Esto generará una ClassCastException
            
            int result = numerator / (int) denominator;
            System.out.println("El resultado de la división es: " + result);
        } catch (ClassCastException ex) {
            System.out.println("Se produjo una ClassCastException: " + ex.getMessage());
        }
    }
}
