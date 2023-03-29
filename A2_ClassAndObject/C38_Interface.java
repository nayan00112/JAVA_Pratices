/*
 * Muiltiple interfaces and implements possible.
 * (We use muiltiple interface for one class.)
*/

interface Student {
    void student_show();
}

interface Teacher {
    void teacher_show();
}

class School implements Student, Teacher {
    public void student_show() {
        System.out.println("Student show info.");
    }

    public void teacher_show() {
        System.out.println("Teacher show info.");
    }

}

public class C38_Interface {
    public static void main(String arg[]) {
        School s1 = new School();
        s1.student_show();
        s1.teacher_show();
    }
}

// Output:
// Student show info.
// Teacher show info.

/*
 * Tip: Always go for interfaces if we only want to define the method.
 * (Someone can implement it.)
 * {{If we do not want to make a anyone can use our interfaces then it is
 * meaningless because what we will do to that interfaces when we can not define
 * them.}}
 */