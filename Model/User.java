package Model;


public class User{
    private String login,senha,nome, cpf;
    private int id;
    private int admin;

    public User() {
    }

    public User(String login, String senha, String nome, String cpf, int id, int admin) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.cpf = cpf;
        this.id = id;
        this.admin = admin;
    }
    
    

    public User(String login,String nome, String cpf, int admin) {
        this.login = login;
        this.nome = nome;
        this.cpf = cpf;
        this.admin = admin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }

    
    
    
}
