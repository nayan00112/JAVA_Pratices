import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class C05_Queue {
    public static void main(String[] args) {
        Queue<String> s = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int c;
        boolean b = true;
        while (b) {
            System.out.println("1. Add Element");
            System.out.println("2. Remove Element");
            System.out.println("3. Peep Element");
            System.out.println("4. Poll Element");
            System.out.println("5. Display");
            System.out.println("6. Exit");

            System.out.println("Enter Your Choice:");
            c = sc.nextInt();

            switch (c) {
                case 1:
                    System.out.println("Enter data:");
                    s.add(sc.next());
                    break;
                case 2:
                    if (s.isEmpty()) {
                        System.out.println("Empty Queue!");
                    }
                    else{
                        System.out.println(s.remove());
                    }
                    break;
                case 3:
                    if (s.isEmpty()) {
                        System.out.println("Empty Queue!");
                    }
                    else{
                        System.out.println(s.peek());
                    }
                    break;
                case 4:
                    if (s.isEmpty()) {
                        System.out.println("Empty Queue!");
                    }
                    else{
                        System.out.println(s.poll());
                    }
                    break;
                case 5:
                    if (s.isEmpty()) {
                        System.out.println("Empty Queue!");
                    }
                    else{
                        System.out.println(s);
                    }
                    break;
                case 6:
                    b = false;
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
            System.out.println("Size of Queue:" + s.size());
            System.out.println();
        }
        sc.close();
    }
}



// Output:
// 1. Add Element
// 2. Remove Element
// 3. Peep Element
// 4. Poll Element
// 5. Display
// 6. Exit
// Enter Your Choice:
// 1
// Enter data:
// nayan
// Size of Queue:1

// 1. Add Element
// 2. Remove Element
// 3. Peep Element
// 4. Poll Element
// 5. Display
// 6. Exit
// Enter Your Choice:
// 1
// Enter data:
// rudra
// Size of Queue:2

// 1. Add Element
// 2. Remove Element
// 3. Peep Element
// 4. Poll Element
// 5. Display
// 6. Exit
// Enter Your Choice:
// 3
// nayan
// Size of Queue:2

// 1. Add Element
// 2. Remove Element
// 3. Peep Element
// 4. Poll Element
// 5. Display
// 6. Exit
// Enter Your Choice:
// 1
// Enter data:
// parth
// Size of Queue:3

// 1. Add Element
// 2. Remove Element
// 3. Peep Element
// 4. Poll Element
// 5. Display
// 6. Exit
// Enter Your Choice:
// 1
// Enter data:
// mohit
// Size of Queue:4

// 1. Add Element
// 2. Remove Element
// 3. Peep Element
// 4. Poll Element
// 5. Display
// 6. Exit
// Enter Your Choice:
// 3
// nayan
// Size of Queue:4

// 1. Add Element
// 2. Remove Element
// 3. Peep Element
// 4. Poll Element
// 5. Display
// 6. Exit
// Enter Your Choice:
// 2
// nayan
// Size of Queue:3

// 1. Add Element
// 2. Remove Element
// 3. Peep Element
// 4. Poll Element
// 5. Display
// 6. Exit
// Enter Your Choice:
// 4
// rudra
// Size of Queue:2

// 1. Add Element
// 2. Remove Element
// 3. Peep Element
// 4. Poll Element
// 5. Display
// 6. Exit
// Enter Your Choice:
// 5
// [parth, mohit]
// Size of Queue:2

// 1. Add Element
// 2. Remove Element
// 3. Peep Element
// 4. Poll Element
// 5. Display
// 6. Exit
// Enter Your Choice:
// 1
// Enter data:
// ok
// Size of Queue:3

// 1. Add Element
// 2. Remove Element
// 3. Peep Element
// 4. Poll Element
// 5. Display
// 6. Exit
// Enter Your Choice:
// 5
// [parth, mohit, ok]
// Size of Queue:3

// 1. Add Element
// 2. Remove Element
// 3. Peep Element
// 4. Poll Element
// 5. Display
// 6. Exit
// Enter Your Choice:
// 6
// Size of Queue:3