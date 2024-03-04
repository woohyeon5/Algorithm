class Solution {
    public int solution(String my_string) {
        
        String[] stringSrr = my_string.split(" ");
        int answer = Integer.parseInt(stringSrr[0]);
        for (int i = 1; i < stringSrr.length; i += 2) {           
            if (stringSrr[i].equals("+")) {
                answer += Integer.parseInt(stringSrr[i + 1]);     
            } else {
                answer -= Integer.parseInt(stringSrr[i + 1]);
            }
        }
        return answer;
    }
}