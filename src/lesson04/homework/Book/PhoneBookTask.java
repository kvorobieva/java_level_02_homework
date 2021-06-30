package lesson04.homework.Book;

public class PhoneBookTask {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "+79631234567");
        phoneBook.add("Петров", "+79631234568");
        phoneBook.add("Сидоров", "+79631234569");
        phoneBook.add("Павлов", "+79631234560");
        phoneBook.add("Иванов", "+79631234517");
        phoneBook.add("Сидоров", "+79631234527");

        for (String name : phoneBook.getAllNames()) {
            System.out.println(name + " " + phoneBook.get(name));
        }
    }
}