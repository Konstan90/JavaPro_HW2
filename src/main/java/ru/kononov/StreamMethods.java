package ru.kononov;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMethods {
    /**
     Реализуйте удаление из листа всех дубликатов
     */
    static List duplicateDelete(List l) {
        return l.stream().distinct().toList();
    }

    /**
     * Найдите в списке целых чисел 3-е наибольшее число (пример: 5 2 10 9 4 3 10 1 13 => 10)
     */
    static Integer thirdGreatestNumber(List<Integer> l) {
        return l.stream()
                .sorted((x,y)->(y-x))
                .toList()
                .get(2);
    }

    /**
     * Найдите в списке целых чисел 3-е наибольшее «уникальное» число (пример: 5 2 10 9 4 3 10 1 13 => 9, в отличие от прошлой задачи здесь разные 10 считает за одно число)
     */
    static Integer thirdGreatestUniqNumber(List<Integer> l) {
        return l.stream()
                .distinct()
                .sorted((x,y)->(y-x))
                .toList()
                .get(2);
    }

    /**
     * Имеется список объектов типа Сотрудник (имя, возраст, должность), необходимо получить список имен 3 самых старших сотрудников с должностью «Инженер», в порядке убывания возраста
     */
     static List<Employee> threeOldestEmployers(List<Employee> l) {
        return l.stream()
                .filter(x->x.position=="Инженер")
                .sorted((x,y)->(y.age-x.age))
                .limit(3)
                .toList();
    }

    /**
     * Имеется список объектов типа Сотрудник (имя, возраст, должность), посчитайте средний возраст сотрудников с должностью «Инженер»
    */
    static double averageAgeFromPosition(List<Employee> l, String position) {
        return l.stream()
                .filter(x->x.position==position)
                .mapToInt(Employee::getAge)
                .average()
                .getAsDouble();
    }

    /**
     * Найдите в списке слов самое длинное
     */
    static String longestWord(List<String> l) {
        return l.stream()
                .sorted((x,y)->(y.length()-x.length()))
                .findFirst()
                .get();
    }

    /**
     * Имеется строка с набором слов в нижнем регистре, разделенных пробелом. Постройте хеш-мапы, в которой будут хранится пары: слово - сколько раз оно встречается во входной строке
     */
    static Map madeMapFromString(String s) {
        List<String> wordsArray = List.of(s.split(" "));
        return wordsArray.stream()
                .distinct()
                .collect(Collectors.toMap(
                        word -> word,
                        word -> wordsArray.stream().filter(x->x.equals(word)).count()
                ));
    }

    /**
     * Отпечатайте в консоль строки из списка в порядке увеличения длины слова, если слова имеют одинаковую длины, то должен быть сохранен алфавитный порядок
     */
    static List sortWordsByLength(String s) {
        return List.of(s.split(" "))
                .stream()
                .sorted()
                .sorted(Comparator.comparingInt(String::length))
                .toList();
    }

    /**
     * Имеется массив строк, в каждой из которых лежит набор из 5 строк, разделенных пробелом, найдите среди всех слов самое длинное, если таких слов несколько, получите любое из них
     */
    static String longestWordFromArray(String[] s) {
        return Arrays.stream(s)
                .map(str -> str.split(" "))
                .flatMap(Arrays::stream)
                .sorted((x,y)->y.length()-x.length())
                .findFirst().get().toString();
    }
}
