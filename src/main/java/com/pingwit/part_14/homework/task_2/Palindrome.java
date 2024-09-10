package com.pingwit.part_14.homework.task_2;
// отформатируй код
public class Palindrome {
    public static boolean isPalindrome(String word) { // хорошее решение, а то что вынес в отдельный метод - красавчик
        word = word.toLowerCase();
        int start = 0;
        int end = word.length() - 1;
        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true; // если передать пустую строку или null, то будет true или ошибка, добавь проверку на этот случай
    }
    public static void main(String[] args) { // метод main по расположению должен идти первым
        String word = "level";
        System.out.println("The word " + word + " is Palindrome it is  " + isPalindrome(word)); // "The word '" + word + "' is - появились одинарные кавычки, чтобы выделить базовое слово
    }
}
