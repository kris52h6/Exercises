import java.util.ArrayList;

public class Search {

    public static void main(String[] args) throws Exception {
        Search search = new Search();
        ArrayList<String> list = new ArrayList<>();
        list.add("Kristian");
        list.add("John");
        list.add("Gertrud");

        int index = search.searchForStringInArray(list, "Kristian");
        System.out.printf("index is: %d" , index);

    }

   /* public int searchForStringInArray(ArrayList<String> list, String str)  {
        if (list.contains(str))
            return list.indexOf(str);
        else
            return -1;
    }*/

    public int searchForStringInArray(ArrayList<String> list, String str) throws Exception  {
            if (list.contains(str))
                return list.indexOf(str);
            else {
                throw new Exception("String doesn't exist!");
            }
    }

}
