import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string :");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string :");
        String str2 = scanner.nextLine();
        scanner.close();
        StringMethods stringMethods = new StringMethods(str1);
        StringMethods stringMethods2 = new StringMethods(str2);

        stringMethods.subString();
        System.out.println("The character at 3rd position in the second string is : "+stringMethods2.charAt(3));
        System.out.println("Are string 1 and string 2 equal? : "+stringMethods.equalsIgnoreCase(stringMethods2));
        stringMethods.concat(stringMethods2);
    }
}
