class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for (int i = 0; i< dic.length; i ++){
            int count = 0;
            for(int j = 0; j < spell.length; j++){
                if(dic[i].contains(spell[j])) {
                    count +=1;
                }
                //spell의 원소를 모두 사용안하면 안돼 ..
                if(spell.length == count) {
                    answer = 1;
                    break;
                }
            }
        }
        return answer;
    }
}