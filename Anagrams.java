package standart;

public class Anagrams {
     public static void main (String args[]) {
    	 String string = "Stroka slow razdelennaya probelami";
    	 StringBuffer stringBuffer = new StringBuffer();
    	 String resultString = "";
    	 int beginOfNewWord = 0;
    	 for (int i = 0; i < string.length(); i++) {
    		if (string.charAt(i) == ' ') {    			
    		    stringBuffer = new StringBuffer(string.substring(beginOfNewWord, i));
    		    stringBuffer.reverse();
    		    resultString += stringBuffer + " ";
    		    beginOfNewWord = i + 1;   		 
    		}
    		if (i == string.length() - 1) {
    			stringBuffer = new StringBuffer(string.substring(beginOfNewWord, string.length()));
    		    stringBuffer.reverse();
    		    resultString += stringBuffer + " ";
    		}
    	 }
      	 System.out.println(resultString);
     }
}
