import java.util.Scanner;
class Input{
    public static void main(String[] args) {
      Scanner a=new Scanner(System.in) ;
      int x=a.nextInt();
      int y=a.nextInt();
      System.out.println("x="+x);
      System.out.println("y="+y);
      if(x>y){
        System.out.println("x is big");
      }
      else if(x<y){
        System.out.println("y is big");
      }
      else{
        System.out.println("x & y are equal");
      }

    }
}