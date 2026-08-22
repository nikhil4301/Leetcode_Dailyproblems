class Solution {
    public boolean checkDivisibility(int n) {
       int start = n;
       int sum = 0;
       int product = 1;
       while(n>0){
        int num = n % 10;
        n = n / 10 ;
        sum += num;
        product *= num;
       }
       return start % (sum + product) == 0;
    }
}