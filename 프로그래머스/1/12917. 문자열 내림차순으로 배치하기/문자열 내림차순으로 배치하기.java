import java.util.*;
class Solution {
    public String solution(String s) {
        String str = "";

        String[] arr = s.split("");
        Arrays.sort(arr);

        for(int i=arr.length-1; i>=0; i--){
            str += arr[i];
        }
        return str;
    }
}