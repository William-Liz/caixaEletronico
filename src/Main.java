//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //atribui as notas ao estoque
        int n100 = 5;
        int n50 = 10;
        int n20 = 10;
        int n10 = 20;

        //menu
        int opcao;

        do {
            System.out.println("\n---Menu---\n ");
            System.out.println("1- Saldo\n ");
            System.out.println("2- saque\n ");
            System.out.println("3- sair\n ");
            opcao = in.nextInt();
            switch (opcao) {
                case 1 -> {

                    //imprime o saldo
                    int total = n100 * 100 + n50 * 50 + n20 * 20 + n10 * 10;

                    System.out.println("Notas de 100: " + n100);
                    System.out.println("Notas de 50: " + n50);
                    System.out.println("Notas de 20: " + n20);
                    System.out.println("Notas de 10: " + n10);
                    System.out.println("Em Caixa: " + total);
                }
                case 2 -> {

                    //
                    System.out.println("Quantidade de saque: ");
                    int saque = in.nextInt();

                    if (saque <= 0) {
                        System.out.println("Valor invalido! ");
                        break;
                    } else if (saque % 10 != 0) {
                        System.out.println("O valor deve ser múltiplo de 10! ");
                        break;
                    }
                    int rest = saque;
                    int use100 = Math.min(rest / 100, n100);
                    rest -= use100 * 100;
                    int use50 = Math.min(rest / 50, n50);
                    rest -= use50 * 50;
                    int use20 = Math.min(rest / 20, n20);
                    rest -= use20 * 20;
                    int use10 = Math.min(rest / 10, n10);
                    rest -= use10 * 10;

                    if (rest == 0) {
                        n100 -= use100;
                        n50 -= use50;
                        n20 -= use20;
                        n10 -= use10;
                        System.out.println("\nSaque realizado com sucesso!");
                        System.out.println("Notas entregues: ");
                        if (use100 > 0)
                            System.out.println("Notas de 100: " + use100);
                        if (use50 > 0)
                            System.out.println("Notas de 50: " + use50);
                        if (use20 > 0)
                            System.out.println("Notas de 20: " + use20);
                        if (use10 > 0)
                            System.out.println("Notas de 10: " + use10);
                    } else {
                        System.out.println("Não há cedulas o suficiente! ");
                    }
                }
                case 3 -> {
                    System.out.println("Encerrando o sistema...");
                    break;

                }
            }
        }
        while (opcao != 3) ;
        in.close();
    }
}