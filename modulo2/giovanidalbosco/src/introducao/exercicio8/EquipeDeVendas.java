package introducao.exercicio8;

import java.util.ArrayList;

public class EquipeDeVendas {
    private Gerente gestor;
    private ArrayList<Vendedor> listaVendedores = new ArrayList<>();

    public Gerente getGestor() {
        return gestor;
    }
    public void setGestor(Gerente gestor) {
        this.gestor = gestor;
    }

    public ArrayList<Vendedor> getListaVendedores() {
        return listaVendedores;
    }
    public void setListaVendedores(ArrayList<Vendedor> listaVendedores) {
        this.listaVendedores = listaVendedores;
    }

    public String listarEquipe() {
        StringBuilder dados = new StringBuilder();
        dados.append("\nNome Gerente: " + getGestor().getNome());
        dados.append("\nId Gerente: " + getGestor().getId());
        dados.append("\nSetor: " + getGestor().getSetor());
        dados.append("\nTel Gerente: " + getGestor().getTelefone());
        
        
        for(int i = 0; i < getListaVendedores().size(); i++) {
            dados.append("\n\nNome Vendedor: " + getListaVendedores().get(i).getNome());
            dados.append("\nId Vendedor: " + getListaVendedores().get(i).getId());
            dados.append("\nMeta Vendedor: " + getListaVendedores().get(i).getMetaVendas());
            dados.append("\nComissão Vendedor: " + getListaVendedores().get(i).getPercComissao());
            dados.append("\nTel Vendedor: " + getListaVendedores().get(i).getTelefone());
        }

        return dados.toString();
    }
}
