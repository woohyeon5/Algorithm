class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char [] strArr = new char [my_string.length()];
        for(int i = 0; i< my_string.length(); i++){
            strArr[i]=my_string.charAt(i);
        }
        char temp = strArr[num1];
        strArr[num1]=strArr[num2];
        strArr[num2]=temp;
        for(int i =0; i< strArr.length; i++){
            answer += strArr[i];
        }
    return answer;

    }
}