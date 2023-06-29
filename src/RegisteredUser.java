import java.util.Scanner;
public class RegisteredUser extends User {
    private String username;
    private String password;

    public RegisteredUser(String userID, String userFname, String userLname, String userEmail, String username, String password) {
        super(userID, userFname, userLname, userEmail);
        this.username = username;
        this.password = password;
    }

    public void login() {
        Scanner input = new Scanner(System.in);
        System.out.print("Re-enter username and password for confirmation:\n ");
        System.out.print("Enter username: ");
        String enteredUsername = input.nextLine();
        System.out.print("Enter password: ");
        String enteredPassword = input.nextLine();

        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password. Please re-enter\n");
            while (!(enteredUsername.equals(username) && enteredPassword.equals(password))) {
                System.out.print("Enter username: ");
                enteredUsername = input.nextLine();
                System.out.print("Enter password: ");
                enteredPassword = input.nextLine();
                System.out.println("Invalid username or password. Please re-enter\n");
            }
            System.out.println("Login successful!");
        }
    }

    public void displayDetails() {
        System.out.println("User ID: " + userID);
        System.out.println("First Name: " + userFname);
        System.out.println("Last Name: " + userLname);
        System.out.println("Email: " + userEmail);
        System.out.println("Username: " + username);
    }
}