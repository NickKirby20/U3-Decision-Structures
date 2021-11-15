import java.util.Scanner;
import javax.swing.*;

public class AddORMultiply {

    public static void main(String[] args) {

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter a number"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter another number"));

        if(num1 > num2){
            mult(num1, num2);
        }

        if(num1 < num2){
            add(num1, num2);
        }
    }

    public static void add( double num1, double num2){
        double sum = num1 + num2;

        JOptionPane.showMessageDialog(null," The sum is " + sum);
    }

    public static void mult(double num1, double num2){

        double product = num1 * num2;
        JOptionPane.showMessageDialog(null, " The product is " + product);
    }

   /* public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        System.out.println("Enter a number");
         double num1 = read.nextDouble();
        System.out.println("Enter another number");
         double num2 = read.nextDouble();
         if(num1 > num2){
             add(num1,num2);
         }
         if(num1< num2){
             mult(num1,num2);
         }
    }
    public static void add(String[] args) {
    }
    public static void mult(String[] args) {
    }
    public static void main(String[] args) {
        double numInput = Double.parseDouble(JOptionPane.showInputDialog("Please Enter a Number:"));
    }*/
}
    /*
    Write two methods, one that adds two numbers and second that multiplies them.
    Then, write a main method that prompts the user to enter 2 numbers.

    If the first one is larger than the second, mutiply and display the result
    If not, add them and display the results.
     */

   /* public static void multiply(){

        Scanner read = new Scanner(System.in);

        System.out.println("First number to multiply: ");
        int money = read.nextInt();

        System.out.println("Second number to multiply: ");
        int money2 = read.nextInt();

        int equal = money + money2;*/