package introducao.exercicio13;

import java.util.ArrayList;

public class Cidade {
    private String nome;
    private ArrayList<Municipio> listaMunicipios = new ArrayList<>();
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Municipio> getListaMunicipios() {
        return listaMunicipios;
    }
    public void setListaMunicipios(ArrayList<Municipio> listaMunicipios) {
        this.listaMunicipios = listaMunicipios;
    }

    public int contaCasa() {
        int contador = 0;
        for(Municipio municipio: getListaMunicipios()) {
            if(municipio.getTipo().getNome().toLowerCase().equals("casa")) {
                contador++;
            }
        }

        return contador;
    }

    public int contaApartamento() {
        int contador = 0;
        for(Municipio municipio: getListaMunicipios()) {
            if(municipio.getTipo().getNome().toLowerCase().equals("apartamento")) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        Cidade cid1 = new Cidade();
        cid1.setNome("Joinville");

        TipoResidencia tipo1 =new TipoResidencia();
        tipo1.setNome("Apartamento");

        TipoResidencia tipo2 =new TipoResidencia();
        tipo2.setNome("Casa");

        Municipio mun1 = new Municipio();
        mun1.setNome("Zezinho");
        mun1.setTipo(tipo1);

        Municipio mun2 = new Municipio();
        mun2.setNome("Mariazinha");
        mun2.setTipo(tipo1);

        Municipio mun3 = new Municipio();
        mun3.setNome("Huguinho");
        mun3.setTipo(tipo1);

        Municipio mun4 = new Municipio();
        mun4.setNome("Zezinha");
        mun4.setTipo(tipo2);

        Municipio mun5 = new Municipio();
        mun5.setNome("Luizinho");
        mun5.setTipo(tipo2);

        cid1.getListaMunicipios().add(mun1);
        cid1.getListaMunicipios().add(mun2);
        cid1.getListaMunicipios().add(mun3);
        cid1.getListaMunicipios().add(mun4);
        cid1.getListaMunicipios().add(mun5);

        int casas = cid1.contaCasa();
        int aptos = cid1.contaApartamento();

        System.out.println(String.format("Número de casas: %d\nNúmero de aptos: %d", casas, aptos));

    }
}
