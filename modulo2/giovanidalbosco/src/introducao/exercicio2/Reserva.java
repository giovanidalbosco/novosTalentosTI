package introducao.exercicio2;

import java.util.Date;
import java.util.ArrayList;

public class Reserva {
    private int numero;
    private Date dataInicial;
    private Date dataFinal;
    private Quarto quarto;
    private ArrayList<Hospede> listaHospedes = new ArrayList<>();

    public Reserva(int numero) {
        setNumero(numero);
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDataInicial() {
        return dataInicial;
    }
    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }
    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Quarto getQuarto() {
        return quarto;
    }
    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public ArrayList<Hospede> getListaHospedes() {
        return listaHospedes;
    }
    public void setListaHospedes(ArrayList<Hospede> listaHospedes) {
        this.listaHospedes = listaHospedes;
    }

    public String toString() {
        String hospedes = "";
        
        for(Hospede umHospede:getListaHospedes()) {
            hospedes += "\n" + umHospede;
        }
        
        /*
        for(int i = 0; i < getListaHospedes().size(); i++) {
            hospedes += "\n" + getListaHospedes().get(i);;
        }*/

        StringBuilder reservaDados = new StringBuilder();
        reservaDados.append("Número da reserva: ");
        reservaDados.append(getNumero());
        reservaDados.append("\nData inicial: ");
        reservaDados.append(getDataInicial());
        reservaDados.append("\nData final: "); 
        reservaDados.append(getDataFinal());
        reservaDados.append("\nNúmero do quarto: ");
        reservaDados.append(getQuarto().getNumero());
        reservaDados.append("\nHospedes: ");
        //reservaDados.append(getListaHospedes()); retorna em formato de ArrayList
        reservaDados.append(hospedes);

        return reservaDados.toString();
    }

}