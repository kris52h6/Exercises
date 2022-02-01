import java.util.ArrayList;

public class List {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("cow");
        strings.add("horse");
        strings.add("ape");

        boolean result = doesArrayListContainString(strings, "cow");
        System.out.println(result);
        System.out.println(strings);
    }

    public static boolean doesArrayListContainString(ArrayList list, String str) {
        if (!list.contains(str)) {
            list.add(str);
            return false;
        } else {
            System.out.println("String has been found");
            return true;
        }
    }
}
