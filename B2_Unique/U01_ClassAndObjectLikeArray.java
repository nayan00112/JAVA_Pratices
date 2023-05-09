
// ########################## My Code ##########################

// package B2_Unique;

// class OurHome{
//     int roomNum;
//     public void Room(){
//         System.out.println("Welcome to room!");
//     }
// }

// public class U01_ClassAndObjectLikeArray {
//     public static void main(String[] args) {
//         OurHome[] obj = new OurHome[2];

//         obj[0].roomNum = 1;
//         obj[1].roomNum = 2;

//         obj[0].Room();
//         obj[1].Room();
//     }
// }


// ##################################################################################


// The code snippet is trying to create an array of objects of the `OurHome` class and access their properties and methods. However, there is an error in the code that will cause it to throw a `NullPointerException` at runtime.

// The error is in these two lines:

// ```
// obj[0].roomNum = 1;
// obj[1].roomNum = 2;
// ```

// Here, the code is trying to access the `roomNum` property of the objects in the `obj` array, but the objects have not yet been instantiated. When an array of objects is created in Java, the elements in the array are initialized to `null`, which means that they do not refer to any object.

// To fix the error, we need to create new objects of the `OurHome` class and assign them to the elements in the `obj` array before we can access their properties and methods. Here's the corrected code:

// ```
// package B2_Unique;

class OurHome{
    int roomNum;
    public void Room(){
        System.out.println("Welcome to room!");
    }
}

public class U01_ClassAndObjectLikeArray {
    public static void main(String[] args) {
        OurHome[] obj = new OurHome[2];

        // create new objects and assign them to the array
        obj[0] = new OurHome();
        obj[1] = new OurHome();

        // set the properties of the objects
        obj[0].roomNum = 1;
        obj[1].roomNum = 2;

        // call the methods of the objects
        obj[0].Room();
        obj[1].Room();
    }
}
// ```

// In this corrected code, we create new objects of the `OurHome` class and assign them to the elements in the `obj` array using the `new` operator. Then, we set the properties of the objects and call their methods. This should execute without any errors and output:

// ```
// Welcome to room!
// Welcome to room!
// ```