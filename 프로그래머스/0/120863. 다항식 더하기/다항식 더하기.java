class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" \\+ ");
        
        int x = 0;
        int num = 0;
        
        for(String s : arr) {
            if(s.contains("x")) {
                if(s.equals("x")) {
                    x++;
                } else {
                    x += Integer.parseInt(s.replace("x", ""));
                }
            } else {
                num += Integer.parseInt(s);
            }
        }
        
        if(x == 0) {
            return String.valueOf(num);
        }
        
        if(num == 0) {
            if(x == 1) {
                return "x";
            }
            
            return x + "x";
        }
        
        if(x == 1) {
            return "x + " + num;
        }
        
        return x + "x + " + num;
    }
}