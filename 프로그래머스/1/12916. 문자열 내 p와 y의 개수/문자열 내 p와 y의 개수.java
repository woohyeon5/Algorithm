class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toUpperCase();
        int numP = 0;
        int numY =0;
        for(int i =0; i< s.length(); i++){
            if(s.charAt(i)=='P'){
                numP++;
            }else if(s.charAt(i)=='Y'){
                numY++;
            }
        }
        if(numP != numY) answer = false;
        return answer;
    }
}