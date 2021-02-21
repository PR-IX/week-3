import java.lang.reflect.Array;

public class MethodsFour {

	public static void main(String[] args) {
		double[] array1 = {10.4, 23.6, 54.1};
		double[] array2 = {9.5, 8.4, 74.2};
        System.out.println(isArrayGreaterThenArray(array1, array2));
	}
 public static boolean isArrayGreaterThenArray(double[]array1, double[]array2) {
	 if (array1.length > array2.length) {
		 return true;
	 }else {
		 return false;
	 }
	 
 }
}
