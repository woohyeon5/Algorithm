class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = String.valueOf(num);
        
        answer = str.indexOf(String.valueOf(k));
        answer++;
        if(answer==0) answer = -1;
        return answer;
    }
}