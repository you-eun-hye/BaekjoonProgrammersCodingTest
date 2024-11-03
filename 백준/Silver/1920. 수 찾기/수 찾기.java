import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] numList = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            numList[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numList);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for(int j = 0 ; j < M; j++) {
            int num = Integer.parseInt(st.nextToken());
            if(binarySearch(numList, num) >= 0) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length -1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(key < arr[mid]) {
                right = mid - 1;
            } else if(arr[mid] < key) {
                left = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}