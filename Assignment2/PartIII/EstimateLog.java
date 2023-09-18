
public class EstimateLog {


	public static void estimateLog(double x, int n) {
		double result = 0;
		if (x != 0) {
			while (true) {
				double log = Math.pow(-1, n+1) * (Math.pow(x, n)/n);
				result += log;
				if (Math.abs(log) < 0.0001) {
					break;
				}
				n += 1;
			}
		}
		System.out.println("ln("+ (x+1) +") is "+ result);
		System.out.println("it requires <"+ n +"> iterations to estimate ln("+ (x+1) +") within .0001");

	}

	public static void main(String[] args) {
		for (double x = 0; x < 10; x += 1) {
			int n = 1;
			estimateLog(x/10, n);
		}
	}

}
