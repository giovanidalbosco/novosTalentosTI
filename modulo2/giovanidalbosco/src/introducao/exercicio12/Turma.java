package introducao.exercicio12;

import java.util.ArrayList;

public class Turma {
    private String serie;
    private ArrayList<Crianca> listaCriancas = new ArrayList<>();
    
    public String getSerie() {
        return serie;
    }
    public void setSerie(String serie) {
        this.serie = serie;
    }

    public ArrayList<Crianca> getListaCriancas() {
        return listaCriancas;
    }
    public void setListaCriancas(ArrayList<Crianca> listaCriancas) {
        this.listaCriancas = listaCriancas;
    }

    public int contaMeninos() {
        int contador = 0;
        for(Crianca meninos: getListaCriancas()) {
            if(meninos.getSexo().toLowerCase().equals("masculino")) {
                contador++;
            }
        }

        return contador;
    }

    public int contaMeninas() {
        int contador = 0;
        for(Crianca meninas: getListaCriancas()) {
            if(meninas.getSexo().toLowerCase().equals("feminino")) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        Turma turma1 = new Turma();
        turma1.setSerie("5 serie");

        Crianca crianca1 = new Crianca();
        crianca1.setNome("Zezinho");
        crianca1.setSexo("Masculino");

        Crianca crianca2 = new Crianca();
        crianca2.setNome("Mariazinha");
        crianca2.setSexo("Feminino");
        
        Crianca crianca3 = new Crianca();
        crianca3.setNome("Aninha");
        crianca3.setSexo("FEMININO");
        
        Crianca crianca4 = new Crianca();
        crianca4.setNome("Julinha");
        crianca4.setSexo("feminino");

        turma1.getListaCriancas().add(crianca1);
        turma1.getListaCriancas().add(crianca2);
        turma1.getListaCriancas().add(crianca3);
        turma1.getListaCriancas().add(crianca4);

        int totalMeninos = turma1.contaMeninos();
        int totalMeninas = turma1.contaMeninas();

        System.out.println(String.format("O total de meninos é %d e de meninas é %d", totalMeninos, totalMeninas));
    }
}
