class Solution {
    public int countDigits(int num) {
        int remainingno=num;
        int divisibledigitcount=0;
        while(remainingno>0){
            int currentdigit=remainingno%10;
            if(num%currentdigit==0){
                divisibledigitcount++;
                }
                remainingno/=10;
           
        }
        return divisibledigitcount;
    }
}