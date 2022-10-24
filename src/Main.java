public class Main {

    // задача 1
    public static void definitionLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    // Задача 2
    public static void definitionClientOs(int clientOS, int clientDeviceYear) {

        if (clientOS >= 2 || clientOS < 0) {
            System.out.println("Неверное введены данные Операционной системы!");
        }
        if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке ... ");
        } else if (clientOS == 1 && clientDeviceYear > 2016) {
            System.out.println("Установите версию приложения для Android по ссылке...");
        }
        if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке...");
        } else if (clientOS == 0 && clientDeviceYear > 2016) {
            System.out.println("Установите  версию приложения для IOS по ссылке...");
        }
    }


        // Задача 3

        public static void determiningSpeedDeliveryint (int deliveryDistance) {
            if (deliveryDistance >= 0 && deliveryDistance <= 20) {
                System.out.println("Потребуется дней - 1");
            }
            if (deliveryDistance >= 21 && deliveryDistance <= 60) {
                System.out.println("Потребуется дней - 2");
            }
            if (deliveryDistance >= 61 && deliveryDistance <= 100) {
                System.out.println("Потребуется дней - 3");
            }
        }

            public static void main (String[]args){

                definitionLeapYear(2025);
                definitionClientOs(1, 2012);
                determiningSpeedDeliveryint(10);

            }
        }


