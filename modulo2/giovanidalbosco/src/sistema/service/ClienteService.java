package sistema.service;

import sistema.dao.ClienteDAO;
import sistema.entity.Cliente;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class ClienteService {
    //private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private ClienteDAO clienteDAO = new ClienteDAO();

    public ClienteService() {
        /*var cliente1 = new Cliente();
        cliente1.setId(1);
        cliente1.setNome("Zezinho");
        cliente1.setCPF("555.555.555-55");
        Calendar calendario = GregorianCalendar.getInstance();
        calendario.set(2022, 05, 12);
        cliente1.setDataNascimento(calendario.getTime());
        listaClientes.add(cliente1);
        var cliente2 = new Cliente();
        cliente2.setId(2);
        cliente2.setNome("Luizinho");
        cliente2.setCPF("222.222.222-22");
        calendario.set(2020, 03, 15);
        cliente2.setDataNascimento(calendario.getTime());
        listaClientes.add(cliente2);*/ 
    }

    public ArrayList<Cliente> getAllClientes() {
        return clienteDAO.getAll();
    }

    public Cliente save(Cliente cliente) {
        //listaClientes.add(cliente);
        clienteDAO.save(cliente);
        return cliente;
    }

    public void remove(Cliente cliente) {
        clienteDAO.delete(cliente.getId());
    }

}