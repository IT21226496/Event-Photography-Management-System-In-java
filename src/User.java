import java.util.Scanner;

public abstract class User {
    protected String userID;
    protected String userFname;
    protected String userLname;
    protected String userEmail;

    public User(String userID, String userFname, String userLname, String userEmail) {
        this.userID = userID;
        this.userFname = userFname;
        this.userLname = userLname;
        this.userEmail = userEmail;
    }

    public void displayDetails() {
        System.out.println("User ID: " + userID);
        System.out.println("First Name: " + userFname);
        System.out.println("Last Name: " + userLname);
        System.out.println("Email: " + userEmail);
    }

    public abstract void login();
}