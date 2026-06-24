package m1.week1;

public class D2LogLevelCounter {
    public static void main(String[] args) {

        String[] logs = {
          "2024-01-15 ERROR PaymentService Payment failed",
          "2024-01-15 INFO AuthService User logged in",
          "2024-01-15 WARN Database Connection slow",
                "2024-01-15 INFO AuthService User logged in",
                "2024-01-15 ERROR PaymentService Payment failed",
                "2024-01-15 INFO AuthService User logged in",
                "2024-01-15 INFO AuthService User logged in",
                "2024-01-15 ERROR PaymentService Payment failed",
                "2024-01-15 ERROR PaymentService Payment failed",
                "2024-01-15 ERROR PaymentService Payment failed",
                "2024-01-15 ERROR PaymentService Payment failed",
                "2024-01-15 INFO AuthService User logged in",
                "2024-01-15 DEBUG Checking the system",
                "2024-01-15 DEBUG Checking the system",
                "2024-01-15 WARN Database Connection slow",
                "2024-01-15 INFO AuthService User logged in",
                "2024-01-15 WARN Database Connection slow",
                "2024-01-15 INFO AuthService User logged in",
                "2024-01-15 WARN Database Connection slow",
                "2024-01-15 DEBUG Checking the system",
        };

        int infoCount = 0;
        int warnCount = 0;
        int errorCount = 0;
        int debugCount = 0;

        for (String line : logs) {
            String[] parts = line.split(" ");
            String levels = parts[1];


            int find = switch (levels) {
                case "INFO" -> infoCount++;
                case "WARN" -> warnCount++;
                case "ERROR" -> errorCount++;
                case "DEBUG" -> debugCount++;
                default -> 0;
            };
        }

        int totalCount = infoCount + warnCount + errorCount + debugCount;

        System.out.println("Log Level Summary\n-----------------");
        System.out.println("INFO    : " + infoCount);
        System.out.println("WARN    : " + warnCount);
        System.out.println("ERROR   : " + errorCount);
        System.out.println("DEBUG   : " + debugCount);
        System.out.println("Total   : " + totalCount);
    }
}