// Na linha abaixo esta importando a biblioteca (pacote) javax, o módulo swing e o componente JOptionPane
import javax.swing.JOptionPane; 

// Na linha abaixo esta sendo declarada a classe Addtion
public class Addition 
//Na linha abaixo esta sendo aberto o bloco de códigos da classe Addition

//Na linha abaixo esta sendo declarado o metodo "main" (principal) que vai executar a aplicação
{
   // Na linha abaixo esta sendo aberto o blodo de codigos do main
   public static void main(String[] args)
   {
      // Na linha abaixo esta sendo declarada o tipo da variavel, onde tem operador de atribuição tem declaração de varial
      String firstNumber = 
   
         JOptionPane.showInputDialog("Digite o primeiro numero inteiro");
      String secondNumber =
          JOptionPane.showInputDialog("Digite o segundo numero inteiro");

      // convert String inputs to int values for use in a calculation

    
      int number1 = Integer.parseInt(firstNumber); 
      int number2 = Integer.parseInt(secondNumber);

      int sum = number1 + number2; // add numbers

      // display result in a JOptionPane message dialog
      JOptionPane.showMessageDialog(null, "The sum is " + sum, 
         "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
   } 
} // end class Addition


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
