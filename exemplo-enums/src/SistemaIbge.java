
public class SistemaIbge {
	public static void main(String[] args) {
		for (EstadoBrasileiro uf : EstadoBrasileiro.values()) {
			System.out.println(uf.getSigla() + " - " + uf.getNomeMaiusculo());
		}
	}
}
