

class Solution {
    public String solution(String s) {
        String answer = "";
        boolean bool = true;

        for (int i = 0; i < s.length(); i++) {
            String temp = "";
            if (bool) {
                if (Character.isDigit(s.charAt(i))) {
                    answer += s.charAt(i);
                    bool = false;
                }else {
                    answer += Character.toUpperCase(s.charAt(i));
                }
            } else {
                answer += Character.toLowerCase(s.charAt(i));
            }


        }
        return answer;
    }

}