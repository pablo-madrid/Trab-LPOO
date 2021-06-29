package src;

class Vacina{
    private String nomeVacina;
    private String fabricante;
    private Integer duracao;
    private Integer idadeMinima;
    private Integer dose;
    private Integer eficacia;
    private String restricoes;

    public Vacina(String nomeVacina, String fabricante, Integer duracao, Integer idadeMinima, Integer dose, Integer eficacia, String restricoes){
        this.nomeVacina = nomeVacina;
        this.fabricante = fabricante;
        this.duracao = duracao;
        this.idadeMinima = idadeMinima;
        this.dose = dose;
        this.eficacia = eficacia;
        this.restricoes = restricoes;
    }

    public String getNomeVacina() {
        return this.nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Integer getDuracao() {
        return this.duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public Integer getIdadeMinima() {
        return this.idadeMinima;
    }

    public void setIdadeMinima(Integer idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public Integer getDose() {
        return this.dose;
    }

    public void setDose(Integer dose) {
        this.dose = dose;
    }

    public Integer getEficacia() {
        return this.eficacia;
    }

    public void setEficacia(Integer eficacia) {
        this.eficacia = eficacia;
    }

    public String getRestricoes() {
        return this.restricoes;
    }

    public void setRestricoes(String restricoes) {
        this.restricoes = restricoes;
    }

    @Override
    public String toString(){
        return getNomeVacina();
    }

    //não sei oq ela quer comparar
    //public compareTo(){
        //implementar
    //}
}