package br.univille.novostalentos.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Temporal(value=TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date data;
    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.MERGE})
    private Cliente comprador;
    // @OneToMany(mappedBy="venda")
    // private ArrayList<ItemVenda> colItens;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getComprador() {
        return comprador;
    }
    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    // public ArrayList<ItemVenda> getColItens() {
    //     return colItens;
    // }
    // public void setColItens(ArrayList<ItemVenda> colItens) {
    //     this.colItens = colItens;
    // }


}