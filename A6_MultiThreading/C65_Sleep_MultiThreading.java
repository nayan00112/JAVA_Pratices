class Hi{
    public void show(){
        for (int i = 1; i <= 5; i++){
            System.out.println("Hi");
            try {Thread.sleep(500);} catch(Exception e){}
        }
    }
}

class Hello{
    public void show(){
        for (int i = 1; i <= 5; i++){
            System.out.println("Hello");
            try {Thread.sleep(500);} catch(Exception e){}
        }
    }
}

public class C65_Sleep_MultiThreading {
    public static void main(String arg[]){
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        obj1.show();
        obj2.show();
        
    }
}



/*
 * sleep(500);
 * thread wait for given time...
 * sleep mathod is in the Thread class, si we can extend or use as classname.mathodname as shown in this example.
 * 
 * we use try and catch for if there is any complications. (We Must Use Try Catch block)
 * 
 * 
*/

// Output:
// Hi
// Hi
// Hi
// Hi
// Hi
// Hello
// Hello
// Hello
// Hello
// Hello