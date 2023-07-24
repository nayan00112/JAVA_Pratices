import java.util.Collection;
import java.util.Vector;

class C03_Vector{
    public static void main(String[] args) {
        Collection<String> l = new Vector<>();
        l.add("okk");
        l.add("Hello");
        l.add("Hii");
        l.add("How are you?");

        System.out.println(l);
        l.remove("okk");
        System.out.println(l);
        System.out.println(l.isEmpty());
        
        for(String s: l){
            System.out.println(s);
        }

    }
}

// Output:
// [okk, Hello, Hii, How are you?]
// [Hello, Hii, How are you?]
// false
// Hello
// Hii
// How are you?