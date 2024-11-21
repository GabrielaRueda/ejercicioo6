//import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio6_Gabriela {
    public static void main(String[] args) {
        //Scanner a=new Scanner(System.in);
        
      short N;
      N=Short.parseShort(JOptionPane.showInputDialog("Favor de ingresar un numero: "));
      //System.out.println("Favor de ingresar un numero: ");
      //N=a.nextShort();
      
      if (N % 2 == 0){
          JOptionPane.showMessageDialog(null,"El numero " + N +  " es par. ");
          //System.out.println("El numero " + N +  " es par. ");
    } else {
          JOptionPane.showMessageDialog(null,"El numero " + N +  " es impar. ");
          //System.out.println("El numero " + N + " es impar. ");
      }
}
}