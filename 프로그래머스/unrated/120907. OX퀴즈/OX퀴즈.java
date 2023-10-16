class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for(int i = 0; i < quiz.length; i++){
            String[] split = quiz[i].split(" ");
            int x = Integer.parseInt(split[0]);
            int y = Integer.parseInt(split[2]);
            int z = Integer.parseInt(split[4]);

        switch(split[1]) {
            case "+" :
                answer[i] = (x + y == z)? "O":"X";

            break;

            case "-" :
                answer[i] = (x - y == z)? "O":"X";

            break;
        }

        }
        return answer;

    }
}