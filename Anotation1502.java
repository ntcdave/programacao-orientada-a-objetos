import java.util.*;
public class Anotation1502 {
    public static void main(String[] args) {
         @SuppressWarnings("resource")
         Scanner in = new Scanner(System.in);
           long a, b, x, y;
           System.out.print("Enter Value of a: ");
           a = in.nextLong();
           System.out.print("Enter Value of x: ");
           x = in.nextLong();
           System.out.print("Enter Value of b: ");
           b = in.nextLong();
           System.out.print("Enter Value of y: ");
           y = in.nextLong();
           if (a >= b) {
               System.out.println("Output: "+a);
               return;
           }
           while (a <= b) {
               if (a + x >= b) {
                   System.out.println("Output: "+b);
                   return;
               }
               a += x;
               b -= y;
           }
           System.out.println("Output: "+a);
           in.close();
         }
}
