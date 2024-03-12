import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        Integer [] intArr = new Integer[str.length()];
        for(int i =0; i<str.length();i++){
             intArr[i] = str.charAt(i) - '0';            
        }
        Arrays.sort(intArr);
        List<Integer> list = Arrays.asList(intArr);
        Collections.reverse(list);
        str= "";
        for (int i=0; i < list.size(); i ++){
            str+=list.get(i);
        }
        answer = Long.parseLong(str);
        

        
        
        
        
        
        System.out.println(str);
        
        System.out.println(Arrays.toString(intArr));
        return answer;
    }
}