class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int copy=x,sum=0;
        while(x!=0){
            int rem=x%10;
            sum=sum+rem;
            x=x/10;
        }
        if(copy%sum==0){
            return sum;
        }
    return -1;
    }
}