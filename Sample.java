package day8;

public class Sample {

	public static void main(String[] args) {
		// Printing command line arguments
		if(args.length>0)
		{
			System.out.print("The command line "+" arguments are:");
			for(String val:args)
			{
				System.out.println(val);
			}
		}
		else
		{
			System.out.println("No command line "+" arguments found.");
		}
		

	}

}
