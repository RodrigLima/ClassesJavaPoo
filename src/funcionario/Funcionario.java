
package funcionario;

public class Funcionario {

    public static void main(String[] args) {
      FuncionarioPoo funcionario1 = new FuncionarioPoo();
      
     
      funcionario1.setNome();
      funcionario1.setSalario();
      funcionario1.imprimirDetalhes();
      
      funcionario1.aumentarSalario();
      funcionario1.imprimirAumento();
    }
    
}
