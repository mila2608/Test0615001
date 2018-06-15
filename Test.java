import jdk.nashorn.internal.parser.Scanner;

public class Test {
  /*  public static void main(String[] args) {
// TODO Auto-generated method stub
        float x = 0, y = 0;
        x = (float) (0.3 + 0.4);

        y = 0.3f + 0.4f;
        System.out.println(x==y);

    }*/

   /* public static void main(String[] args) {
        int a = 7;
        double b = 0.0;
        double c = -0.0;
        double d = 2.5;
        double g = Double.NEGATIVE_INFINITY;

        System.out.println(a / b);
        System.out.println(a / c);
        System.out.println(b == c);

        System.out.println(d / 0);
        System.out.println(g * 0);
    }*/
   public static void main(String[] args){
       char c1 = '1';
       System.out.println(c1);
       char c2 = '\u0031';
       System.out.println(c2);
       char c3 = 49;

       System.out.println(c1 + c2 + c3);
       Scanner scanner = new Scanner(System.in);
   }

}


