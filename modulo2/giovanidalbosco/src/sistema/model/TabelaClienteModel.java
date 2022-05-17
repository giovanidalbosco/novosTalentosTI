package sistema.model;

import javax.swing.table.AbstractTableModel;

import sistema.controller.ListagemClienteController;

public class TabelaClienteModel extends AbstractTableModel {
    private ListagemClienteController controller;

    public TabelaClienteModel(ListagemClienteController controller) {
        this.controller = controller;
    }

    @Override
    public int getRowCount() {
        // TODO Auto-generated method stub
        return controller.getAllClientes().size();
    }

    @Override
    public int getColumnCount() {
        // TODO Auto-generated method stub
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // TODO Auto-generated method stub
        var umCliente = controller.getAllClientes().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return umCliente.getId();
            case 1:
                return umCliente.getName();
            case 2:
                return umCliente.getBornDate();
            default:
                return "";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return new String[]{"Código","Nome","Data Nascimento",""}[column];
    }
}
