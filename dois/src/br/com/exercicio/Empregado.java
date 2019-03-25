package br.com.exercicio;

public class Empregado {
private static String nome;
private static String sobreNome;
private static int matricula;
private static double salario;

public static String getNome() {
	return nome;
}

public static void setNome(String nome) {
	Empregado.nome = nome;
}

public static String getSobreNome() {
	return sobreNome;
}

public static void setSobreNome(String sobreNome) {
	Empregado.sobreNome = sobreNome;
}

public static int getMatricula() {
	return matricula;
}

public static void setMatricula(int matricula) {
	Empregado.matricula = matricula;
}

public static double getSalario() {
	return salario;
}

public static void setSalario(double salario) {
	Empregado.salario = salario;
}

public static void aumentarSalario(float percentualAumento) {
	
}
}
