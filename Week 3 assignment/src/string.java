
public class string {

	public static void main(String[] args) {
		String [] names = {"Sam", "Tommy", "Tim", "Salley", "Buck", "Bob"};
		int sum = 0;
		for (int i = 0; i < names.length; i++) {
			sum += names[i].length();
		
			
		}
		
		int average = sum / names.length;
		System.out.println("average number of letters in each name" + " " + average);
		
		String totalnames = "";
		for (int i = 0; i < names.length; i++) {
			 totalnames += names[i] + " ";
			 
		}
		System.out.println(totalnames);
		
		System.out.println("To access the last element in an array use array[array.length - 1]");
		System.out.println("To access the first element in an array use array[0]");
		
		int[] namelengths = new int[names.length];
		for (int i=0; i < names.length; i++) {
			namelengths[i] = names.length;
			
		}
		sum = 0;
		for (int i = 0; i < names.length; i++) {
		sum += namelengths[i];	
			
		}
		System.out.println("The sum of all elements in the array is" + " " + sum);
		
	}
	
	}
	
		
			
		
			 
		

	


