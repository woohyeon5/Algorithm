import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        int num =0;
        for(int i =0; i< arr.length; i++){
            if(arr[i]%divisor==0){
                num ++;
            }
        }
        if(num==0){
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int [num] ;
        num=0;
        for(int i =0; i< arr.length; i++){
            if(arr[i]%divisor==0){
                answer[num]=arr[i];
                num ++;
            }
        }

        return answer;
    }
}