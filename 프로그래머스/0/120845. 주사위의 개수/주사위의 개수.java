class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int [] result = new int [3];
        for (int i = 0; i < 3; i++){
            result[i] = box[i]/n;
        }
        answer = result[0]*result[1]*result[2];
        return answer;
    }
}