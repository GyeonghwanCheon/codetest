class Solution {
    public int solution(String[] strArr) {
        
        int[] count = new int[31];
        
        for(int i = 0; i < strArr.length; i++) {
            int len = strArr[i].length();
            count[len]++;
        }
        
        int max = 0;
        
        for(int i = 0; i < count.length; i++) {
            if(count[i] > max) {
                max = count[i];
            }
        }
        
        return max;
    }
}
