package vn.edu.likelion.ex2;

import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        int a = 33;
        System.out.println("Number: " + a);
        System.out.println(nhiPhan(a));

        System.out.println();

        int b = 747;
        System.out.println("Number: " + b);
        System.out.println(nhiPhan(b));
    }

    private static StringBuilder nhiPhan(int a){
        StringBuilder s = new StringBuilder();
        while (a > 0){
            int b = a % 2;
            a /=2;
            Function<Integer, String> function = (c) -> Integer.toString(c);
            s.insert(0, function.apply(b));
        }
        return s;
    }
}
