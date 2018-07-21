package Programowanie.zaj1;

import java.util.HashSet;
import java.util.Set;

public class Distinct {

    public static int solution(int A[]) {
        Set<Integer> count= new HashSet<>();
        for(int i=0; i<A.length; ++i)
            count.add(A[i]);
        return count.size();
    }
}