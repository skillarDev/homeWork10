import java.util.LinkedList;
import java.util.List;

public class PhoneBook {
    // объявляем поле класса которое ссылается на коллекцию List где будем хранить добавленные объекты класса.
    /* не использую интерфейс Map потому что по условию задачи - фамилии (в данном контексте ключи Map) могут повторяться в случае однофамильцев
    и так как по условию желательно не добавлять лишний функционал, в данном случае дополнительные поля для использования в качестве ключа,
    то единственной альтернативой вроде бы остается интерфейс List */
    public static List list = new LinkedList();

    // поля объекта
    private String lastName;
    private long phoneNumber;

    // конструктор
    public PhoneBook(String lastName, long phoneNumber){
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    // метод класса который добавляет переданный объект в колеекцию List
    public static void add(PhoneBook entry){
        list.add(entry);
    }

    // метод класса который бежит по коллекии List и сравнивает имена
    public static void get(String name){
        for (int i = 0; i < list.size(); i++) {
            PhoneBook entry = (PhoneBook) list.get(i); // делаем cast объекта List к классу PhoneBook чтобы можно было обратится к полю объекта
            if(entry.getName().equals(name)){ //сравниваем c помощью equals, т.к. сравнить нужно только строку hashCode вроде будет лишним
                System.out.println(entry.getName()+" "+entry.getPhoneNumber());
                continue;
            }
        }

    }


    public String getName() {
        return lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
