
public class MethodsFive {

	public static void main(String[] args) {
		boolean isHotOutside = true;
		double moneyInPocket = 12.5;
 
		    System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
	}
public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	if (isHotOutside == true & moneyInPocket > 10.50) {
		return true;
	}else {
		return false;
	}
}
}
