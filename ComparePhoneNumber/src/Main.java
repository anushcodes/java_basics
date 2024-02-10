import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String userName = scanner.nextLine();
        String password = scanner.nextLine();
        Long phoneNumber = scanner.nextLong();

        scanner.nextLine();

        String name2 = scanner.nextLine();
        String userName2 = scanner.nextLine();
        String password2 = scanner.nextLine();
        Long phoneNumber2 = scanner.nextLong();

        scanner.close();

        User user = new User(name, userName, password, phoneNumber);
        User user2 = new User(name2, userName2, password2, phoneNumber2);

        System.out.println(user.comparePhoneNumber(user2));
    }
}
