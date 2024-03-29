package br.univille.novostalentos.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.FutureOrPresent;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length=100, nullable=false)
    @NotBlank(message = "Campo nome não poder ser em branco")
    private String nome;
    private String endereco;
    @Pattern(regexp = "Masculino|Feminino",
            flags = Pattern.Flag.CANON_EQ,
            message = "Valor inválido, utiliza Masculino ou Feminino")
    private String sexo;
    @Temporal(value= TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @FutureOrPresent
    private Date dataNascimento;
    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.MERGE})
    @JoinColumn(name = "cidade_id", nullable=false)
    private Cidade cidadeResidencia;

    public Cidade getCidadeResidencia() {
        return cidadeResidencia;
    }
    public void setCidadeResidencia(Cidade cidadeResidencia) {
        this.cidadeResidencia = cidadeResidencia;
    }
    
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
