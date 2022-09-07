import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка\nВведите размер списка: ");
        Scanner scanner = new Scanner(System.in);
        int listSize = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите верхнюю границу для значений: ");
        int maxValue = Integer.parseInt(scanner.nextLine());
        logger.log("Создаём и наполняем список\n Вот случайный список: ");
        logger.log("Просим пользователя ввести входные данные для фильтрации\n Введите порог для фильтра: ");
        int filterValue = Integer.parseInt(scanner.nextLine());
    }
}
