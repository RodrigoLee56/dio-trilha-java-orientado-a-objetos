package centro_fabricacao.estabelecimento;

import centro_fabricacao.equipamentos.copiadora.Copiadora;
import centro_fabricacao.equipamentos.copiadora.Xerox;
import centro_fabricacao.equipamentos.digitalizadora.Digitalizadora;
import centro_fabricacao.equipamentos.digitalizadora.Scanner;
import centro_fabricacao.equipamentos.impressoras.Deskjet;
import centro_fabricacao.equipamentos.impressoras.Impressora;
import centro_fabricacao.equipamentos.impressoras.Laserjet;
import centro_fabricacao.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {

	public static void main(String[] args) {
		EquipamentoMultifuncional equipamentoMultifuncional = new EquipamentoMultifuncional();

		Deskjet deskjet = new Deskjet();
		deskjet.imprimir();

		Laserjet laserjet = new Laserjet();
		laserjet.imprimir();

		Scanner scanner = new Scanner();
		scanner.digitalizar();

		Xerox xerox = new Xerox();
		xerox.copiar();

		/* Até aqui tudo normal e sem polimorfismo */
		System.out.println("###########################################");
		/* POLIMORFISMO */

		Impressora impressora = equipamentoMultifuncional;
		impressora.imprimir();

		Copiadora copiadora = equipamentoMultifuncional;
		copiadora.copiar();

		Digitalizadora digitalizadora = equipamentoMultifuncional;
		digitalizadora.digitalizar();

	}

}
