package week5.tulam;

public class RegexExample {
    public static void main(String[] args) {
        String test = "     Nguyen 13     Phuc....";
        test = test.replaceAll("\\d", "");
        System.out.println(test);
        test = test.replaceAll("\\s+", " ");
        System.out.println(test);
        test = test.replaceAll("^\\s+", "");
        System.out.println(test);
        test = test.replaceAll("\\.", "");
        System.out.println(test);


    }
}
