package vn.edu.likelion.ex1;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class App {
    public static void main(String[] args) {
        List<Integer> listUoc = todo(176, Service::uoc);

        AtomicInteger max = new AtomicInteger();
        listUoc.forEach((element) -> {
            if(todo(element, Service::checkPrime) && max.get() <= element){
                max.set(element);
            }
        });

        System.out.println(max.get());

    }

    private static <R> R todo(int a, PrimeInterface<R> p){
        return p.maxPrime(a);
    }
}
