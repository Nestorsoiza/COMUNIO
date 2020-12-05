package misligas;

public class Metodos {
	public static int generaNumeroAleatorio(int minimo, int maximo) {
		int num = (int) (Math.random() * (minimo - (maximo + 1)));
		return num;
	}

	
}
