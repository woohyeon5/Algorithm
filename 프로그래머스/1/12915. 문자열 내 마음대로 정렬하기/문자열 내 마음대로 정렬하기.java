import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> list = new ArrayList<>();
        // list에 index가 n번째 글자와 문자열 넣어서 넣어준다.
        for(int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(list);
        //substring을 통해서 앞글자만 제거 
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1);
        }
        return answer;
    }
}