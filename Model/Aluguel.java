package Model;

public class Aluguel {
    
    private String placa, cpf, data_entrega, data_devolucao, nome, fabricante, modelo;

    private int ano;
    
    public Aluguel() {
    }

    public Aluguel(String placa, String cpf, String data_entrega, String data_devolucao, String nome, String fabricante, String modelo, int ano) {
        this.placa = placa;
        this.cpf = cpf;
        this.data_entrega = data_entrega;
        this.data_devolucao = data_devolucao;
        this.nome = nome;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_entrega() {
        return data_entrega;
    }

    public void setData_entrega(String data_entrega) {
        this.data_entrega = data_entrega;
    }

    public String getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(String data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
}
