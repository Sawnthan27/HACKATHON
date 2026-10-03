import java.util.Scanner;
public class Problem3c {
    static double calculateTotalWaste(double a , double b){
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Waste Collected at Point 1");
        double coll_1 = sc.nextDouble();
        System.out.println("Enter the Waste Collected at Point 2");
        double coll_2 = sc.nextDouble();
        System.out.println("Total Waste Collected : "+calculateTotalWaste(coll_1, coll_2)+" Kg's");
        sc.close();
    }
}
