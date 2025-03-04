
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        String trash = "";//
        double fahrenheit = 0;

        boolean done = false;

        do
        {
            System.out.print("Enter celsius: ");
            if(in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine();
                done = true;
                fahrenheit = celsius * 1.8 + 32;
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered a invalid degree " + trash);
                System.out.println("You need to enter a new value");
            }
        }while(!done);
        System.out.println("Your fahrenheit is " + fahrenheit);
    }
}