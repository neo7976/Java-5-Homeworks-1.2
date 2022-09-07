import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        Random random = new Random();
        random.nextInt(threshold);
        //..
        return result;
    }

}
