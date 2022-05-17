package introducao.exercicio7;

import java.util.ArrayList;

public class Agenda {
    private long id;
    private ArrayList<Agendamento> listaAgendamentos = new ArrayList<>();
    private Medico medico;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public ArrayList<Agendamento> getListaAgendamentos() {
        return listaAgendamentos;
    }
    public void setListaAgendamentos(ArrayList<Agendamento> listaAgendamentos) {
        this.listaAgendamentos = listaAgendamentos;
    }

    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void imprimirAgenda() {
        StringBuilder infos = new StringBuilder();
        for(int i = 0; i < getListaAgendamentos().size(); i++) {
            infos.append("Agenda: " + getId());
            infos.append("\nApontamento: " + getListaAgendamentos().get(i).getId());
            infos.append("\nData: " + getListaAgendamentos().get(i).getDataHora());
            infos.append("\nPaciente Id: " + getListaAgendamentos().get(i).getPaciente().getId());
            infos.append("\nPaciente: " + getListaAgendamentos().get(i).getPaciente().getNome());
            infos.append("\nTelefone: " + getListaAgendamentos().get(i).getPaciente().getTelefone());
            infos.append("\nMedico Id: " + getListaAgendamentos().get(i).getMedico().getId());
            infos.append("\nMedico: " + getListaAgendamentos().get(i).getMedico().getNome());
            infos.append("\nCRM: " + getListaAgendamentos().get(i).getMedico().getCRM()); 
        }
        System.out.println(infos.toString());
    }
}
