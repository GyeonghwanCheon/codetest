import java.util.*;

class Solution {
    public int[] solution(int l, int r) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = l; i <= r; i++) {

            String num = String.valueOf(i);

            boolean check = true;

            for(int j = 0; j < num.length(); j++) {

                char c = num.charAt(j);

                if(c != '0' && c != '5') {
                    check = false;
                    break;
                }
            }

            if(check) {
                list.add(i);
            }
        }

        if(list.isEmpty()) {
            return new int[]{-1};
        }

        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}