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

public class C66_MultiThreading {
    public static void main(String arg[]){
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        obj1.start();
        obj2.start();
        
    }
}


/*
 * We call start() method and this calls, call the run() method in child class extended by Thread.!!!
 * 
 * run() is the method in Thread, Our responsibility that override that method in child class.
 * 
*/

// Outout:
// Hi
// Hello
// Hello
// Hi
// Hi
// Hello
// Hi
// Hello
// Hello
// Hi

// Wired outout?! it shows that process done at same time by different threads.  
// Visit next for proper output... (if we needed like that ..)
// Priviously, it take aprox 6 sec in one tread (by default programm run on 1 thread), now it use 2 thread and output comes in 3 sec.