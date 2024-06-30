package desafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        boolean parametrosValidos = false;
        int parametroUm = 0;
        int parametroDois = 0;

        do {
            try {
                System.out.println("Digite o primeiro parâmetro");
                parametroUm = terminal.nextInt();
                System.out.println("Digite o segundo parâmetro");
                parametroDois = terminal.nextInt();

                // Chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);
                parametrosValidos = true; // Se não lançar exceção, parâmetros são válidos
            } catch (ParametrosInvalidosException exception) {
                // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.out.println(exception.getMessage());
            }
        } while (!parametrosValidos);
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = parametroDois - parametroUm;
        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
