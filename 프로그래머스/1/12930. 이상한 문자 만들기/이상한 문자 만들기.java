class Solution {
    public String solution(String s) {
        String answer = "";
        int num = 0;
        for(int i=0; i<s.length(); i++){
           char ch = s.charAt(i);
            if(ch == ' '){
                answer += " ";
                num = 0;
                continue;
            }
            if((num%2) == 0){
                answer += String.valueOf(Character.toUpperCase(ch));
                num++;
            }else{
                answer += String.valueOf(Character.toLowerCase(ch));
                num++;
            }
        }
        return answer;
    }
}