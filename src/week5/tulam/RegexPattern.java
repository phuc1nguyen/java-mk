package week5.tulam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPattern {
    public static void main(String[] args) {
        String test = "So 546 dien thoai cua toi la 0918201398";
        Pattern pattern = Pattern.compile(".*(0[0-9]{9}).*");
        Matcher matcher = pattern.matcher(test);

        String phone = "";
        if (matcher.find()) {
            phone = matcher.group(1);
        }
        System.out.println(phone);
    }
}
