import java.util.Scanner;
class EvenOdd{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter a number:");
        int x=a.nextInt();
        if(x%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}