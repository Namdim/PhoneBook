import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> contacts ;
    private ArrayList<ArrayList<String>> phoneNumbs;

    public PhoneBook(){
        contacts = new HashMap<String, ArrayList<String>>();
        phoneNumbs = new ArrayList<ArrayList<String>>();

        addStartDataPhoneBook();
    }

    public void printContact(String fio){
        if(contacts.get(fio) != null) {
            System.out.print(contacts.get(fio));
            System.out.println();
        }else {
            System.out.println(fio+" doesn't exist in database");
        }
    }

    private void addStartDataPhoneBook(){
        phoneNumbs.add(new ArrayList<String>());
        phoneNumbs.get(0).add("+8 800 2000 500");
        phoneNumbs.get(0).add("+8 800 2000 600");

        phoneNumbs.add(new ArrayList<String>());
        phoneNumbs.get(1).add("+8 800 2000 700");

        phoneNumbs.add(new ArrayList<String>());
        phoneNumbs.get(2).add("+8 800 2000 800");
        phoneNumbs.get(2).add("+8 800 2000 900");
        phoneNumbs.get(2).add("+8 800 2000 000");

        contacts.put("Иванов И.И.", phoneNumbs.get(0));
        contacts.put("Петров П.П.", phoneNumbs.get(1));
        contacts.put("Сидоров С.С.", phoneNumbs.get(2));
    }


}
