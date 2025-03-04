import java.util.Scanner;
public class New {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width;
        double height;

        do {
            System.out.print("Enter the width of  rectangle: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
            width = scanner.nextDouble();
        } while ( width<= 0);

        do{
            System.out.print("Enter the height of  rectangle: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
            height = scanner.nextDouble();
        } while ( height<= 0);


        double area = (width*height);
        double perimeter = 2*(width+height);
        double lengthofdiagnol=((width*width)+(height*height));


        System.out.printf ("The height of the rectangle is: %f%n ", height);
        System.out.printf("The width of the rectangle is: %f%n ", width);
        System.out.printf("The area of the rectangle is: %f%n ", area);
        System.out.printf("The perimeter of the rectangle is: %f%n ", perimeter);
        System.out.printf("The length of the diagnol of the rectangle is: %f%n ", lengthofdiagnol);

        scanner.close();
    }
}