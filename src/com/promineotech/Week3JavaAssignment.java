package com.promineotech;

public class Week3JavaAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question 1 a.)		
		int[] ages = {3,9,23,64,2,8,28,93};
		//without defining the array, the value of the last array item must be the total amount of array entries in base 0 format [position 7 in 8 items]
		//System.out.println(ages[ages.length-1]-ages[0]);
		//b.) One cannot add items to an existing array they must therefore create a new array.  In doing so the same principals regarding first and last
		//positions apply, ergo 44 is now at array position 9 (10 entries -1 for base 0) and still the generic function results in the correct number.
		int [] ages2 = {3,9,23,64,2,8,28,93,96,44}; 
		System.out.println(ages2[ages2.length-1]-ages2[0]);
		//c. ) to calculate the average it's first necessary to calculate the sum of all the array values.  An enhanced for loop defining the sum as 
		//equal to all numbers iterated across the array of ages gives us a value to work with.  that value can then be used in a second 
		//function where the average is calculated as the sum over the length of the array which will result in the average value within the array.  
		int sum =0;
		for(int number : ages) {
			sum +=number;
		}
		int average = sum/ ages.length;
		System.out.println(average);
		//2. a.) the first part of determining the functional average from C.) in question 1 can be reused after creating the new array of String 
		//including an enhanced for loop where a new variable is defined, the iteration range is determined within the array names, and the sum is set
		//to += the length of each array item, 'name' and this is followed by the same function as before in calculating the average letters per name

		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};{
		//for printing average letters in the array
		for(int i = 0; i<names.length; i++){
		  int charCount = 0;
		  String currName = names[i];
		 for(int j = 0; j<currName.length(); j++){
		      if(currName.charAt(j) !=' '){
		          charCount++;
		      }
		  
		  System.out.println("Average of letters in " + names[i] + " is : " + (int) charCount/2);


		//b.)
			String concatNames = "";
			
		for (int k = 0; k < names.length; k++) {
			   concatNames += names[k]+" ";
			}
			System.out.println("Concatinated names are: " + concatNames);
			
		//5.) In this instance we can use an enhanced for loop for the results of the variable charcount iterated over the length of the
			//array names.  The output of this becomes the defined array in the next line as we create array nameLengths and print out the
			//results.  
			int c =0;
			for(int charcount : names.length){
			    int charcount = names[c].length;
			    int nameLengths []= {charCount};
			    System.out.println(nameLengths);
			    
		//6.) Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. 
		//Print the result to the console.	This is a reuse of an earlier question relying on a successful population of nameLengths array
			    int sum3 = 0;
			    for(int number : nameLengths) {
			    	sum3 +=number;
			    	System.out.println(sum);
			    }
		//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to
		//itself n number of times.  (i.e., if I pass in "hello" and 3, I would expect the method to return "HelloHelloHello").
	//the first step is to create a new method; Public static relying on String as the main point of focus with a name multiplyString, and 
	//the two defined variables we are given, that a string variable is defined as str and the interger as a num.  
			   
	String str = "hello";
	int num = 3;
	String hello = multiplyString("hello", 3);
	
	System.out.println(hello);
			}
	public static String multiplyString(String str, int num)
	{
		String result = "";
		for (int i=0; i < num; i++) {
		result += str;
		}
		return str; 
}
	//8.)Write a method that takes two Strings, firstName and lastName and returns a full name.  In this instance we're taking two string
	//entries and returning a result concatenated.  The method used is a public static String method we'll term metalGear which combines
	//strings dubbed first, and last.  We combined the enhanced for loop with the return results of the two plus a space between them.  
	//once we've finished this method, we can perform a sysout of a line invoking the method metalGear and the first and last names with 
	//the result being Solid Snake.  Probably the right person to call if Metal gear is about (that's game humor.) 
		
		String first = "Solid";
		String last = "Snake";
		String fullName = metalGear(first, last);
		System.out.println(fullName);
		 
		 
		public static String metalGear(String first, String last) {
			return first +" "+ last; 
		}
		
	//9.) write a method that takes an array of int and returns true if the sum of all the objects in the array is greater than 100; we 
	//begin by establishing a public static boolean method type with a method name of isSumArray for two variables, a number (we know to be
	//100) and we create an if/than statement as an answer.  If the value of the objects in the array is greater than 100, return true, else
	//return false.  
		int num1 = 100;	
		
		public static boolean isSumIntArray (int[].class, int num1) {
				if (int[].class > num1) {
				return true;
				}
				else if (int[].class == num1) {
						return false;
				}
				else (int[].class < num1) {
				return false;
			}
			}
	//10.) Write a method that takes an array of double and returns the average of all the elements in the array.  This will not have
	//an output and instead just relies on the creation of a public static double method.  The format is similar to question 7, but relies
	//on an as of yet undefined array of doubles.  The method is titled CalcAvg and will ultimately involve an array of doubles and the 
	//numbers contained within the array.  We set the sum of the double array to 0 for the purposes of creating an enhanced for loop 
	//which we define as individual values over the array itself.  We set sum as equal to each value in the array to iterate over and 
	//set the method to return a sum over the length of the array of numbers.  When run this will provide us the average.  

public static double calcAvg (double[] numbers) {
	double sum = 0;
	for (double number : numbers) {
		sum += number;
	}

	return sum / numbers.length;
}

	//11.) Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than 
	//the average of the of the elements in the second array.  
	
		public static boolean AvgCompare (double[] array1, double[] array2) {

			double sum1 =0;
			for(double number : array1) {
			sum1 +=number;
				}
			double average1 = sum1 / array1.length;

			double sum2 =0;
			for(double number2 : array2) {
			sum2 +=number2;
				}
			double average2 = sum2 / array2.length;

			if (average1 > average2) {
				return true;
			}
			else if (average1 == average2) {
				return false;
			}
			else;  {
				return false;
			}}
		//12.) write a method called willBuyDrink that takes a boolean isHotOutside, and a double MoneyInPocket and returns true if
				//it is hot outside and if moneyInPocket is greater than 10.50
		boolean isHotOutside = true;
		double moneyInPocket = 10.50;
		boolean buyDrink = willBuyDrink(isHotOutside, moneyInPocket);
		system.out.println(buyDrink);
		 
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			
			if (moneyInPocket > 10.50 && isHotOutside) {
				return true;
			}
			else if (moneyInPocket == 10.50 && isHotOutside) {
				return true;
			}
			else;  {
				return false;
		}
		
			
			
			
			
			
		//13. Create a method of your own that solves a problem.  Write what the method was and why you did it.  I wrote a method here to 
			//ease my issues with paying for rather expensive Porsche parts.  I created a boolean method to examine whether or not I -should-
			//settle for eating the expense of replacing a glass panel that is part of a 3300.00 assembly.  In this instance I opted to do so
			//as if the cost had been more, I would not have bought the panel as it would have been overpriced.  
			
			double costOfPorschePart = 700.00;
			boolean willBuy = true;
			boolean shouldBuy = overPriced(costOfPorschePart, willBuy);
		
			System.out.println(shouldBuy);
		 }
			public static boolean overPriced(double costOfPorschePart, boolean willBuy) {
				double oEM = 3300.00;
				if (costOfPorschePart > oEM) {
					return false;
				}
				else if (costOfPorschePart == oEM) {
					return false;
				}
				else;  {
					return willBuy;
			}
			
			
			}}}
			
