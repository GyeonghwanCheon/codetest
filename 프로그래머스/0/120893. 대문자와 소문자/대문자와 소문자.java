class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32);
            }
            else if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);
            }

            answer.append(c);
        }

        return answer.toString();
    }
}