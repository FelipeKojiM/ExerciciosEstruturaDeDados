package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        do { menu();}
        while (true);
    }

    static void menu(){
        Pessoa pessoa = new Pessoa();
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nCadastro(1)\n" +
                "Login(2)\n" +
                "For(3)\n" +
                "Acessar Dados(4)\n" +
                "Selecione uma opcao: ");
                int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("CADASTRO \n");
                System.out.print("Informe seu nome: ");
                String nomeLogin = scanner.next();
                System.out.print("Informe sua senha: ");
                String senhaLogin = scanner.next();
                pessoa.setNome(nomeLogin);
                pessoa.setSenha(senhaLogin);
                break;

            case 2:
                System.out.print("LOGIN \n");
                System.out.print("Usuário: ");
                String validarNome = scanner.next();
                System.out.print("Senha: ");
                String validarSenha = scanner.next();

                if (validarNome.equals(pessoa.getNome()) && validarSenha.equals(pessoa.getSenha())) {
                    System.out.print("Informe sua altura: ");
                    double altura = scanner.nextDouble();
                    System.out.print("Informe sua idade: ");
                    int idade = scanner.nextInt();
                    System.out.print("Informe seu peso: ");
                    double peso = scanner.nextDouble();

                    pessoa.setAltura(altura);
                    pessoa.setIdade(idade);
                    pessoa.setPeso(peso);

                } else {
                    System.out.print("Credenciais incorretas!");
                }
                break;

            case 3:
                for (int i = 1; i <= 5; i++) {
                    System.out.println("i = " + i);
                }
                break;

            case 4:
                System.out.print("\nNome: "+pessoa.getNome());
                System.out.print("\nIdade: "+pessoa.getIdade());
                System.out.print("\nPeso: "+pessoa.getPeso());
                System.out.print("\nAltura: "+pessoa.getAltura()+"\n");
                break;
        }
    }
}