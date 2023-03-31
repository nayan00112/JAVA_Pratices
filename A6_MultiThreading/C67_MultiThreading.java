class Hi extends Thread
{
    public void run(){
        for (int i = 1; i <= 5; i++){
            System.out.println("Hi");
            try {Thread.sleep(500);} catch(Exception e){}
        }
    }
}

class Hello extends Thread
{
    public void run(){
        for (int i = 1; i <= 5; i++){
            System.out.println("Hello");
            try {Thread.sleep(500);} catch(Exception e){}
        }
    }
}

public class C67_MultiThreading {
    public static void main(String arg[]){
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        obj1.start();
        try {Thread.sleep(20);} catch(Exception e){}
        obj2.start();
        
    }
}

// Output:
// Hi
// Hello
// Hi
// Hello
// Hi
// Hello
// Hi
// Hello
// Hi
// Hello