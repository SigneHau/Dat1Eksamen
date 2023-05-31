package TjekPassword;

import javafx.beans.binding.Bindings;
//1. Skriv en klasse PasswordValidater med attributterne
public class PasswordValidater {
    private int minLength;
    private int maxLength;
    private boolean numberRequired;
    private boolean upperCaseRequired;
    private boolean hasLowerCase;

    public PasswordValidater(int minLength, int maxLength, boolean numberRequired, boolean upperCaseRequired, boolean hasLowerCase) {
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.numberRequired = numberRequired;
        this.upperCaseRequired = upperCaseRequired;
        this.hasLowerCase = hasLowerCase;
    }
//2. Skriv metoden public boolean isValid(String password) i klassen. Metoden skal
//undersøge om password opfylder følgende regler:
    //a. password må ikke være kortere end minLength eller længere end maxLength.
    public boolean isValid(String password) {
        int length = password.length();
        if ((length < minLength) || (length > maxLength)) {
            return false;
        }
//password skal indeholde minimum ét tal, hvis numbersRequired er true. Du kan bruge
//metoden Character.isDigit() til dette.
        if (numberRequired) {
            boolean hasNumber = false;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) { //gennemgå hvert bogstav i paswordet.
                    hasNumber = true;
                    break; // den stopper efter at have fundet det første tal - hopper ud af forloppet.
                }
            }
            if (!hasNumber) {
                return false;
            }

        }

        if(upperCaseRequired) {
            boolean hasUpperCase = false;

            for (int i = 0; i < length; i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    hasUpperCase = true;
                    break;
                }
            }
            if (!hasUpperCase) {
                return false;
            }
        }

        // Check lowercase requirement
        boolean hasLowerCase = false;
        for (int i = 0; i < length; i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                hasLowerCase = true;
                break;
            }
        }
        if (!hasLowerCase) {
            return false;
        }

        return true;
    }
}




