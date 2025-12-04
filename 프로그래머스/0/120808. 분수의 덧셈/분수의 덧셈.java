class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        // 공통 분모 찾기
        int remainder = -1;
        if(denom1 > denom2) {
            remainder = denom1%denom2;
        } else {
            remainder = denom2%denom1;
        }
        
        int resultNumer = -1;
        int resultDenom = -1;
        if(remainder == 0) { // 공통 분모 존재
            if(denom1 > denom2) {
                answer[0] = numer1 + numer2*(denom1/denom2);
                answer[1] = denom1;
            } else {
                answer[0] = numer2 + numer1*(denom2/denom1);
                answer[1] = denom2;
            }
        } else { // 공통 분모 미존재
            resultNumer = numer1*denom2 + numer2*denom1;
            resultDenom = denom1*denom2;
            answer[0] = resultNumer;
            answer[1] = resultDenom;
        }
        
        // 기약 분수 처리
        int g = gcd(answer[0], answer[1]);
        answer[0] /= g;
        answer[1] /= g;
        
        return answer;
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}