
package com.mycompany.desafiopubfuture_02;


public class Receitas {
    
    //Atributos
    private float valor;
    private String dataRecebimento;
    private String dataRecebimentoEsperado;
    private String descricao;
    private Conta conta;
    private String tipoRececeita;
    

//MÉTODOS PRINCIPAIS

    public void cadastrarReceitas(String tipo,float valor){
        
        Receitas receita = new Receitas();
        this.setTipoRececeita(tipo);
        this.setValor(valor);
        
        
        
    }
    
    public void editarReceitas(float valor){
         this.setValor(valor);
    }
    
    public void removerReceitas(float saque){
        this.setValor(this.getValor() - saque);
    }
    
    public void listarReceitas(){
        
    }
    
    public void listarTotalReceitas(){
        
    }



//GETTERS E SETTERS
    

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(String dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }

    public String getDataRecebimentoEsperado() {
        return dataRecebimentoEsperado;
    }

    public void setDataRecebimentoEsperado(String dataRecebimentoEsperado) {
        this.dataRecebimentoEsperado = dataRecebimentoEsperado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getTipoRececeita() {
        return tipoRececeita;
    }

    public void setTipoRececeita(String tipoRececeita) {
        this.tipoRececeita = tipoRececeita;
    }
    
            
    
    
}
