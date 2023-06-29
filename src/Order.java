import java.util.Scanner;

public class Order {
    private String orderId;
    private String customerName;
    private String eventType;
    private static Package selectedPackage;

    public Order(String orderId, String customerName, String eventType, Package selectedPackage) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.eventType = eventType;
        this.selectedPackage = selectedPackage;
    }

    public Order(String orderId) {

    }

    public static void submitOrder() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please fill out the order form below.");

        System.out.print("Order ID: ");
        String orderId = input.nextLine();

        System.out.print("Customer Name: ");
        String customerName = input.nextLine();

        System.out.print("Event Type (Wedding/Birthday): ");
        String eventType = input.nextLine();

        Package.selectPac(eventType);

        System.out.println("Thank you for submitting your order!");

        // create new order with selected package
        Order newOrder = new Order(orderId, customerName, eventType, selectedPackage);
        newOrder.displayOrderDetails();
    }

    public void displayOrderDetails() {
        System.out.println("Order Details:");
        System.out.println("Order ID: " + Package.packageID);
        System.out.println("Customer Name: Ann Costa");
        System.out.println("Event Type: " + Package.packageType);
        selectedPackage.displayPacDetails();
    }
}
