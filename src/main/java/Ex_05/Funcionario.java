package Ex_05;

public class Funcionario {
    private String nome;
    private double salario;
    private String departamento;

    public Funcionario(String nome, int salario, String depto){
        this.nome = nome;
        this.salario = salario;
        this.departamento = depto;
    }

    public Funcionario() {

    }

    public double aumentarSalario(double aumento){
        double salarioAumento = this.salario+(salario*aumento);
        System.out.println(salarioAumento);
        return salarioAumento;
    }

    public void exibirDados(){
        System.out.println(this.nome);
        System.out.println(this.salario);
        System.out.println(this.departamento);
    }
}
