import java.util.Scanner;

public class Calculadora {
    public static void main (String[] args) {
        Scanner scannerOPC = new Scanner(System.in);
        double n1, n2, resultado;
        int opcao;

        do {
            System.out.println("Operações Disponíveis:");
            System.out.println("1. Adição(+)");
            System.out.println("2. Subtração(-)");
            System.out.println("3. Multiplicação(x)");
            System.out.println("4. Divisão(÷)");
            System.out.println("9. Sair do programa");
            System.out.print("Digite o número na ordem desejada:");

            opcao = scannerOPC.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.println("Digite o primeiro número:");
                n1 = scannerOPC.nextDouble();
                System.out.println("Digite o segundo número:");
                n2 = scannerOPC.nextDouble();

                switch (opcao) {
                    case 1:
                        resultado = n1 + n2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 2:
                        resultado = n1 - n2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 3:
                        resultado = n1 * n2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 4:
                        if (n1 != 0) {
                            resultado = n1 / n2;
                            System.out.println("Resultado: " + resultado);
                        } else {
                            System.out.println("Erro: Divisão por zero. ");
                        }
                        break;
                }
            } else if (opcao == 9) {
                System.out.println("Programa encerrado");
            } else {
                System.out.println("Opção inválida. Tente Novamente. ");
            }
        }while (opcao != 9);

        scannerOPC.close();
    }
}
