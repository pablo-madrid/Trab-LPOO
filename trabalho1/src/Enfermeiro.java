package src;

class Enfermeiro extends Pessoa{
    private Integer id;
    private Pessoa pessoa;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Enfermeiro(String nome, Integer idade, String cpf, String celular, Endereco endereco, Prioridade prioridade, Integer id){
        super(nome, idade, cpf, celular, endereco, prioridade);
        this.id = id;
    }

    @Override
    public String toString(){
        return getNome()+" "+ getId();
    }
}