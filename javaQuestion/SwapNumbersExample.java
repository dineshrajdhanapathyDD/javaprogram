//Write a Java Program for swapping of 2 numbers.

package javaconcept.javaQuestion;

public class SwapNumbersExample {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

// Logic to swap 2 numbers.
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}



/*output :
num1 = 20
num2 = 10
 */