public class _2Predefine_Function {
    public static void main(String[] args) {
      System.out.println(Math.sqrt(16));  // 4 --> returns the square root of a number.
      System.out.println(Math.pow(2, 3));  // 8 --> returns the value of the first argument raised to the power of the second argument.
      System.out.println(Math.cbrt(27));  // 3 --> returns the cube root of a number.
      System.out.println(Math.abs(-5));  // 5 --> returns the absolute value of a number(i.e., the non-negative value of the number).
      System.out.println(Math.max(10, 20));  // 20 --> returns the greater of two numbers.
      System.out.println(Math.min(10, 20));  // 10 --> returns the smaller of two numbers.
      System.out.println(Math.random());  // returns a random number between 0.0 (inclusive) and 1.0 (exclusive).
      System.out.println(Math.round(3.14));  // 3 --> returns the closest long to the argument, with ties rounding up.
      System.out.println(Math.ceil(3.14));  // 4.0 --> returns the smallest (closest to negative infinity) double value that is greater than or equal to the argument and is equal to a mathematical integer.
      System.out.println(Math.floor(3.14));  // 3.0 --> returns the largest (closest to positive infinity) double value that is less than or equal to the argument and is equal to a mathematical integer.  
     System.out.println(Math.exp(1));  // 2.718281828459045 --> returns Euler's number e raised to the power of a double value.
     System.out.println(Math.log(2.718281828459045));  // 1.0 --> returns the natural logarithm of a double value.
     






        String name = "Malli";
        System.out.println(name.length());  // length() is a predefined function in Java that returns the number of characters in a string.

        String str = "Hello World";
        System.out.println(str.toUpperCase());  // toUpperCase() is a predefined function that converts all characters in a string to uppercase.

        String str2 = "   Hello World   ";
        System.out.println(str2.trim());  // trim() is a predefined function that removes leading and trailing whitespace from a string.
    }
}
