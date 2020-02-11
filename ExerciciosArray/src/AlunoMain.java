
public class AlunoMain {
  public static void main(String[] args) {
	  Aluno aluno=new Aluno();
	  aluno.nome="Ze pequeno";
	  aluno.ra="19266876";
	  aluno.idade=18;
	  
	  aluno.estudar();
	  aluno.exibirAtributos();
	  
	  
	  Aluno aluno2=new Aluno();
	  aluno2.nome="Julio";
	  aluno2.ra="19266886";
	  aluno2.idade=16;
	  
	  aluno2.estudar();
	  aluno2.exibirAtributos();
}
   
   
}
