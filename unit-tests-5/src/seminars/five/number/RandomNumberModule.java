package seminars.five.number;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomNumberModule {

    public List<Double> generateList(int n) {
        List<Double> nDoubles = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            nDoubles.add(random.nextDouble());
        }
        return nDoubles;
    }
}
