package standart;

public class Anagrams {
     public static void main (String args[]){
    	 
    	 
    	 String s= "Stroka slow razdelennaya probelami";
    	 StringBuffer sb = new StringBuffer();
    	 String fin= new String();
    	 int a=0;
    	   	 
    	 for (int i=0; i<s.length();i++){
    		 
    		if(  s.charAt(i) == ' '){    			
    		    sb=new StringBuffer(s.substring(a, i));
    		    sb.reverse();
    		    fin +=sb+" ";
    		    a=i+1;   		 
    		}
    		
    		if (i==s.length()-1){
    			sb=new StringBuffer(s.substring(a, s.length()));
    		    sb.reverse();
    		    fin +=sb+" ";
    		      
    		}
    	 }
    	 
    	 
      	 System.out.println(fin);

     }
}
