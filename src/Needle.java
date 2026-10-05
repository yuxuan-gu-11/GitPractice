import java.util.*;

public class Needle {

    private Random generator;
    public Needle() {
        generator = new Random();
    }

    public double runExperiment(int totalDrops) {
        double hits = 0;
        for (int i = 0; i < totalDrops; i++){
            double yLow = generator.nextDouble() * 2;
            double alpha = generator.nextDouble() * 180;
            double yHigh = yLow + Math.sin(Math.toRadians(alpha));
            if (yHigh >= 2){
                hits ++;
            }
        }
        return totalDrops / hits;
        // implement
    }
}

