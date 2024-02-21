public class Coordenador extends Funcionario{

  private int quantidadeAlunos;

  public int getQuantidadeAlunos() {
    return quantidadeAlunos;
  }

  public void setQuantidadeAlunos(int quantidadeAlunos) {
    this.quantidadeAlunos = quantidadeAlunos;
  }

  public double calculaSalario(){
    return getQuantidadeAlunos() * 20;
  }
  
}