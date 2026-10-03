import java.util.Scanner;
public class Problem3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Waste Collected ");
        double wasteColl = sc.nextDouble();
        if(wasteColl >= 100.00){
            System.out.println("Collection Target Achieved");
        }        
        else{
            System.out.println("More Waste Collection Required");
        }
        sc.close();
    }
}