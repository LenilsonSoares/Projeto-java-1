import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        saudacaoUsuario();
        menu();
    }

    public static void saudacaoUsuario() {

        System.out.println("Bem-vindo ao meu primeiro projeto em Java!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Olá, " + nome + "! É um prazer te conhecer.");
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Tabuada");
            System.out.println("2. Soma");
            System.out.println("3. Subtração");
            System.out.println("4. Multiplição");
            System.out.println("5. Divisão");
            System.out.println("6. Potenciação");
            System.out.println("7. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    tabuada();
                    break;
                case 2:
                    soma();
                    break;
                case 3:
                    subtracao();
                    break;
                case 4:
                    multiplicacao();
                    break;
                case 5:
                    divisao();
                    break;
                case 6:
                    potenciacao();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
    }

    public static void tabuada() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite um número:");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 10) {
            System.out.println("Por favor, digite um numero entre 1 e 10.");
        } else {
            System.out.println("A tabuada do número " + numero + " é:");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }

    public static void soma() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o primeiro número:");
        int numero1 = scanner.nextInt();

        System.out.println("Por favor, digite um segundo número:");
        int numero2 = scanner.nextInt();

        int resultado = numero1 + numero2;
        System.out.println("A soma de " + numero1 + " e " + numero2 + " é " + resultado + ".");
    }

    public static void subtracao() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o primeiro número:");
        int numero1 = scanner.nextInt();

        System.out.println("Por favor, digite o segundo número:");
        int numero2 = scanner.nextInt();

        int resultado = numero1 - numero2;

        System.out.println("A subtração de " + numero1 + " e " + numero2 + " é " + resultado + ".");
    }

    public static void multiplicacao() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o primeiro número:");
        int numero1 = scanner.nextInt();

        System.out.println("Por favor, digite o segundo número:");
        int numero2 = scanner.nextInt();

        int resultado = numero1 * numero2;

        System.out.println("A multiplicação de " + numero1 + " e " + numero2 + " é " + resultado + ".");
    }

    public static void divisao() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o primeiro número:");
        int numero1 = scanner.nextInt();

        System.out.println("Por favor, digite o segundo número:");
        int numero2 = scanner.nextInt();

        if (numero2 == 0) {
            System.out.println("Não é possível dividir por zero.");
        } else {
            double resultado = (double) numero1 / numero2;
            System.out.println("A divisão de " + numero1 + " por " + numero2 + " é " + resultado + ".");
        }
    }

    
    public static void potenciacao() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite a base:");
        int base = scanner.nextInt();

        System.out.println("Por favor, digite o expoente:");
        int expoente = scanner.nextInt();

        double resultado = Math.pow(base, expoente);

        System.out.println("O resultado de " + base + " elevado a " + expoente + " é " + resultado + ".");
    }

}