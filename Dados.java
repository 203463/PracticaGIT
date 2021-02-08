import java.io.*;
import java.math.*;

public class Dados {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int v1 = 0;
		int v2 = 0;
		int v3 = 0;
		int v4 = 0;
		String Opcion;
		do {
			v1 = (int)(Math.random()*(5)+1);
			v2 = (int)(Math.random()*(5)+1);
			v3 = (v1+v2);
			System.out.println("El dado uno cayo en: "+v1+" y el dado dos cayo en: "+v2);
			System.out.println("La suma de los dos dados es "+(v1+v2));
			if (v3==2 || v3==3 || v3==12) {
				System.out.println("Usted ha perdido. ");
				v4 = 0;
			} else {
				if (v3==7 || v3==11) {
					System.out.println("Usted ha ganado, se le otorga el premio mayor. ");
					System.out.println("Los puntos acumulados fueron: "+v4);
					v4 = 0;
				} else {
					if (v3==4 || v3==5 || v3==6 || v3==8 || v3==9 || v3==10) {
						v4 = v4+v3;
						System.out.println("Los puntos se acumularan. ");
						System.out.println("Los puntos acumulados son: "+v4);
					} else {
					}
				}
			}
			System.out.println("Desea lanzar los dados nuevamente? S/N");
			Opcion = bufEntrada.readLine();
		} while (!Opcion.equals("N"));
	}
}