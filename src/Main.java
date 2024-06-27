public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // else {
        //System.out.println("Неподдерживаемая операционная система");


        //Задание 2
        System.out.println("Задание 2");
        int clientOS2 = 0;
        int releaseDate = 2014;
        if (clientOS2 == 0 && releaseDate < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS2 == 0 && releaseDate >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS2 == 1 && releaseDate < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS2 == 1 && releaseDate >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // else {
        //System.out.println("Неподдерживаемая операционная система");


        //Задание 3
        System.out.println("Задание 3");
        int year = 2021;
        if (year >= 1584) {
            if (year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else if (year % 100 != 0) {
                if (year % 4 == 0) {
                    System.out.println(year + " год является високосным");
                } else
                    System.out.println(year + " год не является високосным");
            } else
                System.out.println(year + " год не является високосным");
        }

        //Задание 3. Вариант 2
        System.out.println("Задание 3. Вариант 2");
        int year2 = 2024;
        if (year2 >=1584 && year2 % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year2 % 100 !=0 && year2 % 4 == 0) {
            System.out.println(year2 + " год является високосным");
        } else
            System.out.println(year2 + " год не является високосным");


        //Задание 3. Вариант 3
        System.out.println("Задание 3. Вариант 3");
        int year3 = 1200;
        if ((year3 >=1584 && year3 % 400 == 0) || (year3 % 100 !=0 && year3 % 4 == 0)) {
            System.out.println(year3 + " год является високосным");
        } else
            System.out.println(year3 + " год не является високосным");



        //Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int day1 = 1;
        int day2 = day1 + 1;
        int day3 = day2 + 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + day1);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + day2);
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + day3);
        } else
            System.out.println("Доставки нет");


        //Задание 4. Вариант 2
        System.out.println("Задание 4. Вариант 2");
        int deliveryDistance2 = 95;
        int dayOne = 1;
        int dayTwo = dayOne + 1;
        int dayThree = dayTwo + 1;
        if (deliveryDistance2 <= 20) {
            System.out.println("Потребуется дней: " + dayOne);
        } else if (deliveryDistance2 <= 60) {
            System.out.println("Потребуется дней: " + dayTwo);
        } else if (deliveryDistance2 <= 100) {
            System.out.println("Потребуется дней: " + dayThree);
        } else
            System.out.println("Доставки нет");


        //Задание 4. Вариант 3
        System.out.println("Задание 4. Вариант 3");
        int deliveryDistance3 = 95;
        int day01 = 1;
        int day02 = day01 + 1;
        int day03 = day02 + 1;
        if (deliveryDistance3 <= 20) {
            System.out.println("Потребуется дней: " + day01);
        } else if (deliveryDistance > 20 && deliveryDistance3 <= 60) {
            System.out.println("Потребуется дней: " + day02);
        } else if (deliveryDistance > 60 && deliveryDistance3 <= 100) {
            System.out.println("Потребуется дней: " + day03);
        } else
            System.out.println("Доставки нет");


        //Задание 5
        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Месяца под таким номером не существует");

        }
    }
}