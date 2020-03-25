import javax.swing.JOptionPane;

public class Aula03Ex3 {
   public static void main (String arg[]){
      int n1;
      n1 = Integer.parseInt(JOptionPane.showInputDialog ("digite numero:"));
      
      if (n1 >= 0 ){
         JOptionPane.showMessageDialog (null, "numero e positivo " + Math.sqrt (n1));
      }
      else{
         n1 = n1 * n1;
         JOptionPane.showMessageDialog (null, "numero e negativo " + n1);
      }      
   }
}