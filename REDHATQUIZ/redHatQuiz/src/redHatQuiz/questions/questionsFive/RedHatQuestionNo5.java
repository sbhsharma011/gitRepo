package redHatQuiz.questions.questionsFive;

public class RedHatQuestionNo5 {

	public static void main(String[] args) {
		RedHatQuestionNo5 obj = new RedHatQuestionNo5();
		System.out.println("Two's complimenet of given number:"+obj.base10to2AndSupportsNegativebase10(-2));
	}
	
	//This function handles both positive and negative base 10 integers
	private String base10to2AndSupportsNegativebase10(int numb){
		int no = numb<0?-(numb):numb;
		int container[] = new int[100];
        int index = 0;
        String result = "";
        while (no > 0){
            container[index] = no%2;
            index++;
            no = no/2;
        }
        for (int j = index -1 ; j >= 0 ; j--){
        	result+=container[j];
        }
        String binary = numb<0?String.format("%8s", result).replace(' ', '0').replaceFirst("0", "1"):String.format("%8s", result).replace(' ', '0');
        System.out.println("Binary:"+binary);
        StringBuffer str =  new StringBuffer(binary);
        int n = str.length();
	      
        // Traverse the string to get first '1' from
        // the last of string
        int i;
        for (i = n-1 ; i >= 0 ; i--)
            if (str.charAt(i) == '1')
                break;
      
        // If there exists no '1' concat 1 at the
        // starting of string
        if (i == -1)
            return "1" + str;
      
        // Continue traversal after the position of
        // first '1'
        for (int k = i-1 ; k >= 0; k--)
        {
            //Just flip the values
            if (str.charAt(k) == '1')
                str.replace(k, k+1, "0");
            else
                str.replace(k, k+1, "1");
        }
      
        // return the modified string
        return str.toString();
	}
}
