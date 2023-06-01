import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] nums = new int[N];
        int result = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++){
            if(nums[i] > M) continue;
            for(int j = 0; j < N; j++){
                if(nums[i] + nums[i] > M || nums[i] == nums[j]) continue;
                for(int k = 0; k < N; k++){
                    if(nums[i] == nums[k] || nums[j] == nums[k]) continue;
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum == M) {
                        result = sum;
                        break;
                    }
                    else if(result < sum && sum < M)
                        result = sum;
                }
            }
        }
        System.out.println(result);

        br.close();
    }
}