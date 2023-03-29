// Static Keywords
// Static keyword are same for all the objects.
// Non- Static  variables are different for all object.
// Cannot use "non-stattic variable" in "static" block.

class Compney {
    static String ceo;
    String emp_name;
    int salary;

    public void show() {
        System.out.println("Ceo is " + ceo);
        System.out.println("Employee name is " + emp_name);
        System.out.println("Salary is " + salary);
        System.out.println(); // for new line
    }
}

public class C09_StaticDemo {
    public static void main(String arg[]) {

        Compney e1 = new Compney();
        Compney e2 = new Compney();

        // e1.ceo = "Sundar";
        Compney.ceo = "Sunder";
        e1.emp_name = "Chhagan";
        e1.salary = 9_00_000;

        // e2.ceo = "Sundar";
        e2.emp_name = "Magan";
        e2.salary = 10_00_000;

        e1.show();
        e2.show();

        // e2.ceo = "Nayan";
        Compney.ceo = "Nayan"; // We direct use eith class name is it static keyword
        e1.show();
        e2.show();  
    }
}

// Two employees(emp1 and emp2) have same compley ceo. if We change ceo for emp1 then also must change for emp2.
// Hear it is not possible if we not use static keyword. we use static keyword for compney ceo. 