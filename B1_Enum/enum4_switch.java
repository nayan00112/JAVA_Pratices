enum Status {
    Panding, Running, Stop, Success;
}

public class enum4_switch {
    public static void main(String[] args) {

        Status s = Status.Panding;

        switch (s) {
            case Panding:
                System.out.println("Panding state");
                break;
            case Running:
                System.out.println("Running state");
                break;
            case Stop:
                System.out.println("Stop state");
                break;
            case Success:
                System.out.println("Success state");
                break;
            default:
                System.out.println("Nothing...");
                break;
        }
    }
}

// Output:
// Panding state