abstract class Write {
    public abstract void WriteOnPaper();
}

class Pen extends Write {
    public void WriteOnPaper() {
        System.out.println("Hello, I am always ready to Write!");
        System.out.println("-Pen");
    }
}

class Pencil extends Write {
    public void WriteOnPaper() {
        System.out.println("Hello, I am always ready to Write!");
        System.out.println("-Pencil");
    }
}

public class C33_AbstractClassExample {
    public static void main(String arg[]) {
        Write obj1 = new Pencil();
        obj1.WriteOnPaper();
    }
}

// Outpit:
// Hello, I am always ready to Write!
// -Pencil