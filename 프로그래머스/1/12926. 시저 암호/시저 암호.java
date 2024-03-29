class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int num = 0;
        for(int i = 0; i < s.length(); i++){
            num = s.charAt(i) + n;
            if(s.charAt(i) == ' ') answer += s.charAt(i);
            else if(s.charAt(i) < 91 && num > 90 || num > 122){
                num -= 26;
                answer += (char) num;
            }else answer += (char) num;
            
        }
        return answer;
    }
}