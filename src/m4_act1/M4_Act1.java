package m4_act1;


public class M4_Act1 {

    public static String getAccountName(String accountNumber) {
        if ("ACC-001".equals(accountNumber)) {
            return "Juan Dela Cruz";
        } else if ("ACC-002".equals(accountNumber)) {
            return "Maria Santos";
        } else {
            return null;
        }
    }

    public static void testCase(String accountNumber) {
        System.out.println("Looking up account: " + accountNumber);
        try {
            String name = getAccountName(accountNumber);
            String upperName = name.toUpperCase(); // will throw NullPointerException if name is null
            System.out.println("Account holder: " + upperName);
        } catch (NullPointerException e) {
            System.out.println("Error: Account not found!");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("=== Bank Account Name Display ===\n");
        testCase("ACC-001");
        testCase("ACC-999");

        System.out.println("=== Program completed successfully! ===");
    }
}