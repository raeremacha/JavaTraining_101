package m4_act5;


public class AccountValidator {
    public static void validateAccountNumber(String accountNumber) throws InvalidAccountNumberException {
        if (accountNumber == null) {
            throw new NullPointerException("Account number cannot be null");
        }

        for (char c : accountNumber.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new InvalidAccountFormatException("Account number must contain only digits");
            }
        }

        if (accountNumber.length() != 10) {
            throw new InvalidAccountNumberException("Account number must be exactly 10 digits");
        }

        System.out.println("Valid account number: " + accountNumber);
    }

    private static void validateAndPrint(String testName, String accountNumber) {
        System.out.println("Test " + testName + ":");
        try {
            validateAccountNumber(accountNumber);
        } catch (InvalidAccountNumberException e) {
            System.out.println("Warning: " + e.getMessage());
        } catch (InvalidAccountFormatException e) {
            System.out.println("Warning: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Warning: " + e.getMessage());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("--- Account Number Validation Test ---");

        validateAndPrint("1: Valid (1234567890)", "1234567890"); 
        validateAndPrint("2: Too short (123)", "123"); 
        validateAndPrint("3: Contains letters (1234SBC890)", "1234SBC890");
        validateAndPrint("4: Contains space (1234 567890)", "1234 567890");
        validateAndPrint("5: Null value", null);
    }
}
