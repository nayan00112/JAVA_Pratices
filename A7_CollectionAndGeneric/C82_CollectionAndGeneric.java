import java.util.ArrayList;
import java.util.Collection;

public class C82_CollectionAndGeneric {
    public static void main(String arg[]) {
        Collection values = new ArrayList();

        values.add(5);
        values.add(7);
        values.add(4);

        System.out.println(values);

    }
}

// Output:
// [5, 7, 4]