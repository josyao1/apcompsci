package Chapter_8;

import java.util.Arrays;

public class R8_16c {

	public static void main(String[] args) {
		int[] test = new int[] {4,3,2,1,4,2,2};
		for(int i = 0; i < test.length; i++) {
			test[i] = 0;
		}
		System.out.println(Arrays.toString(test));
	}

}
