package section4;

public class SwapArray {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int temp;
		int lastEle = arr.length - 1;

		for (int x = 0; x < arr.length / 2; x++) {
			System.out.println("arr[x]: " + arr[x]);

			temp = arr[x];
			arr[x] = arr[lastEle];
			arr[lastEle] = temp;
			lastEle--;
//			break;
		}

		for (int x = 0; x < arr.length; x++) {
			System.out.println(arr[x]);
		}
	}

}
