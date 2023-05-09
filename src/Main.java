import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 바구니 개수
        int M = Integer.parseInt(st.nextToken()); // 반복 횟수

        int[] basket = new int[N]; // 바구니 배열
        int[] newBasket = new int[N]; // 결과 바구니 배열

        // 바구니에 값을 1부터 N까지 담는다
        for(int a = 0; a < basket.length; a++){
            basket[a] = a+1;
        }

        for(int b = 0; b < M; b++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken())-1;
            int j = Integer.parseInt(st.nextToken())-1;
            int k = Integer.parseInt(st.nextToken())-1;

            // i를 기준으로 반복문을 돌려야 하기에 따로 저장
            int i1 = i;

            // 바구니가 바뀌는 횟수
            for(int c = 0; c < j-i+1; c++){
                // k부터 j까지
                if(c+k <= j){
                    newBasket[c+i] = basket[c+k];
                }
                // i부터 k까지
                else {
                    newBasket[c+i] = basket[i1];
                    i1++;
                }
            }

            // 회전 범위에 속하지 않을 경우
            for(int d = 0; d < N; d++){
                if(newBasket[d] != 0){ //그래서, 0을 제외한 부분을 덮어씌우기하면 된다.
                    basket[d] = newBasket[d];
                }
            }
        }

        for(int e = 0; e<basket.length; e++){
            bw.write(basket[e]+" ");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}