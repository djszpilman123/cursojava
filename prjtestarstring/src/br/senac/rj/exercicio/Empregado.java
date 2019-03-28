package br.senac.rj.exercicio;

public class Empregado {
    private int matricula;
    private String nome;
    private String endereco;
    private String telefone;
    private float salario;

    public Empregado() {
        super();
    }
    
    public Empregado(float salario) {
        this();
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public String getDetalhes() {
        StringBuilder sb = new StringBuilder("");
        sb.append("Nome....: ").append(this.nome);
        sb.append("\n");
        sb.append("Endereço: ").append(this.endereco);
        sb.append("\n");
        sb.append("Salário.: ").append(this.salario);
        
        return sb.toString();
    }

    public void aumentarSalario(float percentual) {
        this.salario = this.salario + 
                       this.salario * percentual;
    }
}
