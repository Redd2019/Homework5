public class Main {
    public static void main(String[] args) {
        task1();

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
}