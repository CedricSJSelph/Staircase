import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        //Need to print " " n times until i = row number
        //Row
        for(int i = 1; i <= n; i ++){
            //Column
            for(int j = 0; j < n; j ++){
              if((n-i) > j){
                  System.out.print(" ");
                  
              }else{
                  System.out.print("#");
              }  

            }
            System.out.println();
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
