import java.util.Scanner; 

public class TicketCounter {
    public static void main(String[] args) {
        int awardPoints;
        int userTickets; 

        Scanner scnr = new Scanner(System.in);
        userTickets = scnr.nextInt();

        if (userTickets < 7) {
            awardPoints = 1;
        }
        else {
            awardPoints = userTickets;
        }
        System.out.println(awardPoints);
    }
}
        
