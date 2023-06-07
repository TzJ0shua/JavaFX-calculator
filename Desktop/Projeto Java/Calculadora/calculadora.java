import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        // Instancia o objeto scanner
        Scanner scanner = new Scanner(System.in);

        // BOAS VINDAS
        System.out.println("Óla, bem vindo a minha calculadora!");

        // SOLICITA QUAL A OPERAÇÂO O CLIENTE DESEJA
        System.out.println("Qual o calculo que deseja realizar?");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        // LER QUAL OPERAÇÂO DESEJA
        int numero = scanner.nextInt();
        System.out.println(numero);

        switch (numero) {
            case 1:
                System.out.println("Você entrou com adição!");
                System.out.println("Entre com o primeiro número!");
                int numeroa = scanner.nextInt();
                System.out.println("Entre com o segundo número!");
                int numerob = scanner.nextInt();
                int soma = somar(numeroa, numerob);
                System.out.println(soma);
                break;

            case 2:
                System.out.println("Você entrou com subtração!");
                System.out.println("Entre com o primeiro número!");
                int numeroc = scanner.nextInt();
                System.out.println("Entre com o segundo número!");
                int numerod = scanner.nextInt();
                int subtracao = subtrair(numeroc, numerod);
                System.out.println(subtracao);
                break;

            case 3:
                System.out.println("Você entrou com multiplicação!");
                System.out.println("Entre com o primeiro número!");
                int numeroe = scanner.nextInt();
                System.out.println("Entre com o segundo número!");
                int numerof = scanner.nextInt();
                int multiplicacao = multiplicar(numeroe, numerof);
                System.out.println(multiplicacao);
                break;

            case 4:
                System.out.println("Você entrou com divisão!");
                System.out.println("Entre com o primeiro número!");
                int numerog = scanner.nextInt();
                System.out.println("Entre com o segundo número!");
                int numeroh = scanner.nextInt();
                int divisao = dividir(numerog, numeroh);
                System.out.println(divisao);
                break;

            default:
                System.out.println("Número inválido");
                break;

        }

        scanner.close();
    }

    public static int somar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    public static int subtrair(int a, int b) {
        int resultado = a - b;
        return resultado;
    }

    public static int multiplicar(int a, int b) {
        int resultado = a * b;
        return resultado;
    }

    public static int dividir(int a, int b) {
        int resultado = a / b;
        return resultado;
    }
}