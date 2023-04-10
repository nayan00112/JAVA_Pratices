
import java.util.Random;
import java.util.Scanner;

public class Random_StonePaperSeaser {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        System.out.println("1. Stone\n2. Paper\n3. Seaser");
        System.out.println("Enter index: ");
        int c = s.nextInt();
        if (c > 3) {
            System.out.println("Invalid choice.");
        } else {
            int rc = r.nextInt(3);

            switch (rc) {
                case 1:
                    System.out.println("Computer does Stone");
                    break;
                case 2:
                    System.out.println("Computer does Paper");
                    break;
                default:
                    System.out.println("Computer does Seaser");
            }
            if (c == 1 && rc == 3 || c == 2 && rc == 1 || c == 3 && rc == 2) {
                System.out.println("You Win!");
            } else if (c == rc) {
                System.out.println("Tie");
            } else {
                System.out.println("Computer Win!");
            }
        }
    }
}


// 1 . Output
// 1. Stone
// 2. Paper
// 3. Seaser
// Enter index:
// 5
// Invalid choice.


// 2. Output:
// 1. Stone
// 2. Paper
// 3. Seaser
// Enter index:
// 2
// Computer does Paper
// Tie

// 3. Output:
// 1. Stone
// 2. Paper
// 3. Seaser
// Enter index:
// 3
// Computer does Paper
// You Win!