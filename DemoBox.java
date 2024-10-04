public class DemoBox {
    public static void main(String args[]) {
        Box b1 = new Box();
        Box b2 = new Box();
        b1.length = 10;
        b1.width = 10;
        b1.height = 10;
        b2.length = 6;
        b2.width = 8;
        b2.height = 4;
        System.out.println("length of box b1:" + b1.length + "\nwidth:" + b1.width + "\nheight:" + b1.height);
        System.out.println("length of box b2:" + b2.length + "\nwidth:" + b2.width + "\nheight:" + b2.height);
        System.out.println("Volume of b1:" + b1.length * b1.width * b1.height);
        System.out.println("Volume of b2:" + b2.length * b2.width * b2.height);
    }
}
