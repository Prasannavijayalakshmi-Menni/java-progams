import java.util.Scanner;
class EqualNum{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
    System.out.println("Enter 2 numbers");
    int x=a.nextInt();
    int y=a.nextInt();
    if(x==y){
        System.out.println("both are equal");
    }
    else{
        System.out.println("both are not equal");
    }
    }
    
}