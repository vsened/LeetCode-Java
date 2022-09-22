package FindNumbersWithEvenNumberOfDigits;

public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int counter = 0;
        for (int num : nums){
            if (Integer.valueOf(num).toString().length() % 2 == 0)
                counter++;
        }
        return counter;
    }
    public int findNumbers2(int[] nums) {
        int counter = 0;
        for (int num : nums){
            var length = 0;
            while (num > 0){
                length++;
                num /= 10;
            }
            if (length % 2 == 0)
                counter++;
        }
        return counter;
    }

}
