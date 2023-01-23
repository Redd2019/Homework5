public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println("Задание 1");
        int clientOs = 1;
                switch (clientOs) {
                    case 0:
                        System.out.println("Установите версию приложения для iOS по ссылке");
                        break;
                    case 1:
                        System.out.println("Установите версию приложения для Android по ссылке");
                        break;
                    default:
                        System.out.println("Добро пожаловать в браузерную версию!");
                }
    }

    public static void task2() {
        System.out.println("Задание 2");
        int clientOs = 0;
        int clientDeviceYear = 2015;
        if (clientDeviceYear <= 2015) {
            if (clientOs == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientDeviceYear > 2015) {
            if (clientOs == 1){
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            if (clientOs==0){
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            }
    }

    public static void task3() {
        System.out.println("Задание 3");
        int year = 2021;
        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");;
        }
    }

    public static void task4() {
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if(deliveryDistance <20){
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            if (deliveryDistance <60) {
                int deliveryDays1 = deliveryDays + 1;
                System.out.println("Потребуется дней: " + deliveryDays1);
            }
            if (deliveryDistance > 60 && deliveryDistance <100) {
                int deliveryDays2 = deliveryDays + 2;
                System.out.println("Потребуется дней: " + deliveryDays2);
            }
            if (deliveryDistance >100) {
                System.out.println("Доставка не осуществляется.");
            }
        }
    }

    public static void task5() {
        System.out.println("Задание 5");
        int monthNumber = 12;

        switch (monthNumber) {
            case 12:
                System.out.println("Зима");
                break;
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неверное значение");
        }
    }
}