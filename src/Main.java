import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Dream Art Photography!!!!");
        System.out.println("Since 2001, thousands of diverse clients have trusted us to provide corporate photography and video services nationwide.\n " +
                "Our breadth and depth of experience has allowed us to provide personalized and scalable solutions for Event Planners," +
                " Event Marketers and PR & Marketing Professionals.\n " +
                "Dream art is a values-driven agency committed to creating a positive impact for employees, partners and communities.\n" +
                " Through our Giving Back program, we work with nonprofits to highlight the critical work they do.\n " +
                "Similarly, we love working with other conscious companies/B Corps to leverage business as a platform of positive transformation.");

        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Welcome to the User Management System!");

        System.out.println("Are you already a registered user? (y/n)");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("y")) {
            System.out.println("Please log in to continue");
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            RegisteredUser user = new RegisteredUser("1234", "Ann", "Costa", "ann2001@gmail.com", username, password);
            user.login();
            user.displayDetails();

            //end login
            System.out.println("");

            //start photographer

            System.out.println("Welcome to the Photographer Database!");
            System.out.print("Select photographer name you wish to see details: \n Kasun\t Supun \t Prabhath \n");
            String photographerUsername = scanner.nextLine();

            switch (photographerUsername) {
                case "kasun":
                    Photographer.displayPhotographerDetails("kasun");
                    break;
                case "supun":
                    Photographer.displayPhotographerDetails("supun");
                    break;
                case "prabhath":
                    Photographer.displayPhotographerDetails("prabhath");
                    break;
                default:
                    System.out.println("Invalid photographer username.");
            }
            //end photographer
            System.out.println("");

            //Getting the event date from the user
            System.out.print("Enter date of the event (MM/dd): ");
            String DateEventString = scanner.nextLine();
            Date DateEvent;
            try {
                DateEvent = new SimpleDateFormat("MM/dd").parse(DateEventString);
            } catch (ParseException e) {
                System.out.println("Invalid date format, using current date.");
                DateEvent = new Date();
            }
            //end date

            // create an order object
            Order order = new Order("001");

            // select a package for the order
            System.out.println("Select an event type:");
            System.out.println("1. Wedding");
            System.out.println("2. Birthday");

            Scanner input = new Scanner(System.in);
            int eventType = input.nextInt();

            switch (eventType) {
                case 1:
                    Package.selectPac("Wedding");
                    break;
                case 2:
                    Package.selectPac("Birthday");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("");

            // display the package details for the order
            order.displayOrderDetails();
            //end order
            System.out.println("");

            // payment page start

            System.out.println("Welcome to payment page");
            System.out.print("Enter card type\n *Visa \t *Master card \t *American Express \t *Discovery: ");
            String cardType = scanner.nextLine();

            System.out.print("Enter card number: ");
            String cardNumber = scanner.nextLine();

            System.out.print("Enter card name: ");
            String cardName = scanner.nextLine();

            System.out.print("Enter expiration date (MM/yyyy): ");
            String expireString = scanner.nextLine();
            Date expire;
            try {
                expire = new SimpleDateFormat("MM/yyyy").parse(expireString);
            } catch (ParseException e) {
                System.out.println("Invalid date format, using current date.");
                expire = new Date();
            }

            System.out.print("Enter CVV (enter 3 digit code): ");
            int cvv = scanner.nextInt();

            Payment payment = new Payment(cardNumber, cardType, cardName, expire, cvv);

            System.out.println("Payment details before processing:");
            payment.displayPaymentDetails();

            // Process payment
            payment.payment();

            System.out.println("Payment details after processing:");
            payment.displayPaymentDetails();
            System.out.println("Thank you for getting our service, we will contact you via your email..");
            //payment page end
            System.out.println("");

            //start feedback

            Feedback feedback = Feedback.submitFeedback();
            feedback.displayFeedback();
            //end feedback

        } else {
            System.out.println("You can only view the available packages as a guest user.");
            GuestUser.registerUser();

            System.out.println("Available packages:");
            Package.displayGuestPacDetails();

            // End the program
            System.out.println("\nThank you for using the User Management System!");
            System.exit(0);
        }
        //end user
    }

}