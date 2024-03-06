import java.util.Objects;

public class PalindromeNumber {
    public boolean isPalindrome(int x){
        if(x>0){
            char[] characters = String.valueOf(x).toCharArray();
            StringBuilder reverseChar = new StringBuilder(String.valueOf(x));
            char [] reverseCharacter = reverseChar.reverse().toString().toCharArray();
            for (int i = 0; i < characters.length; i++) {
                if(!Objects.equals(characters[i],reverseCharacter[i])) return false;
            }
            return true;
        }
        return false;
    }
}
