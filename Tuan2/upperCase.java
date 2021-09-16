import  java.util.Scanner;
public class upperCase {
   
    public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);
    String message;
    System.out.println("\n\nNhập vào chuỗi cần in hoa: ");
    message = sc.nextLine();
    System.out.println("Chuỗi sau khi in hoa: ");
    
    System.out.println(message.toUpperCase());
    
    System.out.println("\n---------------------------------");
       
      }
}
