package centro_fabricacao.equipamentos.multifuncional;

import centro_fabricacao.equipamentos.copiadora.Copiadora;
import centro_fabricacao.equipamentos.digitalizadora.Digitalizadora;
import centro_fabricacao.equipamentos.impressoras.Impressora;

public class EquipamentoMultifuncional implements Impressora, Digitalizadora, Copiadora {

	public void copiar() {
		System.out.println("copiando via equipamento multifuncional".toUpperCase());
	}

	public void digitalizar() {
		System.out.println("Digitalizado via equipamento multifuncional".toUpperCase());
	}

	public void imprimir() {
		System.out.println("imprimindo via equipamento multifuncional".toUpperCase());
	}

}
