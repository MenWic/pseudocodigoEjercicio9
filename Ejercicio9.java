import java.util.*;

public class Ejercicio9 {

	public static void main(String args[]) {
        //Variables de Algoritmo
        Scanner scanner = new Scanner(System.in);
        int matriz[][];
        int sumaC;
        int filas;
        int colum =3;
        double promedio = 0;
        int filasTot;
        
        System.out.println("Cantidad de Pares de Temperaturas a Calcular: ");
        filas = scanner.nextInt();
        filasTot = filas+1; //Al iterar: i<filas, al sumarle uno a filas se cumplira con el numero requerido, si no seria un numero menos de filas que se requirio
        matriz = new int [filasTot][colum];
        System.out.print("\n");

        System.out.println("*** Ingrese los pares de temperaturas ***");
        for (int i=1; i<filasTot ;i++){
            for (int j=1; j<colum ;j++){
                System.out.print("Ingrese Temp correspondiente [Columna,fila] = ["+i+","+j+"]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Los pares ingresados de ");
        System.out.println("\nT1 y T2 son:");
        System.out.println("\n");

        for (int i=1; i<filasTot ;i++){
            for (int j=1; j<colum ;j++){
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println("\n");
        }

        for (int j=1; j<colum ;j++){
            sumaC = 1;
            for (int i=1; i<filasTot ;i++){
                sumaC += matriz[i][j];
                promedio = (sumaC)*1/filasTot;
            }
            System.out.print("\nEl promedio de temperaturas de columna T"+j+" es: "+promedio);
        }
    }
}
