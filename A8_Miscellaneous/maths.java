package A8_Miscellaneous;

public class maths {
    public static void main(String[] args) {
        double d = 3;
        System.out.println(Math.pow(d, 6));

        System.out.println(Math.abs(-5.2134));
        System.out.println(Math.abs(5.2134));

        System.out.println(Math.acos(0.1));
        System.out.println(Math.asin(0.1));

        System.out.println(Math.IEEEremainder(7, 3));
        System.out.println(Math.IEEEremainder(7, 2));
        System.out.println(Math.IEEEremainder(7, 9));
        System.out.println(Math.IEEEremainder(7, -9));
        System.out.println(Math.IEEEremainder(17, 5));

        System.out.println(Math.absExact(-7));
        // System.out.println(Math.absExact(0-7));
        System.out.println(Math.absExact(7));

        System.out.println(Math.atan(1));
        System.out.println(Math.atan2(1, 2)); // ?

        System.out.println(Math.cbrt(27)); // cube root: 3*3*3
        System.out.println(Math.sqrt(9));

        System.out.println(Math.ceil(3.1));
        System.out.println(Math.ceil(3.8));
        System.out.println(Math.ceil(-3.8));

        System.out.println(Math.cos(1.57));
        System.out.println(Math.sin(1.57));
        System.out.println(Math.tan(1.57));
        System.out.println(Math.cosh(1.57));

        System.out.println(Math.exp(2));

        System.out.println(Math.floor(9.6));
        System.out.println(Math.floor(-5.96));

        System.out.println(Math.hypot(2, 2));

        System.out.println(Math.incrementExact(8)); // increment.

        System.out.println(Math.log(3));
        System.out.println(Math.log10(3));
        System.out.println(Math.log1p(9));
        System.out.println(Math.max(9, 3));
        System.out.println(Math.max(7.9, 9.3));
        System.out.println(Math.min(9, 2));
        System.out.println(Math.min(-9, 2));

        System.out.println(Math.multiplyExact(7, 8));
        System.out.println(Math.nextDown(9));
        System.out.println(Math.nextUp(9));
        System.out.println(Math.multiplyHigh(3, 2)); // ?

        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());

        System.out.println(Math.rint(5));
        System.out.println(Math.round(8.9));
        System.out.println(Math.round(8.12));
        System.out.println(Math.round(8.5));

        System.out.println(Math.sinh(1.56));
        System.out.println(Math.subtractExact(8, 6));
        System.out.println(Math.subtractExact(8, -6));
        System.out.println(Math.subtractExact(1, 6));
        System.out.println(Math.toDegrees(Math.asin(1)));
        // System.out.println(Math.toDegrees(Math.asin(1/2))); //??.

        // -------------------------------------
        long a = 97;
        System.out.println(Math.toIntExact(a)); // Returns the value of the long argument, throwing an exception if the
                                                // value overflows an int.

        // int p = a;// error //Type mismatch: cannot convert from long to int

        int p = Math.toIntExact(a);
        System.out.println(p);
        // -------------------------------------

        System.out.println(Math.toRadians(270));
        System.out.println(Math.toRadians(90));
        System.out.println(Math.toRadians(30));
        System.out.println(Math.toRadians(360));
        System.out.println(Math.toRadians(180));

        System.out.println(Math.ulp(9.0423)); // what is it?
        System.out.println(Math.E);
        System.out.println(Math.PI);

    }
}

// Output:
// 729.0
// 5.2134
// 5.2134
// 1.4706289056333368
// 0.1001674211615598
// 1.0
// -1.0
// -2.0
// -2.0
// 2.0
// 7
// 7
// 0.7853981633974483
// 0.4636476090008061
// 3.0
// 3.0
// 4.0
// 4.0
// -3.0
// 7.963267107332633E-4
// 0.9999996829318346
// 1255.7655915007897
// 2.5073466880660993
// 7.38905609893065
// 9.0
// -6.0
// 2.8284271247461903
// 9
// 1.0986122886681098
// 0.47712125471966244
// 2.302585092994046
// 9
// 9.3
// 2
// -9
// 56
// 8.999999
// 9.000001
// 0
// 0.6053785484444281
// 0.7783320079979811
// 0.29077217009996525
// 5.0
// 9
// 8
// 9
// 2.2743425869685447
// 2
// 14
// -5
// 90.0
// 97
// 97
// 4.71238898038469
// 1.5707963267948966
// 0.5235987755982988
// 6.283185307179586
// 3.141592653589793
// 1.7763568394002505E-15
// 2.718281828459045
// 3.141592653589793