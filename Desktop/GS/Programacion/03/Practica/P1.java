import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		final String meses[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		Double precipitaciones[] = new Double[12];
		Double precipitacion;
		Double mediana=0.0;
		String nombreMes="";
		Double mesLluvioso=0.0;
		Double media=0.0;
		Double desviacion=0.0;
		int count=0;
		String dato="";

		Scanner teclado = new Scanner(System.in);

		while (count<meses.length) {
			System.out.print(meses[count]+":");
			dato = teclado.next();
			try {	
				precipitacion = Double.parseDouble(dato);
				if(precipitacion<0) {
					System.out.println("No se permiten numeros negativos");
				}else {
					precipitaciones[count]=precipitacion;
					count++;
				}
			} catch (NumberFormatException e) {
				System.out.println("No es numero ");
			}
		}
		
		for (int i =0; i<precipitaciones.length;i++) {
			
			if(precipitaciones[i]>mesLluvioso) {
				mesLluvioso=precipitaciones[i];
				nombreMes=meses[i];
			}
			
			
			media=media+precipitaciones[i];
			
			
		}

        media = media/12.0;
		//Hago un bucle para calcular la desviacion (revisar desviaci�n)
		for (int i =0; i < precipitaciones.length;i++) {
			
			desviacion+=Math.pow((precipitaciones[i]-media), 2);
			
		}
		desviacion = Math.sqrt(desviacion/12.0);
		mediana = ((precipitaciones[5]+precipitaciones[6])/2.0);



		System.out.println("El mes mas lluvioso es: " + nombreMes + " con " + mesLluvioso+" mm");
		System.out.printf("La media es: %.2f mm \n", media);
		System.out.println("La mediana es: " + mediana + " mm");
		System.out.printf("La desviacion es: %.3f mm", desviacion);

		
	}
    
}
