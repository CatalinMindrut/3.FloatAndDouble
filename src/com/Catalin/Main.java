package com.Catalin;

public class Main {

    public static void main(String[] args) {
        /** Floating point numbers = numbers that have a decimal point.
         * Java has 2 data types that deal with floating point numbers = float and double.
         * The float is a single precision data type and the double is a double precision data type.*/
        //width of int = 32 (4 bytes).
        int myIntValue = 5;
        //width of float = 32 (4 bytes).
        float myFloatValue = 6f; //The proper way to define a float number is to add an "f" after the value.
        //width of double = 64 (8 bytes).
        double myDoubleValue = 5d;
        // double myDoubleValue = 5.25;
        /** The proper way to define a double number would be to add a "d" after the value but Java will
         *  automatically assume that a number with a decimal point is a double.
         */

        //Challenge
        float mySecondFloatValue = (float) 5.5;

        System.out.println("myIntValue is " + myIntValue);
        System.out.println("myFloatValue is " + myFloatValue);
        System.out.println("myDoubleValue is " + myDoubleValue);
        /** The float and double values are printed as 6.0 and 5.0 while the int value is printed as is, 5.
         */

        int myThirdIntValue = 5 / 2;
        System.out.println("myThirdIntValue is " + myThirdIntValue);
        /** This will just print out a value of 2, because the reminder is ignored, the integer is a whole number with
         * no decimal points.
         */
        float myThirdFloatValue = 5f / 2f;
        double myThirdDoubleValue = 5d / 2d;
        System.out.println("Third Float is " + myThirdFloatValue + " and Third Double is " + myThirdDoubleValue);
        /** This will print out te entire result, 2.5, since the double and float both support decimal points.
         */

        /** Reasons to use a double whenever you're using a floating point in Java: double precision, which is the use of
         * a double data type, is actually faster on any modern computer, and secondly, many inbuilt Java math functions
         * use and return doubles in calculations because they are more precise and there are more digits of precision
         */

        //Challenge
        //Convert a given number of pounds to kilograms.
        //1 pound = 0.45359237 kilograms.
        double myPoundValue = 200d;
        double myKilogramConversion = myPoundValue * 0.45359237d;
        System.out.println("Conversion result: " + myKilogramConversion);

        /** Underscores can also be used for floating point numbers, before or after the decimal point.
         */
        double pi = 3_000_000.1_415_927d;
        System.out.println(pi);
    }
}
