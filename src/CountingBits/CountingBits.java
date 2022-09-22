package CountingBits;

public class CountingBits {
    public int[] countBits(int n) {
        var result = new int[n+1];
        for (int i = 0; i <= n; i++){
            result[i] = Integer.toBinaryString(i).replace("0", "").length();
        }
        return result;
    }

    public int[] countBits2(int n) {
        var result = new int[n+1];
        for (int i = 0; i <= n; i++){
            var number = i;
            var count = 0;
            while (number != 0){
                count++;
                number = number & (number - 1);
            }
            result[i] = count;
        }
        return result;
    }
}
