import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == 'c' && i < str.length() -1){
                if(str.charAt(i+1) == '=' || str.charAt(i+1) == '-'){
                    count++;
                    i++;
                }
                else {
                    count++;
                }
            }

            else if(ch == 'd' && i < str.length() -1){
                if(str.charAt(i+1) == '-'){
                    count++;
                    i++;
                }
                else if(str.charAt(i+1) == 'z' && i < str.length() -2){
                    if(str.charAt(i+2) == '='){
                        count++;
                        i+=2;
                    }
                    else{
                        count++;
                    }
                }
                else{
                    count++;
                }
            }

            else if((ch == 'l' || ch == 'n') && i < str.length() -1){
                if(str.charAt(i+1) == 'j'){
                    count++;
                    i++;
                }
                else{
                    count++;
                }
            }

            else if((ch == 's' || ch == 'z') && i < str.length() -1){
                if(str.charAt(i+1) == '='){
                    count++;
                    i++;
                }
                else{
                    count++;
                }
            }

            else{
                count++;
            }
        }
        br.close();
        System.out.print(count);
    }
}