package experiments;

import java.util.Arrays;

public class Code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr = {2,3,-1,-4,7,8,12,-8};    
	        int temp = 0;    
	            
	        //Displaying elements of original array    
	        System.out.println("Elements of original array: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	        }    
	            
	        //Sort the array in ascending order    
	        for (int i = 0; i < arr.length; i++) {     
	            for (int j = i+1; j < arr.length; j++) {     
	               if(arr[i] > arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }     
	        }    
	          
	        System.out.println();    
	            
	        //Displaying elements of array after sorting    
	        System.out.println("Elements of array sorted in ascending order: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");
	            
	            
	        } 
	        System.out.println( );
	        for(int h=0;h<arr.length;h++) {
	        	System.out.println("product minimum and maximum elements"+arr[0]*arr[arr.length-1]);
	        	break;
	        	
	        }
	        
        }    
      
}    


