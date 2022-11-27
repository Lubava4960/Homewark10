import java.time.LocalDate;

public class Main {

    public static void printIsYearLeap(int year) {


        boolean leapYear = isYearLeap(year);
        printIsYearLeapResult(year, leapYear);
    }

    private static boolean isYearLeap(int year) {

        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void printIsYearLeapResult(int year, boolean leapYear) {
        if (leapYear) {
            System.out.println(year + " является високосным ");
        } else {
            System.out.println(year + " не является високосным ");

        }
    }
    //Задание 2.
    public static void printApplicationVersionInstallMessage(int clientOS, int clientDeviceYear) {
        boolean OldDevice = isOldDevice(clientDeviceYear);
        printApplicationVersionInstallMessageResualt(clientOS, OldDevice);
    }
    private static String getClientOS(int clientOS) {
        if (clientOS == 0) {
            return "IOS";
        } else if (clientOS == 1) {
            return "Android";
        }
        return "для вашей ОС";
    }

    private static boolean isOldDevice(int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        return clientDeviceYear < currentYear;
    }

    public static void printApplicationVersionInstallMessageResualt(int clientOS, boolean OldDevice) {
        if (OldDevice) {
            System.out.println("установите облегчённую версию" + getClientOS(clientOS) + "по ссылке");
        } else {
            System.out.println("установите версию" + getClientOS(clientOS) + "по ссылке ");
        }
    }
        //Задание 3.//

        public static void calculateDeliveryDaysAmount ( int deliveryDistance){
            int deliveryDays = calculateDeliveryDaysAmountResult(deliveryDistance);
            if (deliveryDays == 0) {
                System.out.println(" доставка не возможна ");
            } else {
                System.out.println(" Дней для доставки: " + deliveryDays);
            }
        }
        private static int calculateDeliveryDaysAmountResult ( int deliveryDistance){
            int firstDeliveryArea = 20;
            int secondDeliveryArea = 60;
            int thirdDeliveryArea = 100;
            if (deliveryDistance <= 0 || deliveryDistance > thirdDeliveryArea) {
                return 0;
            } else if (deliveryDistance < firstDeliveryArea) {
                return 1;
            } else if (deliveryDistance < secondDeliveryArea) {
                return 2;
            } else {
                return 3;
            }
        }


        public static void main (String[]argsStrings){
            System.out.println("Задание 1");
            printIsYearLeap(2022);
            System.out.println("Задание 2");
            printApplicationVersionInstallMessage(0, 2022);
            System.out.println("Задание 3");
            calculateDeliveryDaysAmount(25);
        }

    }



