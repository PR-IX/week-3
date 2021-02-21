
public class Arrays {

	public static void main(String[] args) {
		
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93, 98};
		int first = ages[0]; 
		int last = ages[ages.length - 1]; 
        int sum =  last - first;
		//System.out.println(ages[i]);
		System.out.println(sum);
		int average = 0;
		for(int i = 0; i < ages.length; i++ ) {
			System.out.println(ages[i]);
		average += ages[i];
		
		}
		average = average / ages.length;
		System.out.println(average);
		}
 				
		
	}


