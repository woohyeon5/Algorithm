class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        String[] morseString;
        morseString = letter.split(" ");
        String answer= ""; 

        StringBuilder sb = new StringBuilder();
        
        for (String word : morseString) {
            for (int i = 0; i < morse.length; i++) {
                if (word.equals(morse[i])) answer += (char) ('a' + i);
            }
        }
        return answer;
    }
}