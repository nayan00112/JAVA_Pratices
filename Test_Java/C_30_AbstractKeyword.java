class Employee {
    public Employee() // Constructor
    {
        System.out.println("Constructor: Hello Employee!!!");
    }
    public void Employee() // Method // I think this is not a good pratics to same name of method as constructor name (class name).
    {
        System.out.println("Method: Hello Employee!!!");
    }
}

public class C_30_AbstractKeyword {
    public static void main(String arg[]) {
        Employee e1 = new Employee();
        e1.Employee();
    }
}

// Output:
// Constructor: Hello Employee!!!
// Method: Hello Employee!!!

