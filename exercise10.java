import java.util.Scanner;
public class exercise10
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println ("Please enter as many POSITIVE numbers as you like. To finish enter-1");

String str;
String MyResult = "Yes";

int MyNewNumber=0;
int MyUpNumber=0;
int MyDownNumber=0;

str = System.console().readLine();
MyNewNumber  = Integer.parseInt(str);
MyDownNumber = MyNewNumber-1;
MyUpNumber = MyNewNumber+1;

str = System.console().readLine();
MyNewNumber  = Integer.parseInt(str);

while (MyNewNumber!=-1)
	{

		if( MyNewNumber != MyDownNumber)
			{
				if (MyNewNumber != MyUpNumber)
					{
					 	MyResult = "No";
					}
			}
                MyDownNumber = MyNewNumber-1;
		MyUpNumber = MyNewNumber+1;
		str = System.console().readLine();
		MyNewNumber  = Integer.parseInt(str);
 	}
 	
 System.out.println ("The result was: " + MyResult);
}}

