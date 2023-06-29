import java.util.Scanner;

public class Photographer {
    private static String username;

    public Photographer(String username) {
        this.username = username;

    }


    public static void displayPhotographerDetails(String photographerName) {
        switch (photographerName) {
            case "kasun":
                System.out.println("Name: Kasun kanishka");
                System.out.println("Category: Wedding,  Birthday, Conference");
                System.out.println("Experience: 5 years");
                System.out.println("Contact number: +94 74123456");
                System.out.println("Email: kasun@gmail.com");
                break;
            case "supun":
                System.out.println("Name: Supun Madhuranga");
                System.out.println("Category: Portrait, Wedding, Graduation");
                System.out.println("Experience: 8 years");
                System.out.println("Contact number: +94 77123456");
                System.out.println("Email: supun@gmail.com");
                break;
            case "prabhath":
                System.out.println("Name: Prabhath Jayasinghe");
                System.out.println("Specialization: All sort of functions");
                System.out.println("Experience: 10 years");
                System.out.println("Contact number: +94 71123456");
                System.out.println("Email: praba@gmail.com");
                break;
            default:
                System.out.println("Photographer not found.");
                break;
        }
    }
}