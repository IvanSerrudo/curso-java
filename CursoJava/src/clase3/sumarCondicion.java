package clase3;

public class sumarCondicion {
	public static void main(String[] args) throws Exception {
		int vector[] = new int[] {25, 13, 8, 50, 36};
		int x = 20;
		int suma = 0;
		for (int i=0; i < vector.length;i++) {
			if (vector[i] > x) {
				suma = suma + vector[i];
			}
		}
		System.out.println(suma);
	}
}
