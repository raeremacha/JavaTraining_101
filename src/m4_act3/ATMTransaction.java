package m4_act3;


public class ATMTransaction {

    public static void checkBalance(String accountNumber, double balance) {
        try {
            System.out.println("Processing balance inquiry...");

            int accNum = Integer.parseInt(accountNumber);

            char accountTypeChar = accountNumber.charAt(0);
            String accountType;

            if (accountTypeChar == '1') {
                accountType = "Savings";
            } else if (accountTypeChar == '2') {
                accountType = "Checking";
            } else {
                accountType = "Unknown";
            }

            System.out.println("Account Type: " + accountType);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Current Balance: " + balance);
            System.out.println("Balance inquiry successful!");

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid account number format!");
            System.out.println("Account numbers must be numeric.");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Account number is empty or invalid!");
        } finally {
            System.out.println("\n=========== RECEIPT ===========");
            System.out.println("Transaction Date: December 3, 2025");
            System.out.println("Transaction Type: Balance Inquiry");
            System.out.println("ATM Location: Main Branch");
            System.out.println("Thank you for banking with us!");
            System.out.println("================================\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== ATM Balance Check ===\n");

        System.out.println("--- Test 1: Valid Savings account ---");
        checkBalance("100123456", 15000.00);

        System.out.println("--- Test 2: Valid Checking account ---");
        checkBalance("200987654", 25000.00);

        System.out.println("--- Test 3: Invalid account format ---");
        checkBalance("ABC12345", 15000.00);

        System.out.println("--- Test 4: Empty account number ---");
        checkBalance("", 15000.00);

        System.out.println("All tests completed!");
    }
}

