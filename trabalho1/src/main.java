package src;

import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.Random;

public class main {

	public static void main(String[] args) {

		Random random = new Random();

		Scanner sc = new Scanner(System.in);

		boolean cep;

		List<Endereco> enderecos = new LinkedList<Endereco>();

		List<Pessoa> pessoas = new LinkedList<Pessoa>();

		List<Enfermeiro> enfermeiros = new LinkedList<Enfermeiro>();

		List<Prioridade> prioridades = new LinkedList<Prioridade>();

		List<LocalVacinacao> locaisvacinacao = new LinkedList<LocalVacinacao>();

		List<Vacina> vacinas = new LinkedList<Vacina>();

		List<CarteiraVacina> carteirasvacinas = new LinkedList<CarteiraVacina>();

		// LENDO A LISTA DE ENDERECOS
		for (int i = 0; i < 7; i++) {
			cep = Boolean.parseBoolean(sc.nextLine());

			// condicoes para saber se vai ler o endereco com CEP
			if (cep) {
				enderecos.add(
						new Endereco(sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine(), sc.nextLine()));
			} else {
				enderecos.add(new Endereco(sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine()));
			}
		}
		
		// LENDO A LISTA DE PRIORIDADES
		for (int i = 0; i < 3; i++) {
			prioridades.add(new Prioridade(sc.nextLine()));
		}
		
		// LENDO A LISTA DE PESSOAS
		for (int i = 0; i < 5; i++) {
			pessoas.add(new Pessoa(sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine(),
					enderecos.get(i), prioridades.get(random.nextInt(3))));
		}

		// LENDO A LISTA DE ENFERMEIROS
		for (int i = 0; i < 2; i++) {
			enfermeiros.add(new Enfermeiro(sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine(),
					enderecos.get(random.nextInt(5)), prioridades.get(random.nextInt(3)), Integer.parseInt(sc.nextLine())));
		}

		// LENDO A LISTA DOS LOCAIS DE VACINAÇÃO
		for (int i = 0; i < 2; i++) {
			locaisvacinacao.add(new LocalVacinacao(sc.nextLine(), enderecos.get(i + 5)));
		}

		// LENDO A LISTAS DAS VACINAS
		for (int i = 0; i < 3; i++) {
			vacinas.add(new Vacina(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()),
					Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()),
					sc.nextLine()));
		}

		// LENDO A LISTA DE CARTEIRA DE VACINAS
		for (int i = 0; i < 5; i++) {
			carteirasvacinas.add(
					new CarteiraVacina(vacinas.get(2), locaisvacinacao.get(random.nextInt(2)), pessoas.get(i), enfermeiros.get(random.nextInt(2))));
		}
		
		// ADICIONANDO VACINA NAS CARTEIRAS
		for (CarteiraVacina carteiras : carteirasvacinas) {
			carteiras.adicionarVacina(vacinas.get(random.nextInt(2)));
		}
		
		System.out.println(vacinas); // Listar as vacinas cadastradas
		System.out.println(locaisvacinacao); // Listar os Locais de Vacinacao

		// IMPRIMIR AS CARTEIRAS DE VACINA
		for (CarteiraVacina carteiras : carteirasvacinas) {
			carteiras.listarVacinas();
		}
	}

}
