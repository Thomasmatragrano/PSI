// Thomas Matragrano                                                              
// This is a program that demonstrates all of the knowledge I've learned in this course so far

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		// PRIMITIVE DATA TYPES:
		
		// Int     - accepts the input of an integer number (32 bit)
		// Double  - accepts the input of a floating point number   (64 bit)
		// Boolean - the primitive data type for true and false, defaults as false
		// Char    - the primitive data type for a single character (16 bit)
		// Byte    - accepts the input of an integer number (8 bit)
		// Float   - accepts the input of a floating point number (32 bit)
		// Short   - accepts the input of an integer number (16 bit)
		// Long    - accepts the input of an integer number (64 bit)
		
		
		Scanner intro = new Scanner(System.in);
		Scanner two = new Scanner(System.in);
		
		//A variable is a storage location which contains an identifier and a value
		//scope is defined as the region in which name binding is valid.
		boolean T = true;
		boolean F = false; 
		
		hello();
		String g = "Would you like to answer some questions? (Enter 0 for no, 1 for yes) ";                        //3
		
		System.out.println(g);
		int answer = intro.nextInt();
        String switchanswer;
        switch (answer) {
            case 0:  switchanswer = "No";
            intro.close();
                     break;
            case 1:  switchanswer = "Please enter a string value for your first name";
                     break;	
			default: switchanswer = "Invalid answer";
			intro.close();
			break;
        }
	System.out.println(switchanswer);			
		
		
	
		String s = two.nextLine();
//checks to see if the input is a char/str
		if (!s.matches("[a-zA-Z]+"))
			two.close();
		else {
// .length() is used to find the length of a string			
			int x = s.length(); 
//.substring() is used to find a specific char or string within the string
			String last = s.substring(s.length()-1);
//.toUpperCase() is used to capitalize a string or char
			String S = s.toUpperCase();
		System.out.println("Hello, "+ s + "!\nIn all capital letters, your name is " + S + ".\nThis is " + x + " letter(s) long and the last letter is " + last);
		System.out.println("Your name, when compared from all lowercase to all uppercase, returns a value of " +S.compareTo(s));
	}
		System.out.println("Enter your age as an Integer");
		int age = two.nextInt();
			System.out.println("How old would you be in dog years?");
				int dog = 7*age; 
		int newage = two.nextInt();
		if (dog == newage)
			System.out.println(T + ", Good Job!");
		else
			System.out.println(F + ", You should be " + dog);
		
		System.out.println("what is the combined value of a penny and a quarter in USD?");
		double cents = two.nextDouble();
		double ans = .26;
		 //== is an operator that compares primitive data types, while .equals and .compareTo are used to compare objects
		if (cents == .26 && cents == .260)	
			System.out.println("Correct!");
		else System.out.println("You answered " + cents + ": The correct answer is " + ans);
		
		
		System.out.println("Enter a double:");
	//by using the final modifier, the value of this variable cannot be changed
	final double cast = two.nextDouble();
	//casting turns an object into a different data type
	int casting = treturn((int)cast);
	System.out.println("");
    System.out.println("You entered " + cast+ ".\nThis value as an integer is " + casting);
    
   int rnd =(int) Math.floor(Math.random() * 11);
   System.out.println("I am thinking of an integer between 0 and 10, can you guess it?");
    int guess = two.nextInt();
    if (guess == rnd)
    	System.out.println("Great guess!");
    else
    	System.out.println("You guessed " + guess + "\nThe correct answer is " + rnd);
       
   System.out.println("");
   System.out.println("Here are some basic calculations: ");
    int add = 1;
    int subtract =1; 
    int multiply =1;
    int divide =2;
    int mod =4;
    int plusplus = 1;
    int minusminus = 1;
    int plusequals = 1;
    
    int ad = add +1;
    System.out.println("1+1 = " +ad);
	int sub = subtract-1; 
	System.out.println("1-1 = " +sub);
	int mult = multiply*2;
	System.out.println("1*2 = " +mult);
    int div = divide/2;
    System.out.println("2/2 = " +div);
	int mo = mod%2;
	System.out.println("4%2 = " +mo);
	plusplus++;
	System.out.println("1++ = " +plusplus);
	minusminus--;
	System.out.println("1-- = " +minusminus);
	plusequals+=plusequals;
	System.out.println("1+= = " +plusequals);
   }
	

	
	
	//When two operators share an operand, the operator with the higher precedence goes first.
	//When an expression has two operators with the same precedence, the expression is evaluated according to its associativity
	
	//The method header includes the access modifiers, return type, method name, and parameters (static void hello()) 
	static void hello() {
		String hello = "Hello!";
		String hi = "Hello!";
		if (hi.equals(hello))
		System.out.println(hi);
	}
	//parameters are the types of data that a method can receive ((int c))
	static int treturn(int c) {
		return c;
	}
	

		
		

		
		
		
		
		
		
		
		
		
		
	
	}

