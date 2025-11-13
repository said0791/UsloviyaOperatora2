import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задания 1");

        int clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задания 2");

        clientOS = 0;
        int clientDeviceYear = 2015;

        if (clientDeviceYear < 2015) {

            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {

            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }

            System.out.println("Задания 3");
        int year = 1584;

        if (year <= 1584) {
            System.out.println(year + " год - до введения григорианского календаря");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("Задания 4");

        int deliveryDistance = 95;
        int deliveryDays;

        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else if (deliveryDistance > 60) {
            deliveryDays = 3;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 20) {
            deliveryDays = 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            deliveryDays = 1;
            System.out.println("Потребуется дней: " + deliveryDays);

            System.out.println("Задания 5");

            int monthNumber = 12;

            switch (monthNumber) {
                case 12: case 1: case 2:
                    System.out.println("Месяц №" + monthNumber + " - зима");
                    break;
                case 3: case 4: case 5:
                    System.out.println("Месяц №" + monthNumber + " - весна");
                    break;
                case 6: case 7: case 8:
                    System.out.println("Месяц №" + monthNumber + " - лето");
                    break;
                case 9: case 10: case 11:
                    System.out.println("Месяц №" + monthNumber + " - осень");
                    break;
                default:
                    System.out.println("Ошибка: номер месяца должен быть от 1 до 12");
            }
    }
}}}




