import java.util.Scanner;
class Grade{
    public static void main(String[] args) {
        Scanner mar=new Scanner(System.in);
        int a=mar.nextInt();
        int b=mar.nextInt();
        int c=mar.nextInt();
        int d=mar.nextInt();
        int e=mar.nextInt();
        int total=a+b+c+d+e;
        double avg=total/5;
        System.out.println("total marks:"+total);
        System.out.println("Average :"+avg);
        if(total>=490){
            System.out.println("A-garde");
        }
        else if(total>=455){
            System.out.println("B-garde");
        }
        else if(total>=395){
            System.out.println("C-garde");
        }
        else if(total>=345){
            System.out.println("D-garde");
        }   
        else if(total>=250){
            System.out.println("E-garde");
        }
        else{
            System.out.println("F-garde");
        }

    }
}