import java.util.Scanner;

public class TestTask2 {
    public static void main(String[] args) {

    PhoneBook phoneBook = new PhoneBook();

    System.out.print("Please,enter fio: ");

    Scanner fioInput = new Scanner(System.in);
    String fio;

    fio = fioInput.nextLine();
    phoneBook.printContact(fio);


    }
}
