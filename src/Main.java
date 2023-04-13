import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
//        task4();
//        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 56324;
        checkLeapYear(year);
    }

    public static void checkLeapYear(int year) {
       if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
          System.out.println(year + " год - невисокосный год");
       } else {
           System.out.println(year + " год - високосный год ");
       }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        char clientOS = 0;
        int clientDeviceYear = 2020;
        int currentYear = LocalDate.now().getYear();
        checkPhoneVersion(clientOS, currentYear, clientDeviceYear);

    }
    public static void checkPhoneVersion(char clientOS, int currentYear, int clientDeviceYear) {
            if (clientOS == 0 && clientDeviceYear <= currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 0 && clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1 && clientDeviceYear <= currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientOS == 1 && clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        if (checkDistance(deliveryDistance) > 0) {
            System.out.println("Потребуется дней: " +checkDistance(deliveryDistance));
        } else {
            System.out.println("Нет");
        }
    }
    public static int checkDistance (int deliveryDistance) {
        int deliveryTime;
        if (deliveryDistance <= 20) {
            deliveryTime = 1;
        } else if (deliveryDistance <= 60) {
            deliveryTime = 2;
        } else if (deliveryDistance <= 100) {
            deliveryTime = 3;
        } else {
            deliveryTime = 0;
        }
        return deliveryTime;
    }
}

