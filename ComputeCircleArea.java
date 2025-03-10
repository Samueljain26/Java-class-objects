import java.util.*;

// Circle class with radius attribute
class Circle {
    double radius;

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display area and circumference
    void display() {
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}

class ComputeCircleArea {
    // Main method which takes input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating a Circle object
        Circle circle = new Circle();

        System.out.print("Enter the radius: ");
        circle.radius = sc.nextDouble();

        // Calling the display method to print output
        circle.display();
    }
}
/*Enter the radius: 3
Area: 28.274333882308138
Circumference: 18.84955592153876*/