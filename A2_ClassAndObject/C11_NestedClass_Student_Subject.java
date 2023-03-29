class Student {
    String name;
    String rollNum;

    class Subject {
        String subName;
        int scroe;
    }
}

public class C11_NestedClass_Student_Subject {
    public static void main(String arg[]) {

        /* ========================================================== */

        // Student : Nayan
        // Nayan Subject: Physics, Maths, English
        Student Nayan = new Student();
        Nayan.name = "Nayan";
        Nayan.rollNum = "2";

        Student.Subject Nayan_s1 = Nayan.new Subject();
        Nayan_s1.subName = "Physics";
        Nayan_s1.scroe = 98;

        Student.Subject Nayan_s2 = Nayan.new Subject();
        Nayan_s2.subName = "Maths";
        Nayan_s2.scroe = 99;

        Student.Subject Nayan_s3 = Nayan.new Subject();
        Nayan_s3.subName = "English";
        Nayan_s3.scroe = 96;

        // Student: Marmik
        // Marmik Subject: Physics, Maths
        Student Marmik = new Student();
        Marmik.name = "Marmik";
        Marmik.rollNum = "11";

        Student.Subject Marmik_s1 = Marmik.new Subject();
        Marmik_s1.subName = "Physics";
        Marmik_s1.scroe = 99;

        Student.Subject Marmik_s2 = Marmik.new Subject();
        Marmik_s2.subName = "Maths";
        Marmik_s2.scroe = 100;

        /* ========================================================== */

        // Print Nayan's Subject Data.
        System.out.println(Nayan.name);
        System.out.println("Subject name: " + Nayan_s1.subName + " And Marks: " + Nayan_s1.scroe);
        System.out.println("Subject name: " + Nayan_s2.subName + " And Marks: " + Nayan_s2.scroe);
        System.out.println("Subject name: " + Nayan_s3.subName + " And Marks: " + Nayan_s3.scroe);

        // print Marmik's dSubject ata:
        System.out.println(Marmik.name);
        System.out.println("Subject name: " + Marmik_s1.subName + " And Marks: " + Marmik_s1.scroe);
        System.out.println("Subject name: " + Marmik_s2.subName + " And Marks: " + Marmik_s2.scroe);

        /* ========================================================== */

    }
}

// Output:
// Nayan
// Subject name: Physics And Marks: 98
// Subject name: Maths And Marks: 99
// Subject name: English And Marks: 96
// Marmik
// Subject name: Physics And Marks: 99
// Subject name: Maths And Marks: 100