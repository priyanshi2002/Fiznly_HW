package vowel;

public class FindVowel {
	static int checkIfAllVowels(String str)
	{
	 
	    int []hash = new int[5];
	    for (int i = 0; i < str.length(); i++)
	    {
	 
	        if (str.charAt(i) == 'A' || str.charAt(i) == 'a')
	            hash[0] = 1;
	 
	        else if (str.charAt(i) == 'E' || str.charAt(i) == 'e')
	            hash[1] = 1;
	 
	        else if (str.charAt(i) == 'I' || str.charAt(i) == 'i')
	            hash[2] = 1;
	 
	        else if (str.charAt(i) == 'O' || str.charAt(i) == 'o')
	            hash[3] = 1;
	 
	        else if (str.charAt(i) == 'U' || str.charAt(i) == 'u')
	            hash[4] = 1;
	    }
	    for (int i = 0; i < 5; i++)
	    {
	        if (hash[i] == 0)
	        {
	            return 1;
	        }
	    }
	return 0;
	}
	static void checkIfAllVowelsArePresent(String str)
	{
	 
	    if (checkIfAllVowels(str) == 1)
	        System.out.println("String contains all vowels");
	    else
	        System.out.println("String Does not all vowels");
	}
	 
	public static void main(String[] args)
	{
	    String str = "aeioubckdjss";
	    String str1="Priya";
	    checkIfAllVowelsArePresent(str);
	    checkIfAllVowelsArePresent(str1);
	}
}
