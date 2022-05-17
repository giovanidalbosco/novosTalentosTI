package introducao.exercicio5;

import java.util.ArrayList;

public class Residencia {
    private String endereco;
    private ArrayList<ContaLuz> fatura = new ArrayList<>();

    public Residencia(String endereco) {
        setEndereco(endereco);
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<ContaLuz> getFatura() {
        return fatura;
    }
    public void setFatura(ArrayList<ContaLuz> fatura) {
        this.fatura = fatura;
    }

    public String mesMenorConsumo() {
        float menorConsumo = 0;
        String mesMenorConsumo = "";
        for(int i=0; i < getFatura().size(); i++) {
            if(getFatura().get(i).getKwGastoMensal() < menorConsumo || menorConsumo == 0) {
                menorConsumo = getFatura().get(i).getKwGastoMensal();
                mesMenorConsumo = getFatura().get(i).getMes().getNome();
            }
        }
        return mesMenorConsumo;
    }
    
    public String mesMaiorConsumo() {
        float maiorConsumo = 0;
        String mesMaiorConsumo = "";
        for(int i=0; i < getFatura().size(); i++) {
            if(getFatura().get(i).getKwGastoMensal() > maiorConsumo || maiorConsumo == 0) {
                maiorConsumo = getFatura().get(i).getKwGastoMensal();
                mesMaiorConsumo = getFatura().get(i).getMes().getNome();
            }
        }
        return mesMaiorConsumo;
    }

    public float consumoMedio() {
        float consumoMedio = 0f;
        for(int i=0; i < getFatura().size(); i++) {
            consumoMedio += getFatura().get(i).getKwGastoMensal();
        }
        return consumoMedio / getFatura().size();
    }
    
}
