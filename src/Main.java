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