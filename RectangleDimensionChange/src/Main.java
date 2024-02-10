import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        Integer length = scanner.nextInt();
        System.out.println("Enter the width of the rectangle");
        Integer width = scanner.nextInt();

        Rectangle rectangle = new Rectangle(length, width);
        rectangle.display();
        System.out.println("Area of the Rectangle:"+rectangle.area());

        System.out.println("Enter the new dimension");
        Integer newDimension = scanner.nextInt();
        scanner.close();

        Rectangle newRectangle = rectangle.dimensionChange(newDimension);
        if(newRectangle instanceof Rectangle){
            newRectangle.display();
            System.out.println("Area of the Rectangle:"+newRectangle.area());

        }
    }
}
