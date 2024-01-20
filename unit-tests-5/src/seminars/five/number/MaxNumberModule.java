package seminars.five.number;

import java.util.List;

public class MaxNumberModule {

    public double findMaxNumber(List<Double> doubleList) {
        double dMax = doubleList.get(0);
        for (int i = 1; i < doubleList.size(); i++) {
            if(dMax < doubleList.get(i)){
                dMax = doubleList.get(i);
            }
        }
        return dMax;
    }
}
