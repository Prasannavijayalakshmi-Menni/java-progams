import java.util.Scanner;
class Swap{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int x=a.nextInt();
        System.out.println("Enter 2nd number");
        int y=a.nextInt();
        int z=x;
        x=y;
        y=z;
        System.out.println(" 1st numbers after swap:"+x);
        System.out.println(" 2nd numbers after swap:"+y);
    }
}