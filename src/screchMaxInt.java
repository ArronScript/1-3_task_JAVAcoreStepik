import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        for(;sc.hasNext();){

            int a = sc.nextInt();
            if (a == 0) break;
            if(a % 3 == 0 && a > max){
                max = a;
            }
        }
        System.out.println(max == Integer.MIN_VALUE ? "404" : max);
    }
}