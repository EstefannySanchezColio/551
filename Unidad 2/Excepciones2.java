package excepciones2;
import javax.swing.JOptionPane;

public class Excepciones2 {

    public static void main(String[] args) {
        int x,y;
        
        try{
            x= Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero 1;","solicito datos",3));
            y= Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero 1;","solicito datos",3));
            JOptionPane.showInternalMessageDialog(null, "la division de "+x+"/"+y+"es"+(x/y),"mostrando resultado",1);
        }catch( NumberFormatException n){
            System.out.println(n.getMessage()+" no es numero entero");
        }catch(ArithmeticException a){
            System.out.println(a.getMessage()+"no se puede dividir entre");
        }
    }
    
}
