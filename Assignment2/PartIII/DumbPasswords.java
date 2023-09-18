

public class DumbPasswords {

	public static void printDumbPasswords(int m, int n) {
		for (int i = 1; i < m; i++) {
            for (int j = 1; j < m; j++) {
                for (char k = 'a'; k < 'a' + n; k++) {
                    for (char l = 'a'; l < 'a' + n; l++) {
                        for (int p = 1; p < m + 1; p++) {
                            if (p > i && p > j) {
                                System.out.println(i + "" + j + "" + k + "" + l + "" + p + " ");
                            }
                        }
                    }
                }
            }
        }
	}

	public static void main(String[] args) {
		printDumbPasswords(4,2);

	}
}
