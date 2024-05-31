import java.lang.Math;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] game = new int[3]; 

        int n=0, idx=0;
        String num = "";
        
        for(int i=0; i<dartResult.length(); i++){
            char ch = dartResult.charAt(i);
            
            
            if(ch >= '0' && ch <= '9'){       
                 num += String.valueOf(ch);
                
            }
            else if(ch == 'S'||ch == 'D'||ch == 'T'){
                n = Integer.parseInt(num);
                if(ch =='S'){
                   game[idx++] = (int)Math.pow(n,1);
                 }
                else if(ch =='D'){
                    game[idx++] = (int)Math.pow(n,2);
                }
                else{
                    game[idx++] = (int)Math.pow(n,3);
                } 
                num = ""; 
            }
           
            else {
                if(ch == '*'){
                    game[idx-1] *= 2;
                    if(idx-2 >= 0) game[idx-2] *= 2; 
                }
                else {
                game[idx-1] *= -1;
                }
            }
        }
        
        return answer = game[0] + game[1] + game[2];
    }
}