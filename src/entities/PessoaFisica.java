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
public class PessoaFisica extends Pessoa {

    private double gastoSaude;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, double rendaAnual, double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double calculoImposto() {
        double resultado = 0.0;
        if (getRendaAnual() < 20000.0) {
            resultado += getRendaAnual() * 0.15 - (gastoSaude * (0.5));
        }else{
            resultado += getRendaAnual() * 0.25 - (gastoSaude * (0.5));
        }
        return resultado;
    }

}
