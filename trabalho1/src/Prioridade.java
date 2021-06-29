package src;

class Prioridade{
    private String tipoPrioridade;

    public String getTipoPrioridade() {
        return this.tipoPrioridade;
    }

    public void setTipoPrioridade(String tipoPrioridade) {
        this.tipoPrioridade = tipoPrioridade;
    }

    public Prioridade(String tipoPrioridade){
        this.tipoPrioridade = tipoPrioridade;
    }

    @Override
    public String toString(){
        return getTipoPrioridade();
    }
}