import java.util.Scanner;
public class palindromo {
    public static boolean isPalindrome(char[] array){
        int left = 0;
        int right = array.length - 1;
        while(left < right){
            if(array[left] != array[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("escolha uma palavra para saber se é palindromo: ");
        String word = sc.nextLine();
        char[] array = word.toCharArray();

        System.out.println(isPalindrome(array));
        sc.close();
    }
    
}
