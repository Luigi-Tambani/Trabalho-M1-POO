package trabalho1;

public class funcionario extends pessoa {
    private double salario;
    private cargo cargo;

    public funcionario(String nome, double salario, cargo cargo) {
        super(nome);
        this.salario = salario;
        this.cargo = cargo;
    }

    public void mudarSalario(double novoSalario) {
        this.salario = novoSalario;
    }
}

