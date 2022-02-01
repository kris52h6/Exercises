import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sorting  {
    private ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        sorting.getAndPrintNames();
    }

    public void getAndPrintNames() {
        Scanner sc = new Scanner(System.in);

        while (list.size() < 5) {
            String stringInput = sc.next();
            list.add(stringInput);
        }
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("list sorted: \n" + list);

    }

}