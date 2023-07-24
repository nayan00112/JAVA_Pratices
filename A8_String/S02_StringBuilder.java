// package A8_String;

public class S02_StringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("I am Nayan");
        System.out.println(str);
        str.append(" Patel");
        System.out.println(str);

        System.out.println(str.toString());
        System.out.println(str.capacity());
        System.out.println(str.charAt(2));
        System.out.println(str.isEmpty());
        System.out.println(str.indexOf("N"));
        System.out.println(str.length());
        str.delete(0, 5);
        System.out.println(str);
        str.insert(0, "I'm ");

        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.reverse();
        str.replace(10, 15,"PATEL");
        System.out.println(str);
    }
}

