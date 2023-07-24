import java.util.Scanner;
import java.util.Stack;

public class C04_Stack {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        Scanner sc = new Scanner(System.in);

        int c;
        boolean b = true;
        while (b) {
            System.out.println("1. Push Element");
            System.out.println("2. Pop Element");
            System.out.println("3. Peep Element");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.println("Enter Your Choice:");
            c = sc.nextInt();

            switch (c) {
                case 1:
                    System.out.println("Enter data:");
                    s.push(sc.next());
                    break;
                case 2:
                    if (s.isEmpty()) {
                        System.out.println("Empty Stack!");
                    }
                    else{
                        System.out.println(s.pop());
                    }
                    break;
                case 3:
                    if (s.isEmpty()) {
                        System.out.println("Empty Stack!");
                    }
                    else{
                        System.out.println(s.peek());
                    }
                    break;
                case 4:
                    if (s.isEmpty()) {
                        System.out.println("Empty Stack!");
                    }
                    else{
                        System.out.println(s);
                    }
                    break;
                case 5:
                    b = false;
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
            System.out.println();
        }
        sc.close();
    }
}


// Output:
// 1. Push Element
// 2. Pop Element
// 3. Peep Element
// 4. Display
// 5. Exit
// Enter Your Choice:
// 1
// Enter data:
// Nayan

// 1. Push Element
// 2. Pop Element
// 3. Peep Element
// 4. Display
// 5. Exit
// Enter Your Choice:
// 1
// Enter data:
// Rudra

// 1. Push Element
// 2. Pop Element
// 3. Peep Element
// 4. Display
// 5. Exit
// Enter Your Choice:
// 1
// Enter data:
// Parth

// 1. Push Element
// 2. Pop Element
// 3. Peep Element
// 4. Display
// 5. Exit
// Enter Your Choice:
// 1
// Enter data:
// Hello

// 1. Push Element
// 2. Pop Element
// 3. Peep Element
// 4. Display
// 5. Exit
// Enter Your Choice:
// 2
// Hello

// 1. Push Element
// 2. Pop Element
// 3. Peep Element
// 4. Display
// 5. Exit
// Enter Your Choice:
// 2
// Parth

// 1. Push Element
// 2. Pop Element
// 3. Peep Element
// 4. Display
// 5. Exit
// Enter Your Choice:
// 3
// Rudra

// 1. Push Element
// 2. Pop Element
// 3. Peep Element
// 4. Display
// 5. Exit
// Enter Your Choice:
// 4
// [Nayan, Rudra]

// 1. Push Element
// 2. Pop Element
// 3. Peep Element
// 4. Display
// 5. Exit
// Enter Your Choice:
// 5
