import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        // 1. 변의 길이를 오름차순으로 정렬
        Arrays.sort(sides);

        // 2. 가장 긴 변이 나머지 두 변의 합보다 작은지 확인
        if (sides[2] < sides[0] + sides[1]) {
            return 1; // 삼각형 가능
        } else {
            return 2; // 삼각형 불가능
        }
    }
}