package clase3;

public class EjercicioPracticoClase3 {
	public static void main(String[] args) throws Exception {
        System.out.println("Hola Mundo");
        //int numeros[] = new int[3]; //Declaración de Array de enteros
        //int numeros[] = new int[] {1, 14, 37}; // Lo mismo pero sin indicar los espacios, sino asignando los valores directamente
        int numeros[] = new int[5];
        numeros[0] = 15;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 35;
        numeros[4] = 50;
        int suma = 0;
        //Método 1 de utilización de Arrays para for:
        for (int x = 0; x < numeros.length; x++){
        	if (x%2==0) {
        		suma += numeros[x];
        	}
        	
        }
        System.out.println("La suma es: "+suma);
        //Método 2
        for (int numero : numeros){
        	System.out.println(numero);
        }
    }
}
