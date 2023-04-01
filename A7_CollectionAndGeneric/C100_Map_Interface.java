// map: key and value pair.
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C100_Map_Interface{
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("myName", "Nayan");
        map.put("actor", "John");
        map.put("ceo", "Marisa");
        map.put("actor", "Amirath");


        System.out.println(map);
        System.out.println(map.get("myName"));
        System.out.println(map.get("myNameffffgge")); // not err but return null.

        Set<String> keys = map.keySet();
        for (String key : keys){
        System.out.println(key + " " + map.get(key));
    }
}}

//Output:
// {actor=Amirath, myName=Nayan, ceo=Marisa}
// Nayan
// null
// actor Amirath
// myName Nayan
// ceo Marisa
