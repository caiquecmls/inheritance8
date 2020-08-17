/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author caiqu
 */
public class PessoaJuridica extends Pessoa {

    private int numeroFuncionario;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, double rendaAnual, int numeroFuncionario) {
        super(nome, rendaAnual);
        this.numeroFuncionario = numeroFuncionario;
    }

    public double getNumeroFuncionario() {
        return numeroFuncionario;
    }

    public void setNumeroFuncionario(int numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }

    @Override
    public double calculoImposto() {
        double resultado = 0.0;
        if (numeroFuncionario > 10) {
            resultado += getRendaAnual() * 0.14;
        }else{
            resultado += getRendaAnual() * 0.16;
        }
        return resultado;
    }

}
