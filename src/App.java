import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        int x1 = sc.nextInt();

        System.out.print("Enter y1: ");
        int y1 = sc.nextInt();

        System.out.print("Enter w1: ");
        int w1 = sc.nextInt();

        System.out.print("Enter h1: ");
        int h1 = sc.nextInt();
        
        System.out.print("Enter x2: ");
        int x2 = sc.nextInt();

        System.out.print("Enter y2: ");
        int y2 = sc.nextInt();

        System.out.print("Enter w2: ");
        int w2 = sc.nextInt();

        System.out.print("Enter h2: ");
        int h2 = sc.nextInt();

        sc.close();
        
        Intersect calc = new Intersect(y1, x1, h1, w1);
        System.out.print(calc.intersect(x2, y2, w2, h2));
    }
}
