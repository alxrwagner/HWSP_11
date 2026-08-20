import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        checkYear(2021);

        System.out.println();

        System.out.println("Задача 2");
        selectAppBuild(0, 2026);

        System.out.println();

        System.out.println("Задача 3");
        calculateDeliveryDays(30);
    }

    public static void checkYear(int year) {
        if (year < 1584) {
            System.out.println("Високосный год был введен в 1584 году");
        } else if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
    }

    public static void selectAppBuild(int clientOS, int yearReleaseDevice) {
        int currentYear = LocalDate.now().getYear();

        if (clientOS > 1 || clientOS < 0) {
            System.out.println("Для Вашей версии ОС воспользуйтесь WEB-версией");
            return;
        }

        if (clientOS == 0 && yearReleaseDevice < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && yearReleaseDevice >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && yearReleaseDevice < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && yearReleaseDevice >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Для Вашей операционной системы приложение скоро будет доступно");
        }
    }

    public static void calculateDeliveryDays(int deliveryDistance) {
        int deliveryDates = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDates);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryDates + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryDates + 2));
        } else {
            System.out.println("Доставки нет");
        }
    }
}