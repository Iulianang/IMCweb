import java.util.Scanner;

public class ServiceIMC {

	public static float calculoIMC (float peso, float altura)
	{
		float imc = 0;
		imc = peso / (altura * altura);
		return imc;		
	}

	
	public static String mostrarResultadoIMC(float imc){
		String mensaje = null;
		if (imc < 16) {
			mensaje = "Desnutrido";
		} else if ((imc >= 16) && (imc < 18.5)) {
			mensaje = "Bajo Peso";
		} else if ((imc >= 18.5) && (imc < 25)) {
			mensaje = "Normal";
		} else if ((imc >= 25) && (imc < 31)) {
			mensaje = "Sobre Peso";
		} else /* if (imc >= 31) */ {
			mensaje = "Obeso";
		}	
		return mensaje;
	}
	
	public static float pedirNumeroFloat()
	{
		float numleido = 0;
			Scanner scanner = new Scanner (System.in);
			numleido = scanner.nextFloat();
			
			return numleido;
			
		
	}
	
}
