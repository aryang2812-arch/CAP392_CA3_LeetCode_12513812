
class Solution {

    public int countDigitOne(int n) {

        int count = 0;

        for (int i = 1; i <= n; i++) {

            count += countOnes(i);
        }

        return count;
    }

    public int countOnes(int num) {

        int count = 0;

        while (num > 0) {

            int digit = num % 10;

            if (digit == 1) {
                count++;
            }

            num = num / 10;
        }

        return count;
    }
}
