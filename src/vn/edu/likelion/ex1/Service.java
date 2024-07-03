package vn.edu.likelion.ex1;

import java.util.ArrayList;
import java.util.List;

public class Service {
    static List<Integer> uoc(int a){
        List<Integer> listUoc = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(a*1.0); i++){
            if(a % i == 0){
                listUoc.add(i);
                if(i != (a/i)) listUoc.add(a/i);
            }
        }
        return listUoc;
    }

    static boolean checkPrime(int a){
        for(int i = 2; i < a; i++){
            if(a % i == 0) return false;
        }
        return true;
    }
}
