class Solution {
    public int solution(int a, int b) {
    int answer = 0;
    while(b%2==0||b%5==0){
        if(b%2==0) b/=2;
        if(b%5==0) b/=5;
    }
    System.out.println("a"+b);
    System.out.println("b"+a);
    return (a%b==0)? 1:2;
    }
}