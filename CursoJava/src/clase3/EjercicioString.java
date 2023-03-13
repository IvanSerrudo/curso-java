package clase3;

public class EjercicioString {
	public static void main(String[] args) throws Exception {
		String texto = "Hola Mundo";
		//System.out.println(texto.charAt(0)); // H
		String txt1 = "Hola!";
		String txt2 = "Chau!";
		String txt3 = txt1 + txt2; // Hola!Chau!
		String txt4 = txt1 + " " + txt2; // Hola! Chau!
		
		for (int i=0; i<texto.length();i++) {
			System.out.println(texto.charAt(i));
		}
		String txt5 = "laLa";
		//System.out.println(txt5.toLowerCase() + txt5.toUpperCase()); //lalaLALA
		System.out.println(texto.contains("mundo"));
		System.out.println(texto.contains(" Mu"));
		System.out.println(texto.replace("Hola", "Chau"));
		
		String saludo = "hola que tal";
		String string[] = saludo.split(" ");
		for (String palabra: string) {
			System.out.println(palabra);
		}
		
	}
}
