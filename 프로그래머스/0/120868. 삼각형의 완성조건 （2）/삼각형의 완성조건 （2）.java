class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        //int max = Math.max(sides[0], sides[1]);
        //int min = Math.min(sides[0], sides[1]);
        //int sum = sides[0]+sides[1];
        //answer>max-min;
        //max-min=Math.abs(sides[0]-sides[1]);
        //answer>Math.abs(sides[0]-sides[1]);
        //answer<sides[0]+sides[1];


        answer = sides[0]+sides[1]-Math.abs(sides[0]-sides[1])-1;
        return answer;

    }
}