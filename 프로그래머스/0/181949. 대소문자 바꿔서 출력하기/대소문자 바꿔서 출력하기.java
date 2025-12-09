import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String result = "";
        for(int i = 0; i < a.length(); i++) {
            char checkChar = a.charAt(i);
            if(Character.isUpperCase(checkChar)) {
                result += Character.toLowerCase(checkChar);
            } else {
                result += Character.toUpperCase(checkChar);
            }
        }
        System.out.print(result);
    }
}