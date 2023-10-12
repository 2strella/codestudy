class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        int compare = 0;
        
        String[] babb = {"aya", "ye", "woo", "ma"};
        // 주어진 babbling에 문자열의 길이를 센다.
        // babbling[0] ~ 길이까지 저장된 문자에 해당하는 문자가 있는지 판별한다.
        // 해당하면 그 다음 문자열도 읽어 내어 해당 단어가 존재하는지 판별하고 개수를 카운트한다.
            
        for (int i =0; i < babbling.length; i++) {
            compare = babbling[i].length();
            
            for (int j =0; j < babb.length; j++) {
                
                if(babbling[i].contains(babb[j])) {
                  compare -= babb[j].length();
                    
                }
            }
            if (compare == 0) {
                answer++;
            }   
        }
        
        return answer;
    }
}