public class Principal {
  public static void main(String[] args) {
    Funcionario joao = new Funcionario();
    joao.setNome("João");
    joao.setSalario(1000);

    System.out.println(joao.getNome() + " é um funcionário e recebe um salário de R$" + joao.calculaSalario());


    Coordenador coordenadorCursoJava = new Coordenador();
    coordenadorCursoJava.setQuantidadeAlunos(8);

    joao = coordenadorCursoJava;

    System.out.println( "Ele Agora é coordenador Java. Ele tem " + coordenadorCursoJava.getQuantidadeAlunos() + " alunos como coordenador Java e por isso recebe um salário de " + joao.calculaSalario());

  }
}
