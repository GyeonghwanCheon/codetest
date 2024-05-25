class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int i = 0;
        
        for(i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }
        
        return answer / i ;
    }
}