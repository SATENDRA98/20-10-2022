package com.Exception.bll;

public class CheckFileExtension {

	public static void main(String[] args) {
	    
		String[] names = {"Ajay ", "Vijay", "Ram","Sanjay"};
		String[] files = {"Circle.java","",null,"Notes.txt"};
		
			int i=0;
		
		//using for loop for string values
			for(String file:files) {  
			System.out.println(i);
				
			try {
						 
				int r = checkFileExtension(file);
			//condition check
				if(r==1)
					System.out.println("Hello " + names[i] +". Your " + file + " is a java file. And your score is 1");
				else
					System.out.println("Hello " + names[i] +". Your " + file + " is not a java file. And your score is 0");
				 
			}	
				
	//null string	
		catch(NullFileException ex) {
			System.out.println("Hello " + names[i] +".\n Your have send a null. Your score is -1");
			System.out.println(ex.getMessage());
		}
	//empty string
		catch(EmptyFileException ex) {
			System.out.println("Hello " + names[i] +".\n Your have send an empty string. Your score is -1");
			System.out.println(ex.getMessage());
		}
	//other exception
		catch(Exception ex) {
			System.out.println("Your score is -1");
			System.out.println(ex.getMessage());
		}
				i++;	
			}    
}
	public static int checkFileExtension(String fileName) throws NullFileException, EmptyFileException {
			
			if(fileName == null)
				throw new NullFileException("You have send the null string.");
			
			
			if(fileName.isEmpty())
				throw new EmptyFileException("You have send the empty string.");
			
			if(fileName.endsWith(".java"))
				return 1;
			else 
				return 0;
	}

}