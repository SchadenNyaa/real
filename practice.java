import java.util.*;

public class practice{
    public static void main(String[]args){
        Scanner user = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String name = user.nextLine();
        System.out.println("Hi! I'm " + name + ", & this is my excercise #5." + "\n");


        System.out.println("TEMPERATURE CONVERTER" + "\n");
        System.out.println("[1] Celsius to Fahrenheit");
        System.out.println("[2]Fahrenheit to Celsius" + "\n");
        System.out.println("Input your choice: ");
        int convert = user.nextInt();

        switch (convert){
            case 1:
                System.out.println("\nYou chose Celsius to Fahrenheit \n ");
                System.out.println("Enter temperature in Celsius: ");
                double celsius = user.nextDouble();
                double fahrenheitResult = TempConverter.celsius_Fahrenheit(celsius);
                System.out.println("Celsius to Fahrenheit: " + fahrenheitResult );
                break;
            case 2: 
                System.out.println("\nYou chose Fahrenheit to Celsius \n ");
                System.out.println("Enter temperature in Fahrenheit: ");
                double fahrenheit = user.nextDouble();
                double celsiusResult = TempConverter.fahrenheit_Celsius(fahrenheit);
                System.out.println("Fahrenheit to Celsius: " + celsiusResult);
                break;
            default:
                System.out.println("Invalid option. Please type either [1] or [2]");
                break;
        }
        user.close();
    }
}


class TempConverter {
    public static double celsius_Fahrenheit(double celsius) {
        return (9.0/5) * celsius + 32;
    }
    public static double fahrenheit_Celsius(double fahrenheit){
        return (5.0/9) *(fahrenheit - 32);
    }
}
