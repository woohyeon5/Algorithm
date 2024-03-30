class Solution {
    public int solution(int order) {
        int answer = 0;
        String orderNum = String.valueOf(order);
        for(int i = 0; i < orderNum.length(); i++){
            if(orderNum.charAt(i)=='3'|| orderNum.charAt(i) == '6' || orderNum.charAt(i) == '9'){
                answer++;
            }
        }
        return answer;
    }
}