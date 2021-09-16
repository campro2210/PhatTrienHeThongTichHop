import java.util.Scanner;

public class Point {
    int x;
    int y;
    // public  Point(int x, int y){  // gan gia tri point
    //     this.x = x;
    //     this.y = y;
    // }
     void  createPoint(){ // nhap gia tri point
        Scanner input = new Scanner(System.in);
        System.out.println("enter x-value");
        x = input.nextInt();
        System.out.println("enter y-value");
        y = input.nextInt();
    }
    void showInfor(){ // in toa do
        System.out.println("toa do diem: (" + x +"," + y +")");

    }
    void showDistance(){
        double a = Math.sqrt(x*x + y*y);
        System.out.println("distance from root:" + a);
    }
    
    public static void main(String[] args) {
        Point a= new Point();
        a.createPoint();
        a.showInfor();
        a.showDistance();
    }
}
