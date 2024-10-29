import java.util.Scanner;
class LargestNum{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int x=a.nextInt();
        int y=a.nextInt();
        int z=a.nextInt();
        if(x>y && x>z){
            System.out.println(x+"is largest number");
        }
        else if(y>x && y>z){
            System.out.println(y+"is largest number");
        }
        else{
            System.out.println(z+"is largest number");
        }
    }
}