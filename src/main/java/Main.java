import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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
        logger.log("Создаём и наполняем список");

        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            list.add(random.nextInt(maxValue + 1));
        }
        System.out.printf("Выводим случайный список на экран: %s\n", list);

        logger.log("Просим пользователя ввести входные данные для фильтрации\nВведите порог для фильтра: ");
        int filterValue = Integer.parseInt(scanner.nextLine());

        Filter filter = new Filter(filterValue);
        filter.filterOut(list);
        logger.log("Завершаем программу");
    }
}
