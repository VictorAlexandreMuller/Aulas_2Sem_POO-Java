package model;

public class Corrida {

    private int id;
    private Usuario user;
    private String origem;
    private String destino;
    private Motorista motorista;

    public Corrida() {
    }

    public Corrida(Usuario user, String origem, String destino, Motorista motorista) {
        this.user = user;
        this.origem = origem;
        this.destino = destino;
        this.motorista = motorista;
    }

    public Corrida(int id, Usuario user, String origem, String destino, Motorista motorista) {
        this.id = id;
        this.user = user;
        this.origem = origem;
        this.destino = destino;
        this.motorista = motorista;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

}
