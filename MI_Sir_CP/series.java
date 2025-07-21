package MI_Sir_CP;

public class series {
    
    public static void main(String[] args) {
        int a = 1;
        int r = 3;
        int n = 10;

        double sum = a * (Math.pow(r, n) - 1) / (r - 1);

        System.out.println("Sum of series: " + sum);
    }
    
  
}