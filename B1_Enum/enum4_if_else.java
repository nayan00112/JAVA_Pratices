package B1_Enum;

enum Status {
    Panding, Running, Stop, Success;
}

public class enum4_if_else {
    public static void main(String[] args) {

        Status s = Status.Running;

        if (s == Status.Panding) {
            System.out.println("It is panding");
        } else if (s == Status.Running) {
            System.out.println("It is in running state.");
        } else if (s == Status.Stop) {
            System.out.println("It is stoped.");
        } else if (s == Status.Success) {
            System.out.println("Success the process.");
        } else {
            System.out.println("Nothing :)");
        }
    }
}

// Output:
// It is in running state.