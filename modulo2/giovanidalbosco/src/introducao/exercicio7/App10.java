package introducao.exercicio7;

import java.text.ParseException;
import java.text.SimpleDateFormat;

//as informações ainda não estão 100% a mistura das informações das agendas

public class App10 {
    public static void main(String[] args) {
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");

        Paciente paciente1 = new Paciente();
        paciente1.setId(1);
        paciente1.setNome("Jose");
        paciente1.setTelefone("(48)1111-1111");

        Paciente paciente2 = new Paciente();
        paciente2.setId(2);
        paciente2.setNome("Maria");
        paciente2.setTelefone("(48)2222-2222");

        Paciente paciente3 = new Paciente();
        paciente3.setId(3);
        paciente3.setNome("João");
        paciente3.setTelefone("(48)3333-3333");

        Paciente paciente4 = new Paciente();
        paciente4.setId(4);
        paciente4.setNome("Luiza");
        paciente4.setTelefone("(48)4444-4444");

        Medico medico1 = new Medico();
        medico1.setId(1);
        medico1.setNome("Pedro");
        medico1.setCRM("12345/SC");

        Medico medico2 = new Medico();
        medico2.setId(2);
        medico2.setNome("Joana");
        medico2.setCRM("54321/PR");

        Agenda agenda1 = new Agenda();
        agenda1.setId(1);

        Agenda agenda2 = new Agenda();
        agenda2.setId(2);

        agenda1.setMedico(medico1);
        agenda2.setMedico(medico2);

        Agendamento agendamento1 = new Agendamento();
        agendamento1.setId(1);
        try {
            agendamento1.setDataHora(data.parse("11/05/2022"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        agendamento1.setPaciente(paciente1);
        agendamento1.setMedico(medico1);

        Agendamento agendamento2 = new Agendamento();
        agendamento2.setId(2);
        try {
            agendamento2.setDataHora(data.parse("10/05/2022"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        agendamento2.setPaciente(paciente1);
        agendamento2.setMedico(medico2);

        Agendamento agendamento3 = new Agendamento();
        agendamento3.setId(3);
        try {
            agendamento3.setDataHora(data.parse("09/05/2022"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        agendamento3.setPaciente(paciente2);
        agendamento3.setMedico(medico1);

        Agendamento agendamento4 = new Agendamento();
        agendamento4.setId(4);
        try {
            agendamento4.setDataHora(data.parse("08/05/2022"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        agendamento4.setPaciente(paciente2);
        agendamento4.setMedico(medico2);

        Agendamento agendamento5 = new Agendamento();
        agendamento5.setId(2);
        try {
            agendamento5.setDataHora(data.parse("07/05/2022"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        agendamento5.setPaciente(paciente3);
        agendamento5.setMedico(medico1);

        Agendamento agendamento6 = new Agendamento();
        agendamento6.setId(6);
        try {
            agendamento6.setDataHora(data.parse("06/05/2022"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        agendamento6.setPaciente(paciente3);
        agendamento6.setMedico(medico2);

        Agendamento agendamento7 = new Agendamento();
        agendamento7.setId(7);
        try {
            agendamento7.setDataHora(data.parse("05/05/2022"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        agendamento7.setPaciente(paciente4);
        agendamento7.setMedico(medico1);

        Agendamento agendamento8 = new Agendamento();
        agendamento8.setId(8);
        try {
            agendamento8.setDataHora(data.parse("04/05/2022"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        agendamento8.setPaciente(paciente4);
        agendamento8.setMedico(medico2);

        agenda1.getListaAgendamentos().add(agendamento1);
        agenda1.getListaAgendamentos().add(agendamento2);
        agenda1.getListaAgendamentos().add(agendamento3);
        agenda1.getListaAgendamentos().add(agendamento4);

        agenda1.imprimirAgenda();
    }
}
