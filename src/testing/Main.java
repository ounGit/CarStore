package testing;
import java.util.Scanner;

class Car {
	
    String model;
    String color;
    int year;
    String brand;
    
    public Car(String color, String model, int year, String brand) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.brand = brand;
    }

    public void displayInfo() {
        System.out.println("||================Car Details================|| ");
        System.out.println("Brand: " + model );
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Brand: " + brand);
        System.out.println("||==================(- -)==================|| ");
    }

    public void start() {
        System.out.println("Starting the " + brand  + " " + model + "...");
    }

    public void accelerate() {
        System.out.println("Accelerate the " + brand + " " + model + "...");
    }

    public void stop() {
        System.out.println("Stopping the " + brand + " " + model + "...");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Model: ");
        String model = sc.nextLine();
        System.out.print("Enter Color: ");
        String color = sc.nextLine();
        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        
        // Consume the leftover newline character
//        sc.nextLine();
        
        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();
        
        Car myCar = new Car(color, model, year, brand);
        myCar.displayInfo();
        myCar.start();
        myCar.accelerate();
        myCar.stop();
    }
}
