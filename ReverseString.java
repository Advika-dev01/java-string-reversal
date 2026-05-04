import java.util.Scanner;
public class ReverseString {
    public static String reverse(String S){
        char[] arr = S.toCharArray();  //conversion from string to charArray...
        int i=0, j=arr.length-1;
        while (i<j){
            char temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
        String str = new String(arr); //conversion from charArray to string...
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input String : ");
        String S = sc.next();
        System.out.println("reversed string : "+ reverse(S));
    }
}
