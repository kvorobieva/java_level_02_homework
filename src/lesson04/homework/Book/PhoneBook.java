package lesson04.homework.Book;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PhoneBook {

    private final HashMap<String, HashSet<String>> book = new HashMap<>();

    public void add(String name, String numberPhone) {
        HashSet<String> numbers = book.containsKey(name) ? book.get(name) : new HashSet<>();
        numbers.add(numberPhone);
        book.put(name, numbers);
    }

    public HashSet<String> get(String name) {
        return book.get(name);
    }

    public Set<String> getAllNames(){
        return book.keySet();
    }

}
