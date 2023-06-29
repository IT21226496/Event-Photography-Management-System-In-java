import java.util.Scanner;
public class Package {
    static String packageID;
    private static String packageName;
    static String packageType;
    private static String packagePrice;

    public Package(String packageID, String packageName, String packageType, String packagePrice) {
        this.packageID = packageID;
        this.packageName = packageName;
        this.packageType = packageType;
        this.packagePrice = packagePrice;
    }

    public static void displayGuestPacDetails() {
        System.out.println("Package Details:");
        System.out.print("\n");
        System.out.println("Package ID: Wedding");
        System.out.println("Package Name: Basic");
        System.out.println("Package Type: Silver");
        System.out.println("Package Price: Deluxe");

        System.out.print("\n");

        System.out.println("Package ID: Birthday");
        System.out.println("Package Name: Bronze");
        System.out.println("Package Type: Gold");
        System.out.println("Package Price: Platinum");
    }

    public static void selectPac(String eventType) {
        if (eventType.equalsIgnoreCase("Wedding")) {
            System.out.println("Select a wedding package:");
            System.out.println("1. Basic Package");
            System.out.println("2. Silver Package");
            System.out.println("3. Deluxe Package");

            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    Package basicPackage = new Package("001", "Basic Package", "Wedding", "Rs 250 000");
                    System.out.println("You have selected the Basic Wedding Package");
                    System.out.println("4 hours of Wedding Day Coverage\n" +
                            "1 Photographer\n" +
                            "Online Gallery to view and order prints\n" +
                            "DVD with high resolution pictures");
                    break;
                case 2:
                    Package silverPackage = new Package("002", "Silver Package", "Wedding", "Rs 350 000");
                    System.out.println("You have selected the Silver Wedding Package");
                    System.out.println("6 hours of Wedding Day Coverage\n" +
                            "1 Photographer with assistant\n" +
                            "Online Gallery to view and order prints\n" +
                            "DVD with high resolution pictures\n" +
                            "Costume wedding guest album\n" +
                            "8x8 Costume wedding album");
                    break;
                case 3:
                    Package deluxePackage = new Package("003", "Deluxe Package", "Wedding", "Rs 550 000");
                    System.out.println("You have selected the Deluxe Wedding Package");
                    System.out.println(" full Wedding Day Coverage\n" +
                            "1 Photographer with 2 assistants\n" +
                            "Photo CD with all Wedding/Engagement images\n" +
                            "Online Gallery to view and order prints\n" +
                            "16x20 Canvas of favourite photo\n" +
                            "12x12Photo Album (10 pages - 20 sides)\n" +
                            "Costume wedding guest album\n" +
                            "8x8 Parent album\n" +
                            "DVD with high resolution pictures");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } else if (eventType.equalsIgnoreCase("Birthday")) {
            System.out.println("Select a birthday package:");
            System.out.println("1. Bronze Package");
            System.out.println("2. Gold Package");
            System.out.println("3. Platinum Package");

            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    Package basicPackage = new Package("101", "Bronze Package", "Birthday", "Rs 25 000");
                    System.out.println("You have selected the Bronze Birthday Package");
                    System.out.println(" 3 hours of Birthday Coverage\n" +
                            "1 Photographer \n" +
                            "Photo CD with all Wedding/Engagement images\n");
                    break;
                case 2:
                    Package silverPackage = new Package("102", "Gold Package", "Birthday", "Rs 35 000");
                    System.out.println("You have selected the Gold Birthday Package");
                    System.out.println(" 4 hours of Birthday Coverage\n" +
                            "1 Photographer & 1 Videographer \n" +
                            "Photo CD with all Wedding/Engagement images\n"+
                            "Highlights video" );
                    break;
                case 3:
                    Package deluxePackage = new Package("103", "Platinum Package", "Birthday", "Rs 45 000");
                    System.out.println("You have selected the Platinum Birthday Package");
                    System.out.println(" Full day Birthday Coverage\n" +
                            "1 Photographer & 1 Videographer \n" +
                            "Photo CD with all Wedding/Engagement images\n"+
                            "Highlights video\n"+
                            "Additional camera\n");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } else {
            System.out.println("Invalid event type");
        }
    }
    public static void displayPacDetails() {
        System.out.println("Package Details:");
        System.out.print("\n");
        System.out.println("Package ID:" +packageID);
        System.out.println("Package Name: " +packageName);
        System.out.println("Package Type: "+packageType);
        System.out.println("Package Price: " +packagePrice);

    }

}