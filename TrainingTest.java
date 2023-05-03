public class TrainingTest {

    static int myMethod(int x, int y) {
        return x + y;
    }

    static double myMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        int number = 15;
        number =20;
        System.out.println(number);

        int val = 9;
        double myval = val;
        System.out.println(myval);

        double val2 = 8.8;
        int myval2 = (int)val2;
        System.out.println(myval2);

        int a = 5;
        int b = 2;
        System.out.println(a>b);

        int myNum1 = myMethod(5,3);
        double myNum2 = myMethod(5.3, 3.2);
        System.out.println(myNum1);
        System.out.println(myNum2);
    }
         
}