import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud>
{
    int rollno, marks;
    String name;

    public Stud(int rollno, int marks, String name) {
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Stud [ rollnumber = " + rollno + ", marks = " + marks + ", name = " + name + "]";
    }

    // Sort by marks...
    // public int compareTo(Stud s){
    //     return marks > s.marks? 1:-1;
    // }

    // Sort by length of name
    public int compareTo(Stud s){
        return name.length() > s.name.length()? 1:-1;
    }
}

public class C96_Comparatable_Interface {
    public static void main(String arg[]) {
        List<Stud> studs = new ArrayList<>();
        studs.add(new Stud(23, 87, "Raju"));
        studs.add(new Stud(53, 86, "Ketan"));
        studs.add(new Stud(63, 95, "Mayur"));
        studs.add(new Stud(13, 69, "Manaoj"));

        Collections.sort(studs, (i, j)-> i.marks>j.marks?1:-1);

        for (Stud s : studs) {
            System.out.println(s);
        }
    }
}

// Output:
// Stud [ rollnumber = 13, marks = 69, name = Manaoj]
// Stud [ rollnumber = 53, marks = 86, name = Ketan]
// Stud [ rollnumber = 23, marks = 87, name = Raju]
// Stud [ rollnumber = 63, marks = 95, name = Mayur]
