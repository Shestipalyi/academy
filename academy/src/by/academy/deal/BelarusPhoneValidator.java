package by.academy.deal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {
    public static final String regexp = "\\+375(17|25|29|33|44)\\d{7}";
    private static final Pattern pattern = Pattern.compile(regexp);

    @Override
    public boolean validate(String strPhoneNumber) {
        Matcher matcher = pattern.matcher(strPhoneNumber.trim());
        return matcher.matches();
    }
}
