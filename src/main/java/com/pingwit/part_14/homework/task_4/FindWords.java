package com.pingwit.part_14.homework.task_4;

public class FindWords {
    public static void main(String[] args) {
        String text = """
                " While major gameplay components,
                are already in place and functioning, players help is needed to add some
                of the smaller features and content. Of course polishing the overall experience is importan
                t at the same time. Game has been extensively tested in closed group, but it is always important
                to hear fresh suggestions from larger crowd that come from various gaming backgrounds. Plan is to
                 make the game as good as possible but without compromising the core idea."
                """;

        String[] words = text.split("\\s+");
        /* используя split() ты сначала разделяешь массив, а затем в цикле ищешь слова, это получается двойная работа, попробуй использовать
         indexOf(String str, int fromIndex), так ты сможешь перемещать курсор по тексту и понадобиться только 1 проход для решения задачи, а не 2

         */

        int alertCount = 0;
        int addCount = 0;
        int goodCount = 0;
        int planCount = 0;

        for (String word : words) {
            if (word.equalsIgnoreCase("alert")) {
                alertCount++;
            }
            if (word.equalsIgnoreCase("add")) {
                addCount++;
            }
            if (word.equalsIgnoreCase("good")) {
                goodCount++;
            }
            if (word.equalsIgnoreCase("plan")) {
                planCount++;
            }
        }

        System.out.println("The word  'alert' meets " + alertCount + " times");
        System.out.println("The word  'add' meets " + addCount + " times");
        System.out.println("The word  'good' meets " + goodCount + " times");
        System.out.println("The word  'plan' meets " + planCount + " times");
    }
}

