// tiles problem

import java.util.*;
public class tillingproblem{
    public static int tillingProblem(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        // vertical choice
        int fnm1 = tillingProblem(n-1);

        //horizontal choice
        int fnm2 = tillingProblem(n-2);

        int totways = fnm1+fnm2;
        return totways;
    }
    public static void main(String args[]){
        System.out.println(tillingProblem(4));
    }
}