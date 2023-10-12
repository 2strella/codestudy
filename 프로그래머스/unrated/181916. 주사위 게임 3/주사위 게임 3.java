import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        int rollresult[] = {a, b, c, d};
        
        Arrays.sort(rollresult);
        int q = rollresult[0];
        int w = rollresult[1];
        int e = rollresult[2];
        int r = rollresult[3];
        
        if(q == w) {
            if(w == e) {
                if(e == r) {
                    answer = 1111 * q;
                } else {
                    answer = (q * 10 + r) * (q * 10 + r);
                }
            } else if(e == r) {
                answer = (q + e) * (e - q);
            } else answer = e * r;
            
        } else if(w == e) {
            if(e == r) {
                answer = (10 * w + q) * (10 * w + q);
            } else answer = q * r;
        } else if(e == r) {
            answer = q * w;
        } else answer = q;
        
        return answer;
    }
}