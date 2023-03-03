package AddDigits;

public class AddDigits {
    public int addDigits(int num) {
        if (num < 10)
            return num;
        var number = 0;
        while (num > 0){
            number +=  num % 10;
            num /= 10;
        }
        return addDigits(number);
    }

    public int addDigits2(int num) {
        if (num < 10)
            return num;
        return addDigits2(num % 10 + num / 10);
    }
}
