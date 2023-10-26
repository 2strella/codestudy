class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String a = s.toLowerCase();
        int p = a.length() - a.replace("p","").length();
        int y = a.length() - a.replace("y","").length();
        
        if(p != y) {
            answer = false;
        } 

        return answer;
    }
}