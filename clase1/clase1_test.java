// Ejercicio 1 a)
int numeroInicio = 5;
int numeroFin = 14;
while (numeroInicio <= numeroFin) {
	System.out.println(numeroInicio);
    numeroInicio = numeroInicio + 1; 
}

//Ejercicio 1 b)
int numeroInicio = 5;
int numeroFin = 14;
while (numeroInicio <= numeroFin) {
    if (numeroInicio % 2 == 0) {
	    System.out.println(numeroInicio);
    }
    numeroInicio = numeroInicio + 1; 
}

// Ejercicio 1 c)
int numeroInicio = 5;
int numeroFin = 14;
boolean numeroPar = false;
while (numeroInicio <= numeroFin) {
	if (numeroPar == true && numeroInicio % 2 == 0) {
	    System.out.println(numeroInicio);
	} if (numeroPar != true && numeroInicio % 2 != 0) {
	    System.out.println(numeroInicio);
	}
    numeroInicio = numeroInicio + 1; 
}

// Ejercicio 1 d)
for (int numeroInicio = 5; numeroInicio <= 14; numeroInicio++) {
    if (numeroInicio % 2 == 0) {
	    System.out.println(numeroInicio);
    }
}

/*
Ejercicio 2
a) variables de entrada: ingresosMensuales, Vehiculos, Inmuebles, propiedadLujo
d)
*/
float ingresosMensuales = 299000;
int cantVehiculos = 1;
int cantInmuebles = 1;
boolean propiedadLujo = false;
if ( (ingresosMensuales >= 489063) || (cantVehiculos >= 3) || (cantInmuebles >= 3) || propiedadLujo == true) {
    System.out.println("Altos ingresos");
} else {
    System.out.println("No pertenece a la categoría de altos ingresos");
}