package main.java.com.yhtyyar.simple_algorithms;

import java.util.*;

public class TextAnalyzer {

    static  String text1 = "[({})]";
    static  String text2 = "[(){}";

     public static void main(String [] args) {

     }



    private static boolean isValid (String string) {

        Map <Character, Character> closeBracket = new HashMap <>();
        closeBracket.put('}', '{');  // ключь и значение
        closeBracket.put(')', '(');
        closeBracket.put(']', '[');


        HashSet <Character> openBracket = new HashSet <>(closeBracket.values()); // передаем значения
        ArrayDeque <Character> arrayDeque = new ArrayDeque <>();

        char[] chars = string.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char array = chars [i];

            // проверка на присутсвие значения и возвращает true, если там есть все эелементы
            if (openBracket.contains(array)) {
                arrayDeque.push(array); // добавляет элемент в самое начало
            } else {
                if (arrayDeque.peek() != closeBracket.get(array) ) {
                    return false;
                }
                if (arrayDeque.isEmpty()) {
                    return false;
                }

                arrayDeque.poll(); // возвращает с удалением элемента из начала очереди
            }
        }

        return arrayDeque.isEmpty(); // возвращает true если пустая строка, если нет то false

    }
}
