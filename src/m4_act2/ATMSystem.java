package m4_act2;


public class ATMSystem {

    static double[] accounts = {10000, 15000, 20000};
    
    public static void processWithdrawal(String accountIndex, String amountInput) {
        System.out.println("Account=" + accountIndex + ", Amount=" + amountInput);

        try {
            int index = Integer.parseInt(accountIndex);
            double amount = Double.parseDouble(amountInput);

            double balance = accounts[index];

            if (amount > balance) {
                System.out.println("Current balance: " + balance);
                System.out.println("Withdrawal: " + amount);
                System.out.println("Insufficient funds! Cannot withdraw " + amount);
            } else {
                accounts[index] -= amount;
                System.out.println("Current balance: " + balance);
                System.out.println("Withdrawal: " + amount);
                System.out.println("New balance: " + accounts[index]);
                System.out.println("Withdrawal successful!");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input!");
            System.out.println("Please enter valid numbers.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Account not found!");
            System.out.println("Invalid account index.");
        } catch (Exception e) {
            System.out.println("Error: Transaction failed! (" + e.getMessage() + ")");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("=== ATM Withdrawal System ===\n");

        System.out.println("--- Test 1: Valid Withdrawal ---");
        processWithdrawal("1", "5000");

        System.out.println("--- Test 2: Invalid Account Index ---");
        processWithdrawal("abc", "5000");

        System.out.println("--- Test 3: Account Not Found ---");
        processWithdrawal("10", "5000");

        System.out.println("--- Test 4: Insufficient Funds ---");
        processWithdrawal("1", "20000");

        System.out.println("All tests completed!");
    }
}
