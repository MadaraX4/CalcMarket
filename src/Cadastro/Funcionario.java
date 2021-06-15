package Cadastro;



public class Funcionario {

    private String nome;
    private String telefone;
    private String cpf;
    private int codFuncionario;
    private String senha;
    private int id;

    public Funcionario(String nome, String telefone, String cpf, int codFuncionario, String senha, int id) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.codFuncionario = codFuncionario;
        this.senha = senha;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCódFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
