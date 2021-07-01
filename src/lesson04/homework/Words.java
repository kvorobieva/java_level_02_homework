package lesson04.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Words {

    public static void main(String[] args) {
        ArrayList<String> homeAnimals = new ArrayList<>(Arrays.asList("собака", "кошка", "попугай", "хомяк", "кролик", "кошка", "крыса", "собака", "хорек", "черепаха", "кролик", "канарейка", "какаду"));
        HashMap<String, Integer> countMap = new HashMap<>();
        for (String animal : homeAnimals) {
            countMap.put(animal, countMap.containsKey(animal) ? countMap.get(animal) + 1 : 1);
        }
        System.out.print(countMap);
    }
}
