import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int[] check = new int[26];
        boolean bad = true;
        String[] oneArr;

        for(int i = 0; i < N; i++){
            String str = br.readLine();

            for(int j = 0; j < str.length(); j++){
                int now = str.charAt(j);
                if(j != 0){
                    if(now != str.charAt(j-1)){
                        if(check[now-'a'] == 0){
                            check[now-'a'] = 1;
                        }
                        else{
                            bad = false;
                        }
                    }
                }
                else{
                    check[now-'a'] = 1;
                }
            }
            if(bad){
                count++;
            }
            else{
                bad = true;
            }
            check = new int[26];
        }

        System.out.print(count);
        br.close();
    }
}