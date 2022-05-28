public class Main {
    public static void main(String[] args) {
        defineLeapYear(2022); // Задание 1
        suggestApp(0, 2000); // Задание 2
        calculateDeliveryTime(75); // Задание 3
        checkRepetitions("abccddefgghiijjkk"); // Задание 4
    }
        // Задание 1
    public static void defineLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        }else{
            System.out.println(year + " год не является високосным");
        }
    }
        // Задание 2
    public static void suggestApp(int clientOs, int clientDeviceYear) {
        if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облеченную версию приложения для iOS по ссылке");
        }

    }
        // Задание 3
    public static void calculateDeliveryTime(int delveryDistance) {
        if (delveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        }
        else if (delveryDistance >= 20 && delveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        }
        else if (delveryDistance > 60 || delveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        }


    }
        // Задание 4
    public static void checkRepetitions(String str) {
        for (int i = 1; i <= str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                System.out.println(str.charAt(i) + " - последний дублированный симовол. \n");
            }
        }
    }
}