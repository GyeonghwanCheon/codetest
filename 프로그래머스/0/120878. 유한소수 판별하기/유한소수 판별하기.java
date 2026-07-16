class Solution {
    public int solution(int a, int b) {
        int num = b;
        
        for(int i = 2; i <= a; i++) {
            if(a % i == 0 && num % i == 0) {
                a /= i;
                num /= i;
                i = 1;
            }
        }
        
        while(num % 2 == 0) {
            num /= 2;
        }
        
        while(num % 5 == 0) {
            num /= 5;
        }
        
        if(num == 1) {
            return 1;
        }
        
        return 2;
    }
}