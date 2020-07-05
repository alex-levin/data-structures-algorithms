import java.util.*;

// https://www.codechef.com/problems/ATM

public class ATM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] values = line.split(" ");
        int withdrawal = Integer.valueOf(values[0]);
        double balance = Double.valueOf(values[1]);
        if(withdrawal % 5 != 0) {
            System.out.printf("%.2f", balance);
            return;
        }
        double newBalance = balance - withdrawal - 0.5;
        if(newBalance > 0) {
            System.out.printf("%.2f", newBalance);
        }
        else {
            System.out.printf("%.2f", balance);
        }
    }
}