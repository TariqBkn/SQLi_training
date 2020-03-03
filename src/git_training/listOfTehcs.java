package git_training;

public class listOfTehcs {

	public static void main(String[] args) {
		String[] techs= {"mvn","ant","thirdTech"};
		
		for (String tech : techs) {
			System.err.println(tech); System.out.println("edited from master");
			System.err.println(tech); System.out.println("--");
			//this is comment
			//a forgotten comment
		}
	}

}