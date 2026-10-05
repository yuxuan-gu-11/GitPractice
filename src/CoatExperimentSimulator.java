import java.util.Random;

public class CoatExperimentSimulator {

    private int numberOfPeople;

    public CoatExperimentSimulator(int numPpl) {
        numberOfPeople = numPpl;
    }

    public int numPplWhoGotTheirCoat(int[] permutation) {
        int count = 0;
        for (int i = 0; i < permutation.length; i++){
            if (permutation[i] == i + 1){
                count ++;
            }
        }
        return count;
    }

    public int[] simulateCoatExperiment(int iterations) {
        int[] results = new int [iterations];
        for (int i = 0; i < iterations; i ++){
            int[] permutation = RandomOrderGenerator.getRandomOrder(numberOfPeople);
            results[i] = numPplWhoGotTheirCoat(permutation);
        }
        return results;
    }

    public double answerToQuestionOne(int[] results) {
        return 0.0;
    }

    public double answerToQuestionTwo(int[] results) {
        return 0.0;
    }
}

