//Hangman and Fibonacci and Math Application
//RADHESH BHATT
public class Hangman-Fibonacci
{
    public static void main (String[] args) throws Exception
    {
	int num = 0;
	int num2;
	System.out.println ("WELCOME TO JAVA ASSIGNMENT 2! CHOSE AN APPLICATION AND ENTER THE SELECTION NUMBER"); //Greets User with Welcome sign

	do
	{
	    System.out.println ("---------------------------------------------------");
	    System.out.println ("\nHangman");
	    System.out.println ("\nFibonacii Series");
	    System.out.println ("\nMath Application");
	    System.out.println ("\nExit: 4");

	    num = System.in.read (); //accepts user input for which application they would like to choose
	    System.in.skip (1);
	    num = num - 48;
	    //////////////////////////////////////HANGMAN///////////////////////////////////////////////////////
	    if (num == 1)
	    {
		char chuserinput = ' ';
		String userinput = "";
		int counter1 = 0; //counter for do while loop
		int TotalAttempts = 0;
		int live = 7; //number of attempts user gets is 7
		int CorrectAnswer = 0;
		int WrongAnswer = 0;
		String wordsused = "";//will store the words the user has inputted whether correct or incorrect

		String word[] = {"R", "A", "D", "H", "E", "S", "H"}; ////<--------SECRET WORD(shhhhhh........)
		String word2[] = {"*", "*", "*", "*", "*", "*", "*"}; ////another array for astericks (when ever user enters correct letter, asterick will turn into letter)

		System.out.println ("---------------------------------------------WELCOME TO HANGMAN--------------------------------------------");

		System.out.println ("You will have 7 lives to Guess the Word but remember, you will be slowly killing Hangman");
		System.out.println("The Secret Phrase is: *******");

		do
		{
		    
		
		    System.out.println ("Enter a letter you would like to guess");
		    chuserinput = (char) System.in.read ();//accepts user input
		    while (chuserinput != 10 && chuserinput != 13)
		    {
			userinput += chuserinput;
			chuserinput = (char) System.in.read ();
		    }

		    System.in.skip (1);
		    boolean found = false; //creates boolean

		    for (int i = 0 ; i < word.length ; i++)
		    {

			if (userinput.equalsIgnoreCase (word [i]))
			{
			    found = true;
			    word2 [i] = userinput;
			    wordsused += userinput;
			    
			}
		    }
		    if (found)////if boolean is true then.......
		    {


			System.out.println ("The letter, " + userinput + " was found in the secret phrase");///tells user that the letter is part of the secret word
			TotalAttempts++;
			CorrectAnswer++;
		    }
		    else
		    {
			TotalAttempts++;
			WrongAnswer++;
			wordsused += userinput;
			live--;


			System.out.println ("Try Again");
		    }



		    

		    counter1++;
		    System.out.println ("\nThe Secret Phrase is now: " + word2 [0] + word2 [1] + word2 [2] + word2 [3] + word2 [4] + word2 [5] + word2 [6]);
		    System.out.println ("Number of attempts: " + TotalAttempts);////outputs total attempts by user; wrong and right
		    System.out.println ("Try not to repeat the letters! Letters you have inputted already are: " + wordsused);///outputs letters that have already been used
		    System.out.println ("Number of lives left: " + live);///outputs number of lives left
		    userinput = "";

		    
		 if (live <= 0)
		{
		    System.out.println ("\n\nYOU LOST");
		    
		}
		else if (CorrectAnswer == 6)
		{
		    System.out.println ("Congratulations!! You Won! The phrase was, RADHESH"); //congrats user if the word is correct
		    live = 0;
		}
		}



		

		while (live > 0);
		
		

	      
	    }
	    //////////////////////////////////////FIBONACII///////////////////////////////////////////////////////
	    else if (num == 2)
	    {
		System.out.println ("-------------------------------------WELCOME TO FIBONACII SERIES------------------------------------------");
		String strendnum = "";
		char chendnum = ' '; ////end number for sequence
		int endnum;
		int prev;
		int next;
		int sum = 0;
		int x;
		String space = "";
		prev = 1;
		next = 1;
		System.out.println ("Where do you want to end your Fibonacii Series?");
		chendnum = (char) System.in.read ();
		while (chendnum != 10 && chendnum != 13)
		{
		    strendnum += chendnum;
		    chendnum = (char) System.in.read ();
		}
		endnum = Integer.parseInt (strendnum);////changes string to integer using this function

		while (prev <= endnum)///only loops if previous number is less than or equal to end num
		{
		    space = space + Integer.toString (prev) + ",";////converts integer to string


		    sum = prev + next;
		    prev = next;
		    next = sum;

		}
		System.out.println ("0," + space);////outputs the sequence


	    }





	    //////////////////////////////////////MATH APPLICATION///////////////////////////////////////////////////////

	    else if (num == 3)
	    {
		System.out.println ("---------------------------------------WELCOME TO THE MATH APPLICATION--------------------------------------------");
		char chuserinput2=' ';
		
		String struserinput2="";
		
		
		int useranswer=0;
		int userinput1=0;
		 int correctanswer1=0;
		int countercorrect=0; //counter for correct answers
		int counterattempted=0;//counter for total attempts
		float percentage;
		do
		{
		
	       
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Exit and Score");
		userinput1=System.in.read(); //gets user input from user for which operation they want
		System.in.skip(1);
		
		if (userinput1=='1')
		////ADDITION
		{
		System.out.println("You have chosen addition");
		int number1=(int)(Math.random()*20+1); //creates random number between 1 and 20
		int number2=(int)(Math.random()*20+1);//creates random number
		System.out.println(number1+"+"+number2+"=");
		chuserinput2 = (char) System.in.read ();
		while (chuserinput2 != 10 && chuserinput2 != 13)
		{
		    struserinput2 += chuserinput2;
		    chuserinput2 = (char) System.in.read ();
		}
		useranswer=Integer.parseInt(struserinput2);
		System.in.skip(1);
		correctanswer1=number1+number2;
		if (useranswer==correctanswer1)
		{
		countercorrect+=1;
		counterattempted+=1;
		System.out.println("Great Job! That is the Correct Answer");
		}
		else if (useranswer!=correctanswer1)
		{
		counterattempted+=1;
		System.out.println("The answer is Incorrect. The correct answer is, "+ correctanswer1);
		}
		
		}
		else if (userinput1=='2')
		////SUBTRACTION
		{
		 System.out.println("You have chosen Subtration");
		int number3=(int)(Math.random()*10+1);//creates random number
		int number4=(int)(Math.random()*10+1);//creates random number
		number3=number3+11;
		System.out.println(number3+"-"+number4+"=");
		chuserinput2 = (char) System.in.read ();
		while (chuserinput2 != 10 && chuserinput2 != 13)
		{
		    struserinput2 += chuserinput2;
		    chuserinput2 = (char) System.in.read ();
		}
		useranswer=Integer.parseInt(struserinput2);
		System.in.skip(1);
		correctanswer1=number3-number4;
		if (useranswer==correctanswer1)
		{
		countercorrect+=1;
		counterattempted+=1;
		System.out.println("Great Job! That is the Correct Answer");
		}
		else if (useranswer!=correctanswer1)
		{
		counterattempted+=1;
		System.out.println("The answer is Incorrect. The correct answer is, "+ correctanswer1);
		}
		
		}
		else if (userinput1=='3')
		{
		System.out.println("You have chosen Multiplication");
		int number5=(int)(Math.random()*10+1);//creates random number
		int number6=(int)(Math.random()*10+1);//creates random number
		System.out.println(number5+"x"+number6+"=");
		chuserinput2 = (char) System.in.read ();
		while (chuserinput2 != 10 && chuserinput2 != 13)
		{
		    struserinput2 += chuserinput2;
		    chuserinput2 = (char) System.in.read ();
		}
		useranswer=Integer.parseInt(struserinput2); //converts string to an integer
		System.in.skip(1);
		correctanswer1=number5*number6;
		if (useranswer==correctanswer1)
		{
		countercorrect+=1;
		counterattempted+=1;
		System.out.println("Great Job! That is the Correct Answer");
		}
		else if (useranswer!=correctanswer1)
		{
		counterattempted+=1;
		System.out.println("The answer is Incorrect. The correct answer is, "+ correctanswer1);
		}
		}
		else if (userinput1=='4')
		{
		System.out.println("You have chosen Division");
		int number7=(int)(Math.random()*10+11);
		int number8=(int)(Math.random()*10+1);
		System.out.println(number7+"/"+number8+"= (round to the nearest whole number)");
		chuserinput2 = (char) System.in.read ();
		while (chuserinput2 != 10 && chuserinput2 != 13)
		{
		    struserinput2 += chuserinput2;
		    chuserinput2 = (char) System.in.read ();
		}
		useranswer=Integer.parseInt(struserinput2);
		System.in.skip(1);
		correctanswer1=(number7/number8);
		if (useranswer==correctanswer1)
		{
		countercorrect+=1;
		counterattempted+=1;
		System.out.println("Great Job! That is the Correct Answer");
		}
		else if (useranswer!=correctanswer1)
		{
		counterattempted+=1;
		System.out.println("The answer is Incorrect. The correct answer is, "+ correctanswer1);
		System.out.println(useranswer);
		}
		}
		else if (userinput1=='5')
		{
		
		System.out.println("Final Score is, "+countercorrect); //outputs final score
		System.out.println("The number of questions you attemped is, "+counterattempted);//outputs total questions attemptex
		percentage=(countercorrect*100/counterattempted);
		System.out.println("The percentage of right answers is, " + percentage + "%. Hope you enjoyed! :)"); //outputs average 
		
		break; //breaks loop
		}
		else
		{
		System.out.println("Input was not valid"); //outputs if input is not valid
		}
		
		useranswer=0;
		chuserinput2=' ';
		struserinput2="";
		}while (userinput1!=5); //loop swhile userinput is NOT 5
		
		
	    }
	    else
	    {
		System.out.println ("Programming Exiting...");
		System.exit (0);
	    }



	}
	while (num <= 4);


    }
}


