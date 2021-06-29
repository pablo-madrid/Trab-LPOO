package src;

import java.util.LinkedList;
import java.util.List;

class CarteiraVacina {
    //Vacina vacina;
    LocalVacinacao localVacina;
    Pessoa vacinado;
    Enfermeiro vacinador;
    
    List<Vacina> vacinas = new LinkedList<Vacina>();

    public CarteiraVacina(Vacina vacina, LocalVacinacao localVacina, Pessoa vacinado, Enfermeiro vacinador) {
        vacinas.add(vacina);
        this.localVacina = localVacina;
        this.vacinado = vacinado;
        this.vacinador = vacinador;
    }

    public void adicionarVacina(Vacina vacina){
        //vacinas.add(new Vacina(nomeVacina, fabricante, duracao, idadeMinima, dose, eficacia, restricoes));
    	vacinas.add(vacina);
    }

    public void listarVacinas(){
        System.out.println(vacinado.getNome());
        System.out.println(vacinador.getNome());
        System.out.println(localVacina.getNomeLocal());
        System.out.println(vacinas);
    }
}