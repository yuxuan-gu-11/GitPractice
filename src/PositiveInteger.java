public class PositiveInteger {
    private int num;

    public PositiveInteger(int number){
        num = number;
    }
    private int sumOfUniqueFactors(){
        int sum = 0;
        for(int i = 1; i <= num / 2; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        return sum;
    }

    public boolean isPerfect() {
        return num > 0 && sumOfUniqueFactors() == num;
    }

    public boolean isAbundant() {
       return false;
    }

    public boolean isNarcissistic() {
        return false;
    }
}
