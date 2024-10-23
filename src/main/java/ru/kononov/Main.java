package ru.kononov;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Реализуйте удаление из листа всех дубликатов
        System.out.println(StreamMethods.duplicateDelete(List.of(2,4,6,3,3,5,3,5,8,9,0,6)));

        //Найдите в списке целых чисел 3-е наибольшее число (пример: 5 2 10 9 4 3 10 1 13 => 10)
        System.out.println(StreamMethods.thirdGreatestNumber(List.of(5,2,10,9,4,3,10,1,13)));

        //Найдите в списке целых чисел 3-е наибольшее «уникальное» число (пример: 5 2 10 9 4 3 10 1 13 => 9, в отличие от прошлой задачи здесь разные 10 считает за одно число)
        System.out.println(StreamMethods.thirdGreatestUniqNumber(List.of(5,2,10,9,4,3,10,1,13)));

        //Имеется список объектов типа Сотрудник (имя, возраст, должность), необходимо получить список имен 3 самых старших сотрудников с должностью «Инженер», в порядке убывания возраста
        ArrayList<Employee> employees = new ArrayList<>(){{
            add(new Employee("Андрей","аналитик",38));
            add(new Employee("Андрей","Инженер",60));
            add(new Employee("Владимир","тестировщик",25));
            add(new Employee("Владимир","Инженер",25));
            add(new Employee("Сергей","Инженер",50));
            add(new Employee("Виктор","разработчик",33));
            add(new Employee("Виктор","Инженер",33));
            add(new Employee("Мария","дизайнер",27));
            add(new Employee("Мария","Инженер",27));
            add(new Employee("Светлана","руководитель",42));
        }};
        System.out.println(StreamMethods.threeOldestEmployers(employees));

        //Имеется список объектов типа Сотрудник (имя, возраст, должность), посчитайте средний возраст сотрудников с должностью «Инженер»
        System.out.println(StreamMethods.averageAgeFromPosition(employees, "Инженер"));

        //Найдите в списке слов самое длинное
        System.out.println(StreamMethods.longestWord(List.of("парашют","жук","холодильник","код","листва")));

        //Имеется строка с набором слов в нижнем регистре, разделенных пробелом. Постройте хеш-мапы, в которой будут хранится пары: слово - сколько раз оно встречается во входной строке
        System.out.println(StreamMethods.madeMapFromString("батя ёрш ёж комар ёж батя комар ёж василек"));

        //Отпечатайте в консоль строки из списка в порядке увеличения длины слова, если слова имеют одинаковую длины, то должен быть сохранен алфавитный порядок
        System.out.println(StreamMethods.sortWordsByLength("aa eee llll ffff ggggg bb aaaa gggg kkk bbb aaa aaaaa hhhhh"));

        //Имеется массив строк, в каждой из которых лежит набор из 5 строк, разделенных пробелом, найдите среди всех слов самое длинное, если таких слов несколько, получите любое из них
        System.out.println(StreamMethods.longestWordFromArray(new String[]{"a aa aaa aaaa aaaaa aaaaaaa", "b bb bbb bbbb bbbbbbbbbbbb","c cc ccc cccccc"}));
    }


}