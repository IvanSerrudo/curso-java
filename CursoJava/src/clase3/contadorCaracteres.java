package clase3;

public class contadorCaracteres {
	public static void main(String[] args) throws Exception {
		String texto = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor.";
		int cont = 0;
		char letra = 'a';
		for (int i=0; i<texto.length();i++) {
			if (texto.charAt(i) == letra) {
				cont+=1;
			}
		}
		System.out.println(cont);
	}
}
