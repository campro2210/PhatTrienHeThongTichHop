import java.util.Scanner;



public class sum {
    public static void main(String[] args) {
        int sumN =0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a number");
        int n = sc.nextInt();
        for (int i=0; i<=n; i++){
            sumN += i;
        }
        System.out.println(" sum is:" + sumN);
        

    }
    
    // public static int sumInt(n){
    //     int sumN;
    //     for (int i=0; i<n; i++){
    //         sumN += i;
    //     }
    //     System.out.println(" sum is:" + sumN);
    // }
}
