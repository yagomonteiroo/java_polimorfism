public class Principal {
public static void main(String[] args) {
  Funcionario joao = new Funcionario();
  joao.setNome("João");
  joao.setSalario(1000);

  System.out.println(joao.getNome() + " recebe um salário de R$" + joao.getSalario());


  Coordenador coordenadorCursoJava = new Coordenador();
  coordenadorCursoJava.setQuantidadeAlunos(8);

  joao = coordenadorCursoJava;

  System.out.println(joao.getSalario());

}
}
