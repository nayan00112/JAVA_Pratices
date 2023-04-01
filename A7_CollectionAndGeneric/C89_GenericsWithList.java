import java.util.List;
import java.util.ArrayList;

public class C89_GenericsWithList {
    public static void main(String arg[]){
        // List<Integer> values = new ArrayList<Integer>(); // 1.5v
        List<Integer> values = new ArrayList<>(); // 1.7v
        // above both 1.5v and 1.7v workable.

        values.add(42);
        values.add(72);
        values.add(45);
        // values.add("25"); //String // Error as it is String.

        // Way 1:
        // Iterator it = values.iterator();
        // for(int i = 0; i < values.size(); i++){
        //     System.out.println(values.get(i));
        // } // Workable

        // Way 2:
        // for (Object o : values){
        //     System.out.println(o);
        // } // Workable

        // Way 3:
        for (Integer o : values){
            System.out.println(o);
        } // Workable
    }

}

// Outpur
// 42
// 72
// 45
