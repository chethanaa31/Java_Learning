package day_13;

public class PassingParameters_toMainMethod {

	public static void main(String[] args) {
		
		System.out.println(args.length);
		for(String value: args)
		{
			System.out.println(value); //passing parameters in 'Run Configurations' option
		}

	}

}
