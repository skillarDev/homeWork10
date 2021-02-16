import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 10.1
        List arrayWords = new ArrayList();
        arrayWords.add("Дмитрий");
        arrayWords.add("Иван");
        arrayWords.add("Ольга");
        arrayWords.add("Петр");
        arrayWords.add("Дмитрий");
        arrayWords.add("Ольга");
        arrayWords.add("Ирина");
        arrayWords.add("Дмитрий");
        arrayWords.add("Юрий");
        arrayWords.add("Николай");
        arrayWords.add("Петр");
        arrayWords.add("Анна");
        arrayWords.add("Надежда");
        arrayWords.add("Ирина");
        System.out.println(arrayWords.size()); //справочная информация о размере исходного массива
        System.out.println(arrayWords.toString()); //справочная информация о содержимом исходного массива
        Set uniqueArrayWords = new HashSet(); //создаю объект коллекции (класса) HashSet
        for (int i = 0; i < arrayWords.size(); i++) {
            uniqueArrayWords.add(arrayWords.get(i));
        }
        System.out.println(uniqueArrayWords.size()); //справочная информация о размере объекта HashSet
        System.out.println(uniqueArrayWords.toString()); //справочная информация о содержимом объекта HashSet
        System.out.println();
        int count = 0;

        for (Object entry : uniqueArrayWords) {
            for (int i = 0; i < arrayWords.size(); i++) {
                if(entry.equals(arrayWords.get(i))){
                    count++; // берем запись из Set и сравниваем с записями в List, если true то увеличиваем счетчик
                }
            }
            System.out.println(entry+" - количество вхождений: "+count); // перед переходом к следующей записи Set - печатаем текущую запись
                                                                         // и количество вхождений в исходном списке
            count = 0; // обнуляем счетчик
        }
        System.out.println();




        // 10.2
        // создаем объекты класса PhoneBook с полями фамилия и номер телефона
        PhoneBook entry1 = new PhoneBook("Иванов", 89001112233L);
        PhoneBook entry2 = new PhoneBook("Петров", 89002222233L);
        PhoneBook entry3 = new PhoneBook("Иванов", 89002224434L);
        PhoneBook entry4 = new PhoneBook("Сидоров", 89005558833L);
        PhoneBook entry5 = new PhoneBook("Котов", 89007779933L);

        // цитата из задачи - "класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров"
        // добавляем объекты в коллекцию LinkedList класса PhoneBook
        PhoneBook.add(entry1);
        PhoneBook.add(entry2);
        PhoneBook.add(entry3);
        PhoneBook.add(entry4);
        PhoneBook.add(entry5);
        System.out.println(PhoneBook.list.toString()); // выведем всю инфу о добавленных объектах в "телефонную книгу"

        // ищем телефон по фамилии
        PhoneBook.get("Иванов");
    }
}
