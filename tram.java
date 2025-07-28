import java.util.Scanner;

public class TramCapacity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int currentPassengers = 0;
        int maxCapacity = 0;

        for (int i = 0; i < n; i++) {
            int exit = sc.nextInt();  
            int enter = sc.nextInt();  

            currentPassengers = currentPassengers- exit;
            currentPassengers = currentPassengers+ enter;

            if (currentPassengers > maxCapacity) {
                maxCapacity = currentPassengers;
            }
        }

        System.out.println(maxCapacity);
    }
}
