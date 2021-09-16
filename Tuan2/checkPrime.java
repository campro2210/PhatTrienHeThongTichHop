import java.util.Scanner;
import java.io.*;


public class checkPrime {
    public static void main(String[] args) {
        try {      
            Scanner sc = new Scanner(System.in);
            System.out.println(" enter a number:");
            int n = sc.nextInt();
    
            if(isPrime(n)){
                System.out.println(n+"  is a prime!");
            }
            else{
                System.out.println(n+" isn't a prime!");
            }
        } catch (Exception e) {
            //TODO: handle exception
        }

    }
    public static boolean isPrime(int n){
        if (n <= 1) {  
            return false;  
        }  
        for (int i = 2; i <= Math.sqrt(n); i++) {  
            if (n % i == 0) {  
                return false;  
            }  
        }  
        return true;  
    }
}
