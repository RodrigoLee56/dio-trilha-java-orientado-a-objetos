

public enum EstadoBrasileiro {
	SAO_PAULO("SP", "São Paulo"), 
	RIO_JANEIRO("RJ", "Rio de Janeiro"), 
	PIAUI("PI", "Piauí"), 
	MARANHAO("MA", "Maranhão"),
	CEARA("CE", "Ceará");

	private String nome;
	private String sigla;

	private EstadoBrasileiro(String nome, String sigla) {
		this.nome = nome;
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public String getSigla() {
		return sigla;
	}

	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}

}
