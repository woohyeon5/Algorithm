class Solution {
    public String solution(String bin1, String bin2) {
        int num1 = Integer.valueOf(bin1, 2);
        int num2 = Integer.valueOf(bin2, 2);
        int number = num1 + num2;
        String answer = "";
        while(number>0){
            answer = number %2+ answer;
            number/=2;        
        }
        return (answer == "" ? answer = "0" : answer);
    }

}