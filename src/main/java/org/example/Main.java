package org.example;

import java.util.*;

/**
 * Main class
 */
public class Main {
    public static void main(String[] args) {
        //Хранит уже отсортированный список, без повторений, поэтому использован TreeSet
        Set<String> listLang = new TreeSet<>();
        final String word = "мама и папа гуляли по вечернему городу и зашли домой попить воды";
        //Использована Детерминированная функция без побочных эффектов (чистая)
        //Нет операции ввода-вывода, нет изменений объекта, изменений глобальных переменных и тд
        //Результат функции зависит только от вводных параметров
        MyFunction myFunction = (list, words) -> list.addAll(
                Arrays.asList(words.split(" ")));
        myFunction.addWords(listLang, word);
        //Список уже отфильтрован и отсортирован
        listLang.stream()
                .forEach(System.out::println);
    }
}
