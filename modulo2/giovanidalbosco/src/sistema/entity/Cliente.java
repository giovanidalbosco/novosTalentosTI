package sistema.entity;
import java.util.Date;

public class Cliente {
    private long id;
    private String name;
    private String CPF;
    private Date bornDate;

    //CONTRUTORES
    public Cliente() {

    }
    public Cliente(String name, String CPF) {
        setName(name);
        setCPF(CPF);
    }

    //MÉTODOS
    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public String getCPF() {
        return CPF;
    }
    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }
    public Date getBornDate() {
        return bornDate;
    }

}
