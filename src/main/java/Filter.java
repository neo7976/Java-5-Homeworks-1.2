import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        int count = 0;

        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильтрацию");
        for (Integer integer : source) {
            if (integer <= threshold)
                logger.log("Элемент \"" + integer + "\" не проходит");
            else {
                logger.log("Элемент \"" + integer + "\" проходит");
                result.add(integer);
                count++;
            }
        }
        logger.log("Прошло фильтр " + count + " элемент(ов) из " + source.size());
        logger.log("Выводим результат на экран\nОтфильтрованный список: ");
        result.forEach((x) -> System.out.print(" " + x));
        System.out.println();
        return result;
    }

}
