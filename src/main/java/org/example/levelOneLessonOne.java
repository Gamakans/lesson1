package org.example;
//Домашнаяя работа
//Уровень 1 урок 1


//Задание 1. Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод
//main().
public class levelOneLessonOne {
    public static void main(String[] args) {
//Задание 6.Методы из пунктов 2-5 вызовите из метода main() и посмотрите корректно ли они работают.
        System.out.println("Задание 2----------------");
        printThreeWords();
        System.out.println("Задание 3----------------");
        checkSumSign();
        System.out.println("Задание 4----------------");
        printColor();
        System.out.println("Задание 5----------------");
        compareNumbers();

    }

    //Задание 2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три
//    слова: Orange, Banana, Apple.
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    //Задание 3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и
//    инициализируйте их любыми значениями, которыми захотите. Далее метод должен
//    просуммировать эти переменные, и если их сумма больше или равна 0, то вывести в консоль
//    сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
    public static void checkSumSign() {
        int a = 5;
        int b = 6;
        if (a + b >= 0)
        {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }
//Задание 4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте
//    ее любым значением. Если value меньше 0 (0 включительно), то в консоль метод должен
//    вывести сообщение “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100
//    включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;

    public static void printColor() {
        int value = 101;
        if (value <= 0){
            System.out.println("Красный");
        } else if (value > 0 && value <= 100){
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }


    //Задание 5.Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и
//    инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b, то
//    необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
    public static void compareNumbers() {
        int a = 11, b = 11;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
