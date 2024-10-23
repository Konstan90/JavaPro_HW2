package ru.kononov;

import java.util.Arrays;
import java.util.List;

public class MaxElem {
    static int max(String s) {
        String[] array = s.split(" ");
        return Arrays.stream(array).sorted((x,y)-> y.length()-x.length()).findFirst().get().length();
    }
    static String maxWord(String s) {
        String[] array = s.split(" ");
        return Arrays.stream(array).sorted((x,y)-> y.length()-x.length()).findFirst().get().toString();
    }
}
