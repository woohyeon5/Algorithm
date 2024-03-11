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
            
            
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(numP);

        return answer;
    }
}