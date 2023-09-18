import java.util.ArrayList;
import java.util.Arrays;

class Permutations {

	private static void swap(int[] array, int i, int j) {
		int t = array[i];
		array[i] = array[j];
		array[j] = t;
	}

	private static void findPermutations(ArrayList<int[]> res, int[] array, int l, int h) {
		if (l == h) {
			res.add(Arrays.copyOf(array, array.length));
			return;
		}
		for (int i = l; i <= h; i++) {
			swap(array, l, i);
			findPermutations(res, array, l+1, h);
			swap(array, l, i);
		}
	}

	public static ArrayList<int[]> getPermutations(int[] array) {
		ArrayList<int[]> permutations = new ArrayList<int[]>(); //obviously your array will have more members
		int x = array.length - 1;

		findPermutations(permutations, array, 0, x);
		return permutations;

	}

    public static void main(String[] args) {
    	int[] startingArray =   {1, 3, 4};
    	ArrayList<int[]> result = getPermutations(startingArray);
    	for (int[] x : result) {
            System.out.println(Arrays.toString(x));
        }
    }
}
