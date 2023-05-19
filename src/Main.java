import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int top = 1;
        int bottom = 1;
        int line = 1;
        int n = 1;

        if(X==1) System.out.print(top+"/"+bottom);
        else{
            while(n < X) {
                line++;
                n += line;
            }
            // 짝수행
            if(line%2==0){
                top = line;
                for(int i = 0; i < n-X; i++){
                    top--;
                    bottom++;
                }
            }
            // 홀수행
            else{
                bottom = line;
                for(int i = 0; i < n-X; i++){
                    top++;
                    bottom--;
                }
            }
            System.out.print(top+"/"+bottom);
        }

        br.close();
    }
}