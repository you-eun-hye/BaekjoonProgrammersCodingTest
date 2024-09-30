import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[8];
        for(int i = 0; i < 8; i++) {
            nums[i] = sc.nextInt();
        }

        String result = "";
        for(int j = 0; j < nums.length - 1; j++){
            if(nums[j+1] == nums[j] + 1) {
                result = "ascending";
            } else if(nums[j+1] == nums[j] - 1) {
                result = "descending";
            } else {
                result = "mixed";
                break;
            }
        }

        System.out.print(result);
    }
}