import java.util.Scanner;

public class Funcionario {

	private String nome;
    private double salario;
    private int reajuste;
	
    public Funcionario(String argNome, double argSalario, int argReajuste) {
//        nome = argNome;
//        salario = argSalario;
//        reajuste = argReajuste;
    	setNome(argNome);
    	setSalario(argSalario);
    	setReajuste(argReajuste);
    }
    
    public void reajustarSalario() {
        salario *= 1 + (reajuste / 100.0);
    }
    
    public String getNome() {
		return nome;
	}

	public void setNome(String argNome) {
		nome = argNome.toUpperCase();
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double argSalario) {
		salario = argSalario;
	}

	public int getReajuste() {
		return reajuste;
	}

	public void setReajuste(int argReajuste) {
		if(argReajuste >= 0)
			reajuste = argReajuste;
		else
			reajuste = 0;
	}

	public static void main(String args[]){
        Scanner scanner;
        Funcionario funcionario;
        String nome;
        double sal;
        int reaj;
        scanner = new Scanner(System.in);


        System.out.println("Nome: ");
        nome = scanner.nextLine();
        System.out.println("Salario: ");
        sal = scanner.nextDouble();
        System.out.println("Reajuste: ");
        reaj = scanner.nextInt();
        funcionario = new Funcionario(nome, sal, reaj);
        funcionario.reajustarSalario();
        System.out.println("Salario reajustado de " + nome + ": " + funcionario.getSalario());
        System.out.println("Salario reajustado de " + nome + ": " + funcionario.getSalario());
        System.out.println("Salario reajustado de " + nome + ": " + funcionario.getSalario());
    }
}
