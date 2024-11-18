
import java.util.Scanner;

public class FirstAssignment {
    private String model;
    private String make;
    private int price; 
    
public FirstAssignment(String model, String make, int price) {
    this.model = model;
    this.make = make;
    this.price = price;
}

public void displayDetails (){
    String modelShow= "Model = ";
    String makeShow= "Make = ";
    System.out.println(modelShow + model);
    System.out.println(makeShow + make);
    System.out.println("price = " + price);
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
     // First car details
     System.out.println("Enter details for first car (Model, Make, Price):");
     FirstAssignment pv = new FirstAssignment(scanner.nextLine(), scanner.nextLine(), scanner.nextInt());
     scanner.nextLine(); // Consume leftover newline
     pv.displayDetails();

     // Second car details
     System.out.println("Enter details for second car (Model, Make, Price):");
     FirstAssignment pv2 = new FirstAssignment(scanner.nextLine(), scanner.nextLine(), scanner.nextInt());
     scanner.nextLine(); // Consume leftover newline
     pv2.displayDetails();

     // Third car details
     System.out.println("Enter details for third car (Model, Make, Price):");
     FirstAssignment pv3 = new FirstAssignment(scanner.nextLine(), scanner.nextLine(), scanner.nextInt());
     scanner.nextLine(); // Consume leftover newline
     pv3.displayDetails();
        System.out.println("average price is = " + (pv.price + pv2.price + pv3.price/3.0));
}
}

