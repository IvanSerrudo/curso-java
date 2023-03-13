package clase3;

public class vectorOrdenado {
	public static void main(String[] args) throws Exception {
        int vector[] = new int[] {15, 8, 43};
        int valor = 0;
        boolean ordenAsc = true;
        for (int i = 0; i < vector.length; i++) {
        	for (int x = i; x < vector.length; x++) {
	        	if (ordenAsc == true) {
	        		if (vector[i] <= vector[x]) {
	        		} else {
	        			valor = vector[i];
	        			vector[i] = vector[x];
	        			vector[x] = valor;
	        		} 
	        	} else {
	        		if (vector[i] >= vector[x]) {
	        		} else {
	        			valor = vector[i];
	        			vector[i] = vector[x];
	        			vector[x] = valor;
	        		} 
	        	}
        	}
        }
        for (int y=0; y < vector.length; y++) {
        	System.out.println(vector[y]);
        }
        
	}
}
