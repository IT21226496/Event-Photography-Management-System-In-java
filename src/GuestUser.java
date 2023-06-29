import java.util.Scanner;

public class GuestUser extends User {
    public GuestUser(String userID, String userFname, String userLname, String userEmail) {
        super(userID, userFname, userLname, userEmail);
    }

    public static void registerUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Creating a new guest user...");
        System.out.print("Enter your Inetials : ");
        String userID = input.nextLine();
        System.out.print("Enter first name: ");
        String userFname = input.nextLine();
        System.out.print("Enter last name: ");
        String userLname = input.nextLine();
        System.out.print("Enter email: ");
        String userEmail = input.nextLine();

        GuestUser guestUser = new GuestUser(userID, userFname, userLname, userEmail);
        guestUser.displayDetails();
    }

    @Override
    public void login() {
        System.out.println("Guest users cannot login.");
    }
}