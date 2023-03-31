/*
Example: 
MS Word - > Main Process
Typing -> Sub process
Spell Cheak -> Sub process

uses different Threads.

THREAD -> Unit of a Process

Use of threads:
1. Using complete power of cpu
2. Asynctask in Android
(example: Like amazon online shopine app, there are request and responce, both process handeled by different therads)
3. Web Application
4. Gaming


Syntex: 
Thread t1 = new Thread();

We should extends Thread for use of it.
or we can implements it by Runnable


*/

class Hi{
    public void show(){
        for (int i = 1; i <= 5; i++){
            System.out.println("Hi");
        }
    }
}

class Hello{
    public void show(){
        for (int i = 1; i <= 5; i++){
            System.out.println("Hello");
        }
    }
}

public class C64_MultiThreading {
    public static void main(String arg[]){
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        obj1.show();
        obj2.show();
        
    }
}


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

// Visit next...