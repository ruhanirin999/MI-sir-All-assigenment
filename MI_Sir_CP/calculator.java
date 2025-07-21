import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("please enter a number: ");
        int a=input.nextInt();
        System.out.println(a);
        System.out.println("please enter another number : ");
        int b=input.nextInt();
        System.out.println(b);
        System.out.println("What operation do you want: ");
        char c =input.next().charAt(0);
        System.out.println(c);

            if (c == '+') {
                int x = a + b;
                System.out.println("the result is :" + x);
            } else if (c == '-') {
                int y = a - b;
                System.out.println("the result is :" + y);
            } else if (c == '*') {
                int z = a * b;
                System.out.println("the result is :" + z);

            } else if (c == '/') {
                float w = a / b;
                System.out.println("the result is :" + w);
            } else
                System.out.println("returns 0");





    }
}