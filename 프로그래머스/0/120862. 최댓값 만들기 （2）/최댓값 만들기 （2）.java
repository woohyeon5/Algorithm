import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
       if( numbers[numbers.length-1]*numbers[numbers.length-2] > numbers[0]*numbers[1]) return numbers[numbers.length-1]*numbers[numbers.length-2];
        return numbers[0]*numbers[1];
    }
}