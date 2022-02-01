import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Proper {

    public static void main(String[] args) {
        Proper proper = new Proper();

        String properCase = proper.stringToProperCase("hejsa jeg HEDDER kristian hvad hedder du");
        System.out.println(properCase);
    }

    public String stringToProperCase(String str) {
        String[] list = str.split(" ");

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
            if(list[i].equals(list[i].toUpperCase())){
                result.append(list[i]);
            }
            else if(list[i].length() > 3) {
                String firstChar = list[i].substring(0, 1);
                String restOfWord = list[i].substring(1);

                String string = list[i].toLowerCase();
                string.substring(0, 1).toUpperCase();

                result.append(firstChar.toUpperCase() + restOfWord);
            } else {
                result.append(list[i].toLowerCase());
            }
            result.append(" ");
        }
        return result.toString();
    }
}
