/**
 * TerceiroDesafio
 */
public class TerceiroDesafio {

    public static void main(String[] args) {
    //Encontrar a substring palindroma mais longa
       System.out.println(PalindromaMaisLonga("babad"));
		
	}

	static public String intermediatePalindrome(String s, int left, int right) {
		//Método (ação) para comparar o tamanho da palavra
		if (left > right){ 
			return null; 
		}
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return s.substring(left + 1, right);
	}

	
	public static String PalindromaMaisLonga(String s) {
		//Método (ação) para encontrar a maior palavra
		if (s == null){
			return null;
		}
		String longest = s.substring(0, 1);
		for (int i = 0; i < s.length() - 1; i++) {
			
			String palindroma = intermediatePalindrome(s, i, i);
			if (palindroma.length() > longest.length()) {
				longest = palindroma;
			}
			
			palindroma = intermediatePalindrome(s, i, i + 1);
			if (palindroma.length() > longest.length()) {
				longest = palindroma;
			}
		}
		return longest;

    }
}