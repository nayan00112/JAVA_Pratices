package A8_String;

public class S00_string {
    public static void main(String[] args) {
        String s = "Nayan Patel Ashokbhai";
        System.out.println(s);

        System.out.println(s.charAt(3));
        try {

            System.out.println(s.charAt(50));

        } catch (Exception e) {

            System.out.println("Error is : " + e);
        }

        System.out.println(s.hashCode());
        String newStr = s.concat("jjj");
        System.out.println(newStr);
        System.out.println(newStr.hashCode());
        /*
         * concat mathod in java
         * The concat() method in Java is a string method that concatenates one string
         * to the end of another string. It returns a new string that represents the
         * concatenation of the two original strings.
         * 
         * The concat() method has the following syntax:
         * 
         * String concat(String str)
         * Here, str is the string that is to be concatenated to the end of the original
         * string. The concat() method returns a new string that represents the
         * concatenation of the original string and str.
         * 
         * Here is an example of using the concat() method in Java:
         * 
         * arduino
         * Copy code
         * String str1 = "Hello";
         * String str2 = "world";
         * String str3 = str1.concat(str2);
         * System.out.println(str3);
         * In this example, we first declare two strings str1 and str2 with the values
         * "Hello" and "world", respectively. We then use the concat() method to
         * concatenate str2 to the end of str1 and assign the result to a new string
         * str3. Finally, we print the value of str3 to the console. The output of this
         * code will be:
         * 
         * Copy code
         * Helloworld
         * Note that the concat() method does not modify the original strings; it
         * returns a new string that represents the concatenation of the original
         * strings. If you want to modify one of the original strings, you can use the
         * += operator, like this:
         * 
         * arduino
         * Copy code
         * String str1 = "Hello";
         * String str2 = "world";
         * str1 += str2;
         * System.out.println(str1);
         * This code will produce the same output as the previous example. However, it
         * modifies the str1 string directly, whereas the concat() method returns a new
         * string.
         */
        System.out.println(s.charAt(2));

        String a = "Hello World";
        System.out.println(a.contains("e"));
        System.out.println(a.endsWith("rld"));
        System.out.println(a.endsWith("World"));

    }
}

// Output:
// Nayan Patel
// Ashokbhai
//         a
// Error is:java.lang.StringIndexOutOfBoundsException:
// String index
// out of range:50-684086787
// Nayan Patel Ashokbhaijjj-9546739
// y
// true
// true
// true