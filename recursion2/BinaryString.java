// print all binary string of size n without consective one
import java.util.*;
public class BinaryString {
    public static void printBinString(int n, int lastPlace, StringBuilder str){
        // base case
        if(n == 0){
            System.out.println(str);
            return;
        }
        // work
        printBinString(n-1, 0, str.append("0"));
        if(lastPlace==0){
            printBinString(n-1, 1, str.append("1"));
        }
    }
    public static void main(String[] args) {
        printBinString(3,0, new StringBuilder(""));
    }
}
