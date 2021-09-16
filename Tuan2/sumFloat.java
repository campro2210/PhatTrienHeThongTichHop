import java.util.Scanner;
public class sumFloat {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter number-element of arr:");
        int n = sumFloat.scanner.nextInt();
        
        float[] arr = new float[n];
        System.out.println("enter element of array:");
        for(int i=0; i<n; i++){
            System.out.printf("a[%d] = ", i);
            arr[i] = sumFloat.scanner.nextFloat();
        }
        System.out.printf("list elements:  " );
        showElement(arr);
        sumPosition(arr);

}
    public static void showElement(float[] arr){
        
        for(int i=0; i<arr.length; i++){     
            System.out.print( arr[i]+ ", \t");
        }
    }

    
    public static void sumPosition(float[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                sum += arr[i];
            }
        }
        System.out.println("\n sum+ in arr is:" + sum);
    }
}
