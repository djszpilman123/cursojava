package br.senac.rj;

import br.senac.rj.exercicio.Empregado;
import br.senac.rj.exercicio.Gerente;

public class TestarString {
    public static void main(String[] args) {
        Empregado e = new Empregado();
        e.setMatricula(1);
        e.setNome("Marcos");
        e.setTelefone("22-2222222");
        e.setEndereco("Rua das Marrecas 23");
        e.setSalario(1000);
        
        System.out.println(e.getDetalhes());

        Empregado emp = new Gerente( 2
                                   , "Joao"
                                   , "Rua dos Gansos 21"
                                   , "11-2221221"
                                   , 1200 );
        
        System.out.println(emp.getDetalhes());                
    }
}
