package br.senac.rj.exercicio;

/**
 *
 * @author admin
 */
public class Gerente extends Empregado {
    private String departamento;
    
    public Gerente() {
        super();
    }

    public Gerente( int matricula
                  , String nome
                  , String endereco
                  , String telefone
                  , float salario ) {
        this();
        super.setMatricula(matricula);
        super.setNome(nome);
        super.setEndereco(endereco);
        super.setTelefone(telefone);
        super.setSalario(salario);
    }
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    @Override
    public String getDetalhes() {
        StringBuilder sb = new StringBuilder("");
        sb.append("Nome....: ").append(super.getNome());
        sb.append("\n");
        sb.append("Endereço: ").append(super.getEndereco());
        sb.append("\n");
        sb.append("Salário.: ").append(super.getSalario());
        sb.append("\n");
        sb.append("Departamento: ").append(this.departamento);
        
        return sb.toString();
    }

    @Override
    public void aumentarSalario(float percentual) {
        float salarioNovo = super.getSalario();
        salarioNovo += salarioNovo * percentual;
        super.setSalario(salarioNovo);
    }
}
