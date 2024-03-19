import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        String numberStr = my_string.replaceAll("[^0-9]", "");
        int [] result = new int [numberStr.length()];
        for(int i = 0; i< numberStr.length(); i++){
            result[i]= numberStr.charAt(i)-'0';
        }
        Arrays.sort(result);
        return result; 
    }
}