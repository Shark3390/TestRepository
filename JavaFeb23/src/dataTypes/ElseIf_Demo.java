package dataTypes;

public class ElseIf_Demo {

	public static void main(String[] args) {
		
		/* Else if Syntax:
		 * 
		 * if (condition)
		 * {code to be executed
		 * } Else if (condition)
		 * {
		 * code to be executed
		 * } Else
		 * }
		 * code to be executed
		 * }
		 */
		int age = 99;
		
		if (age >= 18 && age <= 80) {
			System.out.println("It is high time to get married");
		} else if (age > 80 && age <= 129)
		{
			System.out.println("pray to god that \nyou are in good health");
		}
		else
		{
			System.out.println("You are too young!! \nwait for  while.");
		}
		
		
		
		
		

	}

}
