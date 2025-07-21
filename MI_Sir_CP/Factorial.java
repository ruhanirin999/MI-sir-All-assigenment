package MI_Sir_CP;

public class Factorial{
    public static void main(String[] args) {


        int factorial = 1;
        int i ;
        for (i = 1; i <= 10; i++) {
            factorial = factorial * i; 
        }

        System.out.println("Factorial of 10(10!) = " + factorial);
        
        int num1 = 78;
        int num2 = 56;
        int GCD = 1;
       
       
        for (i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                GCD = i;
            }
        }
         System.out.println("GCD of 78 and 56 = " + GCD);

        int LCM= (num1 * num2) / GCD;

        System.out.println("LCM of 78 and 56 = " + LCM);
    }
}
