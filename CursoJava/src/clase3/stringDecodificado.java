package clase3;

public class stringDecodificado {
	
    public static void main(String[] args) throws Exception {
    	
		String texto = "cruza el amor, yo cruzare los dedos";
		
		int desplazamiento = 2;
		
		String textoCodificado = codificar(texto, desplazamiento);
		
		System.out.println(textoCodificado);
		
		String textoDecodificado = decodificar(textoCodificado, desplazamiento);
		
		System.out.println(textoDecodificado);
		
	}
    
    private static String codificar(String texto, int desplazamiento) {
    	
    	String abc = "abcdefghijklmnñopqrstuvwxyz ";
    	
		String resultado = "";
		
		for (int i = 0; i < texto.length();i++) {
			char caracter = texto.charAt(i);
			
			for (int x = 0; x < abc.length(); x++) {
				if (abc.charAt(x) == caracter) {
					resultado += abc.charAt((x + desplazamiento)% abc.length());
				}
			}
		}
		return resultado;
    }
    
    private static String decodificar(String texto, int desplazamiento) {
        return codificar(texto, 28 - desplazamiento);
    }
}
