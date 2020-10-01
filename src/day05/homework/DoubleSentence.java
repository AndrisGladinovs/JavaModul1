package day05.homework;

public class DoubleSentence {
    public static void main(String[] args) {
        String sentence = "Today is a good day.";
        System.out.println(sentence);
        System.out.println(sentence + " " + sentence);
        //Переменую стринг можно сложить. В результате она дублируется.

        /* Переменную стринг нельзя умножить на саму себя.
        Это приводит к ошибки операционного типа для бинарного оператора.
        Оператор не понимает значение действий нашей функции умножить.
        */
    }
}