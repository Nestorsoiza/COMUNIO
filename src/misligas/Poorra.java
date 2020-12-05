package misligas;

public class Poorra implements Constantes {
	private double bote;

	public Poorra() {
		this.bote = 0;
	}
    public void aumentarBote(double dinero){
        bote += dinero;
    }

	public void vaciarBote() {
		bote = 0;
	}
	
	public void jornadas() {
		Resultados resultados = new Resultados();
		String[] partidos;

		// Recorremos las jornadas
		for (int i = 0; i < NUMERO_JORNADAS; i++) {

			System.out.println("JORNADA " + (i + 1));
			System.out.println("");

			// Apuesta
			for (int j = 0; j < JUGADORES.length; j++) {
				// Si un jugador puede pagar
				if (JUGADORES[j].puedePagar()) {
					// el jugador paga, dice sus resultados y el bote se aumenta
					JUGADORES[j].ponerEnElBote();
					JUGADORES[j].generarResultados();
					aumentarBote(DINERO_CADA_JORNADA);
				} else {
					// Si no puede pagar, los resultados se vacian
					JUGADORES[j].reiniciarResultados();
				}
			}
		}
	}
}