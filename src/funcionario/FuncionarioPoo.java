package funcionario;

import java.util.Scanner;

public class FuncionarioPoo {

    Scanner entrada = new Scanner(System.in);
    private String nome;
    private int aumentarSalario;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome() {
        System.out.print("Nome do funcionário: ");
        nome = entrada.nextLine();
        this.nome = nome;

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario() {
        System.out.print("Salário do funcionário:R$ ");
        salario = entrada.nextDouble();
        this.salario = salario;

    }
    public void aumentarSalario(){
        System.out.print("Qual será o percentual de aumento: ");
        aumentarSalario = entrada.nextInt();
    }
    public void imprimirAumento(){
        double novoSalario;
        novoSalario = salario + ((salario * aumentarSalario) / 100);
        System.out.format("Novo salário:R$ %.2f\n", novoSalario);
    }
    public void imprimirDetalhes() {
        System.out.format("Nome do funcionário: %s\n", getNome());
        System.out.format("Salário do funcionário:R$ %.2f\n", getSalario());
    }

}
