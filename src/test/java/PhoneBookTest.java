import org.junit.Before;
import org.junit.Test;

public class PhoneBookTest {
    private static final String FIO_SIDOROV = "Сидоров С.С.";
    private static final String FIO_IVANOV = "Иванов И.И.";
    private static final String FIO_PETROV = "Петров П.П.";
    private static final String FIO_PUPKIN = "Пупкин В.С.";

    PhoneBook phoneBook;

    @Before
    public void setUp(){
        phoneBook = new PhoneBook();
    }

    @Test
    public void printContactTest(){
        phoneBook.printContact(FIO_IVANOV);
        phoneBook.printContact(FIO_PETROV);
        phoneBook.printContact(FIO_SIDOROV);
        phoneBook.printContact(FIO_PUPKIN);

    }
}
