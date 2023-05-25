import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true){
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            int n3 = Integer.parseInt(st.nextToken());

            int maxN = 0;
            if(n1>n2){
                if(n2>n3) maxN = n1;
                else maxN = (n1>n3) ? n1 : n3;
            }
            else maxN = (n2>n3) ? n2 : n3;

            if(n1==n2 && n1==n3 && n2==n3 && n1==0) break;
            if(maxN < n1+n2+n3-maxN){
                if(n1==n2 && n1==n3 && n2==n3)
                    System.out.println("Equilateral");
                else if(n1==n2 || n1==n3 || n2==n3)
                    System.out.println("Isosceles");
                else if(n1!=n2 && n1!=n3 && n2!=n3)
                    System.out.println("Scalene");
            }
            else System.out.println("Invalid");
        }
        br.close();
    }
}