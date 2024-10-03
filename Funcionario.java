 public class Funcionario {
        private String nome;
        private int nasc;
        private double salario;

        public Funcionario(String nome, int nasc, double salario) {
            this.nome = nome;
            this.nasc = nasc;
            this.salario = salario;
        }
        public void informarSalario(){
            System.out.printf("Salário: %.3f R$%n", salario);
        }
        public void calcularIdade(){
            int idade = 2024 - nasc;
            System.out.println(idade);
        }
    }

