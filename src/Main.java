public class Main {
    public static void main(String[] args) {
        task1();
        task2();

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
}