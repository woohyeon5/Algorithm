class Solution {
    public String solution(String[] seoul) {
        int num =0;
        for (int i = 0; i< seoul.length; i++) {
            if(seoul[i].contains("Kim"))  num=i;
        }
        return "김서방은 "+num+"에 있다";
    }
}