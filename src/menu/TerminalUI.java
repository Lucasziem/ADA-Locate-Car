package menu;

import servico.CarroServico;
import servico.ClienteFisicoServico;
import servico.ClienteJuridicoServico;

import java.util.Scanner;

public class TerminalUI {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int escolha = -1;

        CarroServico carroServico = new CarroServico();
        ClienteFisicoServico clienteFisicoServico = new ClienteFisicoServico();
        ClienteJuridicoServico clienteJuridicoServico = new ClienteJuridicoServico();

        while (escolha !=0) {
            TerminalImpressora.imprimirMenu();
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    TerminalControlador.controlarClienteMenu(scanner, clienteFisicoServico, clienteJuridicoServico, carroServico);
                    break;
                case 2:
                    TerminalControlador.controlarCarroMenu(scanner, carroServico);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
