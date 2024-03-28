class Solution {
    public int solution(String t, String p) {
        int l = t.length() - p.length() + 1;
        long num = Long.parseLong(p);
        int answer = 0;
        for (int i = 0; i < l; i++) {
            String temp = t.substring(i, i + p.length());   
            if (Long.parseLong(temp) <= num) {
            	answer++;
            }
        }
        return answer;
    }
}