public class PositiveInteger {
    private int num;

    public PositiveInteger(int number) {
        num = number;
    }

    private int sumOfUniqueFactors() {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public boolean isPerfect() {
        return num > 0 && sumOfUniqueFactors() == num;
    }

    public boolean isAbundant() {
        return num > 0 && sumOfUniqueFactors() > num;
    }

    public boolean isNarcissistic() {
        if (num < 1) {
            return false;
        }
        int digitCount = 0;
        for (int n = num; n > 0; n /= 10) {
            digitCount++;
        }

        // Add up each digit raised to the power digitCount.
        int sum = 0;
        for (int n = num; n > 0; n /= 10) {
            int digit = n % 10;
            int power = 1;
            for (int i = 0; i < digitCount; i++) {
                power *= digit;
            }
            sum += power;
        }

        return sum == num;
    }
}