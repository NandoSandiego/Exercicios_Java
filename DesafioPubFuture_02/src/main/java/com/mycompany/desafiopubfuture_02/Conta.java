
package com.mycompany.desafiopubfuture_02;

class Conta {
    
//Atributos
    private float saldo;
    private String tipoConta;
    private String instituicaoFinanceira;
    

//METOOS PRINCIPAIS
    
    public void cadastrarConta(Conta novaConta){
        
    }
    
    public void editarConta(Conta conta,String tipoConta){
        conta.setTipoConta(tipoConta);
        
    }
    
    public void removerConta(){
        
    }
    
    public void listarContas(){
        
    }
    
    public void transferirSaldoEntreContas(){
        
    }
    
    public void listarSaldoTotal(){
        
    }

    
    
//GETTERS E SETTERS

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getInstituicaoFinanceira() {
        return instituicaoFinanceira;
    }

    public void setInstituicaoFinanceira(String instituicaoFinanceira) {
        this.instituicaoFinanceira = instituicaoFinanceira;
    }

    
    
}
