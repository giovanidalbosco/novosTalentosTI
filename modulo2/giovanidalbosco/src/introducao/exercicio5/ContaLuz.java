package introducao.exercicio5;

import java.util.Date;

public class ContaLuz {
    private Date dataLeitura;
    private int numeroLeitura;
    private float kwGastoMensal;
    private Date dataPagamento;
    private Mes mes;

    public Date getDataLeitura() {
        return dataLeitura;
    }
    public void setDataLeitura(Date dataLeitura) {
        this.dataLeitura = dataLeitura;
    }

    public int getNumeroLeitura() {
        return numeroLeitura;
    }
    public void setNumeroLeitura(int numeroLeitura) {
        this.numeroLeitura = numeroLeitura;
    }

    public float getKwGastoMensal() {
        return kwGastoMensal;
    }
    public void setKwGastoMensal(float kwGastoMensal) {
        this.kwGastoMensal = kwGastoMensal;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }
    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public float valorContaLuz(float kwGastoMensal) {
        float valorContaluz = 0.92f * getKwGastoMensal();
        return valorContaluz;
    }

    public Mes getMes() {
        return mes;
    }
    public void setMes(Mes mes) {
        this.mes = mes;
    }

}
