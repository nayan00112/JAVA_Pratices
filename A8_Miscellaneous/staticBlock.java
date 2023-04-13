public class staticBlock {
    static {
        System.out.println("Hello Static Above");
    }

    public static void main(String[] args) {
        System.out.println("Hello Main");

    }

    static {
        System.out.println("Hello Static Below");
    }
}
// Output:
// Hello Static Above
// Hello Static Below
// Hello Main