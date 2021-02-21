
public class MoreMethods {

	public static void main(String[] args) {
		String firstName = "Tyler";
		String lastName = "Jefferson";
        String fullName = createFullname(firstName, lastName);
        
        System.out.println(fullName);
	}
	 public static String createFullname(String firstName, String lastName) {
	    	String fullName = firstName + " " + lastName;
	    	return fullName;
}

}
