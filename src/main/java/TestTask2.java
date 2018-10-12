import java.util.ArrayList;
import java.util.HashMap;

public class TestTask2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> phoneNumbs = new ArrayList<ArrayList<String>>();

        phoneNumbs.add(new ArrayList<String>());
        phoneNumbs.get(0).add("+8 800 2000 500");
        phoneNumbs.get(0).add("+8 800 2000 600");

        phoneNumbs.add(new ArrayList<String>());
        phoneNumbs.get(1).add("+8 800 2000 700");

        phoneNumbs.add(new ArrayList<String>());
        phoneNumbs.get(2).add("+8 800 2000 800");
        phoneNumbs.get(2).add("+8 800 2000 900");
        phoneNumbs.get(2).add("+8 800 2000 000");

        HashMap<String, ArrayList<String>> phoneBook = new HashMap<String, ArrayList<String>>();
        phoneBook.put("Иванов И.И.", phoneNumbs.get(0));
        phoneBook.put("Петров П.П.", phoneNumbs.get(1));
        phoneBook.put("Сидоров С.С.", phoneNumbs.get(2));

        System.out.print( phoneBook.get("Сидоров С.С.") );
    }
}
