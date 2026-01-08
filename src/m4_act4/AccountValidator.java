package m4_act4;


public class AccountValidator {

    /**
     * Validates the given account number.
     * Rules:
     *  - If accountNumber is null -> throw NullPointerException("Cannot be null")
     *  - If length != 10          -> throw Exception("Must be 10 digits")
     *  - Else                     -> print "Valid account: [number]"
     *
     * @param accountNumber the account number string to validate
     * @throws Exception if the length is not 10 (non-null case)
     */
    public static void validateAccountNumber(String accountNumber) throws Exception {
        if (accountNumber == null) {
            // As required: specifically throw NullPointerException for null input
            throw new NullPointerException("Cannot be null");
        }

        if (accountNumber.length() != 10) {
            // As required: throw a generic Exception for invalid length
            throw new Exception("Must be 10 digits");
        }

        // If we reached here, it's valid
        System.out.println("Valid account: " + accountNumber);
    }

    public static void main(String[] args) {
        // Test cases per instruction:
        String[] tests = {
            "1234567890", // valid - should pass
            "123",        // invalid - too short
            null          // invalid - null
        };

        for (String test : tests) {
            try {
                validateAccountNumber(test);
            } catch (NullPointerException npe) {
                System.out.println("Error: " + npe.getMessage());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

