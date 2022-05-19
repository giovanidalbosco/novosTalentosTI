package introducao.exercicio8;

public class Vendedor extends Funcionario {
    private float percComissao;
    private float metaVendas;
    private EquipeDeVendas equipeDeVendas;

    public float getPercComissao() {
        return percComissao;
    }
    public void setPercComissao(float percComissao) {
        this.percComissao = percComissao;
    }

    public float getMetaVendas() {
        return metaVendas;
    }
    public void setMetaVendas(float metaVendas) {
        this.metaVendas = metaVendas;
    }

    public EquipeDeVendas getEquipeDeVendas() {
        return equipeDeVendas;
    }
    public void setEquipeDeVendas(EquipeDeVendas equipeDeVendas) {
        this.equipeDeVendas = equipeDeVendas;
        //getEquipeDeVendas().getListaVendedores().add(this);
    }
}
