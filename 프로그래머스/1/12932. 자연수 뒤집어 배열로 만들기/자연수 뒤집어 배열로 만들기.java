class Solution {
    public int[] solution(long n) {
        String number = Long.toString(n);
        int[] answer = new int[number.length()];
        for(int i=0;i<number.length();i++) {
            answer[i] = Integer.parseInt(number.substring((number.length() - (i+1)), number.length()-i));
        }
        return answer;
    }
}