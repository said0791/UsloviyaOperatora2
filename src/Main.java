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

        int iOS = 0;
        int clientDeviceYear = 2015;

        String osName = (clientOS == 1) ? "Android" : "iOS";
        String version = (clientDeviceYear < 2015) ? "облегченную версию" : "версию";

        System.out.println("Установите " + version + " приложения для " + osName + " по ссылке");


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

            if (monthNumber < 1 || monthNumber > 12) {
                System.out.println("Ошибка: номер месяца должен быть от 1 до 12");
                return;
            }

            String season = switch (monthNumber) {
                case 12, 1, 2 -> "зима";
                case 3, 4, 5 -> "весна";
                case 6, 7, 8 -> "лето";
                case 9, 10, 11 -> "осень";
                default -> "неизвестный сезон";
            };

            System.out.println("Месяц №" + monthNumber + " принадлежит к сезону: " + season);
        }
    }
}




