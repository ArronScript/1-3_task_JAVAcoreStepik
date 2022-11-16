import java.util.Scanner;
public class Main {
    /*С клавиатуры вводится 3 числа: a, b, c - коэффициенты квадратного уравнения a*x2 + b*x + c = 0 (a != 0).
      Определите, сколько корней будет у этого уравнения.
     Выведите на экран одно число - количество корней уравнения.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int D;
        D= b*b-4*a*c;
        if(a!=0){
            if (D>0){
                System.out.println(2);
            }
            if (D==0){
                System.out.println(1);
            }
            if (D<0){
                System.out.println(0);
            }

        }
    }
}