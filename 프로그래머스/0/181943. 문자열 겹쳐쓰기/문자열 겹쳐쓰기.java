class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        int i = my_string.length();
        int j = overwrite_string.length();
        
        answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s+j, i);
        System.out.print(answer);
        
        return answer;
    }
}