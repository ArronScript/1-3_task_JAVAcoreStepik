import java.util.Scanner;

public class MassieStepik {
    /*Создайте массив, в котором будут храниться кубы чисел от 1 до 1000.
    Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[1001];
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            arr[i] = i * i * i;
        }
        System.out.println(arr[a]);
        System.out.println(arr[b]);

    }
}
