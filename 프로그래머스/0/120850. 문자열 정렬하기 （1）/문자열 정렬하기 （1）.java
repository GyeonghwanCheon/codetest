import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        // 1. 숫자 개수 세기
        int count = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                count++;
            }
        }

        // 2. 배열 생성
        int[] answer = new int[count];

        // 3. 숫자 저장
        int idx = 0;
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isDigit(c)) {
                answer[idx++] = c - '0';
            }
        }

        // 4. 정렬
        Arrays.sort(answer);

        return answer;
    }
}