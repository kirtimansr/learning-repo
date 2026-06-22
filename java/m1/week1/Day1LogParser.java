package m1.week1;

public class Day1LogParser {
    public static void main(String[] args) {

        String logLine = "2024-01-15 ERROR PaymentService Payment failed for user 123";

        String[] splitLog = logLine.split(" ");

        int messageStart = splitLog[0].length() + 1 + splitLog[1].length() + 1 + splitLog[2].length() +1;

        String message = logLine.substring(messageStart);


        System.out.println("Timestamp   : " + splitLog[0]);
        System.out.println("Log Level   : " +  splitLog[1] );
        System.out.println("Service     : " + splitLog[2]);
        System.out.println("Message     : " + message);


    }
}
