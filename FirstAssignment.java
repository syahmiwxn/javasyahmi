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
    String modelShow= "Model";
    String makeShow= "Make";
    System.out.println(modelShow + model);
    System.out.println(makeShow + make);
    System.out.println("price" + price);
}

public static void main(String[] args) {
    FirstAssignment pv = new FirstAssignment("Saga", "Proton", 50000);
        pv.displayDetails();
    }
}

