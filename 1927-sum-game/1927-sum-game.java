class Solution {
    public boolean sumGame(String num) {
       
        int n = num.length();

        int leftSum = 0;
        int rightSum = 0;

        int leftQ = 0;
        int rightQ = 0;

        for (int i = 0; i < n / 2; i++) {

            if (num.charAt(i) == '?') {
                leftQ++;
            } else {
                leftSum += num.charAt(i) - '0';
            }

            if (num.charAt(n - 1 - i) == '?') {
                rightQ++;
            } else {
                rightSum += num.charAt(n - 1 - i) - '0';
            }
        }

        int diff = leftSum - rightSum;
        int qDiff = rightQ - leftQ;

        if (qDiff % 2 != 0) {
            return true;
        }

        return diff != (qDiff / 2) * 9;
    }

    }
