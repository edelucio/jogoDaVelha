package jogoDaVelha;

public class JogoDaVelha {

	private static Jogo jogo;

	public static void main(String[] args) {
		
		setJogo(new Jogo());

	}

	public static Jogo getJogo() {
		return jogo;
	}

	public static void setJogo(Jogo jogo) {
		JogoDaVelha.jogo = jogo;
	}

}
