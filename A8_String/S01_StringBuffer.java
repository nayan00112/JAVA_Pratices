package A8_String;

public class S01_StringBuffer {
    public static void main(String arg[]) {

        String s = new String("Nayan");
        System.out.println(s);

        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity());
        StringBuffer sb = new StringBuffer("Nayankumar");
        System.out.println(sb);

        System.out.println(sb.length());
        sb.append(" Patel");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.charAt(1));
        System.out.println(sb.codePointAt(0));
        System.out.println(sb.codePointAt(1));
        System.out.println(sb.codePointAt(4));
        System.out.println(sb.indexOf("n"));
        System.out.println(sb.indexOf("a"));
        System.out.println(sb.indexOf("a"));
        System.out.println(sb.hashCode());
        System.out.println(sb.isEmpty());

        System.out.println(sb.toString());
        String sbStr = sb.toString();
        System.out.println(sbStr);

        StringBuffer sb2 = new StringBuffer("Nayan");
        System.out.println(sb.compareTo(sb2));
        System.out.println(sb.toString().compareTo(sb2.toString()));
        sb2.append("kumar");
        System.out.println(sb.compareTo(sb2));
        System.out.println(sb.toString().compareTo(sb2.toString()));
        sb2.append("Patel");
        System.out.println(sb.compareTo(sb2));
        System.out.println(sb.toString().compareTo(sb2.toString()));

        /*
         * compareTo() method:
         * Returns:
         * 
         * the value 0 if this StringBuffer contains the same character sequence as that
         * of the argument StringBuffer; a negative integer if this StringBuffer is
         * lexicographically less than the StringBuffer argument; or a positive integer
         * if this StringBuffer is lexicographically greater than the StringBuffer
         * argument.
         */

        /*
         * stringbuffer compareTo method in java
         * 
         * The StringBuffer class in Java does not have a compareTo method. The
         * compareTo method is used for comparing two objects to determine their
         * relative order, and it is defined in the Comparable interface, which is
         * implemented by classes that have a natural ordering.
         * 
         * However, StringBuffer does not implement the Comparable interface, so it does
         * not provide a compareTo method. This is because the natural ordering of
         * StringBuffer objects is not well-defined, as the contents of the buffer can
         * be modified in place, making it difficult to establish a consistent ordering.
         * 
         * If you need to compare StringBuffer objects, you can convert them to String
         * objects using the toString() method and then use the compareTo method of the
         * String class. For example:
         *
         * StringBuffer sb1 = new StringBuffer("Hello");
         * StringBuffer sb2 = new StringBuffer("World");
         * 
         * int result = sb1.toString().compareTo(sb2.toString());
         * if (result < 0) {
         * System.out.println("sb1 comes before sb2");
         * } else if (result > 0) {
         * System.out.println("sb1 comes after sb2");
         * } else {
         * System.out.println("sb1 and sb2 are equal");
         * }
         * In this example, we convert the StringBuffer objects sb1 and sb2 to String
         * objects using the toString() method and then use the compareTo method of the
         * String class to compare them. The compareTo method returns a negative value
         * if the first string is lexicographically less than the second string, a
         * positive value if the first string is lexicographically greater than the
         * second string, and zero if the strings are equal.
         */

        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.delete(4, 6);
        System.out.println(sb);

        System.out.println(sb.indexOf("P"));
        System.out.println(sb.lastIndexOf("P"));

        /*
         * lastindexof method in java
         * The lastIndexOf() method in Java is a string method that returns the index of
         * the last occurrence of a specified character or substring in a given string.
         * The search begins from the end of the string and proceeds towards the
         * beginning until the first occurrence of the specified character or substring
         * is found.
         * 
         * The lastIndexOf() method has two variants:
         * 
         * int lastIndexOf(int ch) - This variant of the lastIndexOf() method returns
         * the index of the last occurrence of the specified character ch in the string.
         * If the character is not found in the string, the method returns -1.
         * 
         * int lastIndexOf(String str) - This variant of the lastIndexOf() method
         * returns the index of the last occurrence of the specified substring str in
         * the string. If the substring is not found in the string, the method returns
         * -1.
         * 
         * Both variants of the lastIndexOf() method also have an overloaded variant
         * that takes a second parameter, which specifies the starting index of the
         * search. For example, the method lastIndexOf(String str, int fromIndex) starts
         * the search from the specified fromIndex and proceeds towards the beginning of
         * the string.
         * 
         * Here is an example of using the lastIndexOf() method in Java:
         * 
         * python
         * Copy code
         * String str = "Hello world, hello Java";
         * int index1 = str.lastIndexOf('o');
         * int index2 = str.lastIndexOf("hello");
         * System.out.println("Last index of 'o': " + index1);
         * System.out.println("Last index of 'hello': " + index2);
         * In this example, we first declare a string str with the value
         * "Hello world, hello Java". We then use the lastIndexOf() method to find the
         * last index of the character 'o' and the substring "hello" in the string. The
         * output of this code will be:
         * 
         * perl
         * Copy code
         * Last index of 'o': 19
         * Last index of 'hello': 12
         * Note that in this example, the lastIndexOf() method returns the last index of
         * the specified character or substring. If the character or substring occurs
         * multiple times in the string, the method returns the index of the last
         * occurrence.
         */

        sb.replace(1, 3, "NEW");
        System.out.println(sb);

        System.out.println(sb.getClass());

        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.chars());
        System.out.println(sb.codePoints());

        // sb.concat() // Error: The method concat() is undefined for the type StringBuffer
    }
}

// Output:
// Nayan
// 16
// Nayankumar
// 10
// Nayankumar Patel
// 26
// a
// 78
// 97
// 110
// 4
// 1
// 1
// 1175962212
// false
// Nayankumar Patel
// Nayankumar Patel
// 11
// 11
// 6
// 6
// -48
// -48
// ayankumar Patel
// ayanmar Patel
// 8
// 8
// aNEWnmar Patel
// class java.lang.StringBuffer
// 14
// 26
// java.util.stream.IntPipeline$Head@8efb846
// java.util.stream.IntPipeline$Head@a09ee92