package br.com.exercicio;

public class Fatura {
private static String numeroParte;
private static String descricaoParte;
private static int quantidade;
private static double precoitem;

public static String getNumeroParte() {
	return numeroParte;
}

public static void setNumeroParte(String numeroParte) {
	Fatura.numeroParte = numeroParte;
}

public static String getDescricaoParte() {
	return descricaoParte;
}

public static void setDescricaoParte(String descricaoParte) {
	Fatura.descricaoParte = descricaoParte;
}

public static int getQuantidade() {
	return quantidade;
}

public static void setQuantidade(int quantidade) {
	Fatura.quantidade = quantidade;
}

public static double getPrecoitem() {
	return precoitem;
}

public static void setPrecoitem(double precoitem) {
	Fatura.precoitem = precoitem;
}

public static void aplicarDesconto(int valorDesconto) {
	
}
}
