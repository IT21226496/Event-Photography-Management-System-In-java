import java.util.Scanner;

public class Feedback {
    private String name;
    private String email;
    private String feedback;

    public Feedback(String name, String email, String feedback) {
        this.name = name;
        this.email = email;
        this.feedback = feedback;
    }

    public static Feedback submitFeedback() {
        Scanner input = new Scanner(System.in);
        System.out.print("Are you satisfied with our service:\n If yes\n");

        System.out.println("Please fill out the form below.");

        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("Email: ");
        String email = input.nextLine();

        System.out.print("Feedback: ");
        String feedback = input.nextLine();

        Feedback newFeedback = new Feedback(name, email, feedback);
        System.out.println("Thank you for submitting your feedback!");

        return newFeedback;
    }

    public void displayFeedback() {
        System.out.println("Here is the feedback you provided. ");
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Feedback: " + this.feedback);
    }
}