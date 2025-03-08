import java.util.*;
//employee class which has the objects
class Employee {
    String name;
    int id;
    double salary;
//method to display
    void display() {
        System.out.println("name: " + name);
        System.out.println("id: " + id);
        System.out.println("salary: " + salary);
    }
}
class DisplayEmpDetail{
    //main method which takes input
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //getting variable types from employee class
        Employee emp =new Employee();
        System.out.print("Enter the name: ");
        emp.name = sc.nextLine();
        System.out.print("Enter the ID: ");
        emp.id = sc.nextInt();
        System.out.print("Enter the salary: ");
        emp.salary = sc.nextDouble();
        //calling the display method to print output
        emp.display();
    }
}
/*Enter the name: Sam
Enter the ID: 12
Enter the salary: 1000.45
name: Sam
id: 12
salary: 1000.45 */