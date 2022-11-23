import java.time.LocalDate;

public class Main {

        public static void main (String[]args){
            System.out.println(LocalDate.now());
            System.out.println("Задание 1. ");
            int year = LocalDate.now().getYear();
            year = 2020;//вводится любой год//
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " является високосным ");
            } else {
                System.out.println(year + " не является високосным ");

            }
            //Задание 2.
            System.out.println("Задание 2. ");
            int currentYear = LocalDate.now().getYear();
            int clientDeviceYear = currentYear;
            currentYear = 2014;
            clientDeviceYear = 2014;//Вводится год выпуска устройства//
            if (clientDeviceYear < 2015) {
                System.out.println("установите облегчённую версию для IOS по ссылке");
            } else {
                System.out.println("установите версию для IOS по ссылке ");
            }

            if (clientDeviceYear < 2015) {
                System.out.println("установите облегчённую версию для Android по ссылке");
            } else {
                System.out.println("установите версию для Android по ссылке ");
            }

            //Задание 3.//
            System.out.println("Задание 3.");
            int deliveryDistance = 95;
            int deliveryDays = 1;
            if (deliveryDistance > 20) {

            } else deliveryDays++;
            {
                if (deliveryDistance > 60) {
                    deliveryDays++;
                }
                System.out.println("потребуется  " + deliveryDays + " дней ");
            }

        }
    }




