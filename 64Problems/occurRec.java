class OccurRec {
    public static int sumOfDigitRec(int num, int numDigit, int i, int sum, int x) {
        if (i == numDigit) {
            return sum;
        }
        int num1 = (int) (num / Math.pow(10, i)) % 10;
        if (num1 == x) {
            sum++;
        }
        return sumOfDigitRec(num, numDigit, ++i, sum, x);
    }

    public static void main(String[] args) {
        int num = 123455;
        int i = 0;
        int numDigit = 6;
        int x = 1;
        System.out.println(sumOfDigitRec(num, numDigit, i, 0, x));
    }
}

