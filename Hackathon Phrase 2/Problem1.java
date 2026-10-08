class MovieTicket{
    String movieName;
    double ticketPrice;
    int numberOfTickets;
    MovieTicket(String a , double b , int c){
        movieName = a;
        ticketPrice = b;
        numberOfTickets = c;
    }
    double calculateTotal(){
        double totalAmount = ticketPrice * numberOfTickets;
        return totalAmount;
    }
    double calculateDiscount(){
        double discount = 0;
        if(numberOfTickets >= 5){
            discount = calculateTotal()/10;
        }
        return discount;
    }
    double calculateFinalAmount(){
        double FinalAmount = calculateTotal() - calculateDiscount();
        return FinalAmount;
    }
    void displayBill(){
        System.out.println("Movie Name    : "+ movieName);
        System.out.println("Ticket Price  : "+ ticketPrice +" $");
        System.out.println("No of Tickets : "+ numberOfTickets);
        System.out.println("Discount      : "+ calculateDiscount());
        System.out.println("Final Amount  : "+ calculateFinalAmount() + " $");
    }
}

public class Problem1{
    public static void main(String[] args){
        MovieTicket m1 = new MovieTicket("Paradise", 15, 5);
        m1.calculateTotal();
        m1.calculateDiscount();
        m1.calculateDiscount();
        m1.calculateFinalAmount();
        m1.displayBill();
    }
}