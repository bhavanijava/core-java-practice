package strings;

	public class SubStrings_Palindrome {
	    

	    public static void main(String args[]){
	    String s="abacaba5463ijkjii767madam";
	    
	    for(int i=0;i<=s.length()-1;i++){
	    
	    for(int j=i+1;j<=s.length()-1;j++){
	    
	        String s2=s.substring(i,j);
	        
	        String s3="";
	        
	        for(int k=s2.length()-1;k>=0;k--){
	            s3=s3+s2.charAt(k);
	        }
	        if(s3.equals(s2)){
	        	if(s3.length()>1)
	            System.out.print( s3 + " ");
	            
	        }
	    }
	    }
	    }
	}