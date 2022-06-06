package introducao.exercicio14;

import java.util.ArrayList;

public class ListaTarefas {
    private ArrayList<Tarefa> listaTarefas = new ArrayList<>();

    public ArrayList<Tarefa> getListaTarefas() {
        return listaTarefas;
    }
    public void setListaTarefas(ArrayList<Tarefa> listaTarefas) {
        this.listaTarefas = listaTarefas;
    }

    public float calculaTempoTotal() {
        float total = 0f;
        for(Tarefa tarefa: getListaTarefas()) {
            total += tarefa.getTipo().getTempo();
        }

        return total;
    }

    public static void main(String[] args) {
        ListaTarefas lista1 = new ListaTarefas();

        TipoTarefa tipo1 = new TipoTarefa();
        tipo1.setNome("Fácil");
        tipo1.setTempo(10);

        TipoTarefa tipo2 = new TipoTarefa();
        tipo2.setNome("Médio");
        tipo2.setTempo(15);

        TipoTarefa tipo3 = new TipoTarefa();
        tipo3.setNome("Difícil");
        tipo3.setTempo(20);

        Tarefa tar1 = new Tarefa();
        tar1.setNome("Passear");
        tar1.setTipo(tipo1);

        Tarefa tar2 = new Tarefa();
        tar2.setNome("Pescar");
        tar2.setTipo(tipo1);

        Tarefa tar3 = new Tarefa();
        tar3.setNome("Fazer compras");
        tar3.setTipo(tipo2);

        Tarefa tar4 = new Tarefa();
        tar4.setNome("Estudar");
        tar4.setTipo(tipo2);

        Tarefa tar5 = new Tarefa();
        tar5.setNome("Trabalhar");
        tar5.setTipo(tipo3);

        Tarefa tar6 = new Tarefa();
        tar6.setNome("Aprender Orientação a Objetos");
        tar6.setTipo(tipo3);

        lista1.getListaTarefas().add(tar1);
        lista1.getListaTarefas().add(tar2);
        lista1.getListaTarefas().add(tar3);
        lista1.getListaTarefas().add(tar4);
        lista1.getListaTarefas().add(tar5);
        lista1.getListaTarefas().add(tar6);

        float tempoTotal = lista1.calculaTempoTotal();

        System.out.println(tempoTotal);

    }
}
