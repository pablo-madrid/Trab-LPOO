package src;

class LocalVacinacao{
    private String nomeLocal;
    private Endereco endereco;

    public String getNomeLocal() {
        return this.nomeLocal;
    }

    public void setNomeLocal(String nomeLocal) {
        this.nomeLocal = nomeLocal;
    }

    public LocalVacinacao(String nomeLocal, Endereco endereco){
        this.nomeLocal = nomeLocal;
        this.endereco = endereco;
    }

    @Override
    public String toString(){
        return getNomeLocal()+" "+endereco.getRua()+" "+endereco.getNumero()+" "+endereco.getBairro();
    }
}