
public class methodDouble {

	public static void main(String[] args) {
		double[] score = new double[3];
        score[0] = 70.3;
        score[1] = 90.7;
        score[2] = 98.9;
        System.out.println(calculateAverage(score));
	}
 public static double calculateAverage(double[] numbers) {
double sum = 0;
for (double number : numbers) {
	sum += number;
}
return sum / numbers.length;
 }
}
