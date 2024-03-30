class Solution {
   public static String solution(String my_string) {
            String answer = "";
            String[] str = my_string.split("");
            for(int i=0;i<str.length;i++) {
                for(int j=i+1;j<str.length;j++) {
                    if(str[i].equals(str[j])) {
                        str[j]="";
                    }
                }
            }
            for(int i=0;i<str.length;i++) {
                answer+=str[i];
            }
            return answer;
        }
    }