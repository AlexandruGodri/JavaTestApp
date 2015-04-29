class qwerty {
	public static void main (String[] args) {
		int[] array = {1, 2, 3, 4};
		int sum = 0;
		double ave = 0.0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		ave = sum / array.length;
		System.out.println(sum + " " + ave);
	}
}
