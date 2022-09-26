import java.util.Scanner;


public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = (5.0/9)*(fahrenheit-32);
        System.out.println("Fahrenheit " + fahrenheit + " is " + celsius
        + " in Celsius.");
    }
}
/* Output:
Enter a degree in Fahrenheit: 40
Fahrenheit 40.0 is 4.444444444444445 in Celsius.

 */