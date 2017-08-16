package atividade;

public class Execucao {
	public static void main(String args[]) {
		PessoaFisica pf = new PessoaFisica();
		pf.setRg(555555555);
		pf.setIdade(98);
		pf.setNome("Patuleifson agnaltiuz");
		System.out.println(pf.getIdade());
		System.out.println(pf.getNome());
		System.out.println(pf.getRg());
	}
}
