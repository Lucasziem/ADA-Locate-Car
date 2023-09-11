package menu;

import java.util.Scanner;
import servico.CarroServico;
import servico.ClienteFisicoServico;
import servico.ClienteJuridicoServico;

import java.util.Scanner;

public class TerminalControlador {
    public static void controlarMenuPrincipal(
            Scanner scanner,
            CarroServico carroServico,
            ClienteFisicoServico clienteFisicoServico,
            ClienteJuridicoServico clienteJuridicoServico
    )
    { int escolha = -1;

        while (escolha != 0) {
            TerminalImpressora.imprimirMenu();
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    controlarClienteMenu(scanner, clienteFisicoServico, clienteJuridicoServico);
                    break;
                case 2:
                    controlarCarroMenu(scanner, carroServico);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void controlarClienteMenu(
            Scanner scanner,
            ClienteFisicoServico clienteFisicoServico,
            ClienteJuridicoServico clienteJuridicoServico
    ) {
        int escolha = -1;

        while (escolha != 0) {
            TerminalImpressora.imprimirClienteMenu();
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    controlarClienteFisicoMenu(scanner, clienteFisicoServico);
                    break;
                case 2:
                    controlarClienteJuridicoMenu(scanner, clienteJuridicoServico);
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
    public static void controlarClienteFisicoMenu(
            Scanner scanner,
            ClienteFisicoServico clienteFisicoServico
    ) {
        int escolha = -1;

        while (escolha != 0) {
            TerminalImpressora.imprimirClienteFisicoMenu();
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    cadastrar(scanner, clienteFisicoServico);
                    break;
                case 2:
                    buscarPorID(scanner, clienteFisicoServico);
                    break;
                case 3:
                    alterarClienteFisico(scanner, clienteFisicoServico);
                    break;
                case 4:
                    deletarClienteFisico(scanner, clienteFisicoServico);
                    break;
                case 0:
                    System.out.println("Voltando ao menu anterior");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    public static void controlarClienteJuridicoMenu(
            Scanner scanner,
            ClienteJuridicoServico clienteJuridicoServico
    ) {
        int escolha = -1;

        while (escolha != 0) {
            TerminalImpressora.imprimirClienteJuridicoMenu();
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    cadastrar(scanner, clienteJuridicoServico);
                    break;
                case 2:
                    buscarPorID(scanner, clienteJuridicoServico);
                    break;
                case 3:
                    alterarClienteJuridico(scanner, clienteJuridicoServico);
                    break;
                case 4:
                    deletarClienteJuridico(scanner, clienteJuridicoServico);
                    break;
                case 0:
                    System.out.println("Voltando ao menu anterior");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    public static void controlarCarroMenu(
            Scanner scanner,
            CarroServico carroServico
    ) {
        int escolha = -1;

        while (escolha != 0) {
            TerminalImpressora.imprimirCarroMenu();
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    cadastrar(scanner, carroServico);
                    break;
                case 2:
                    buscarPorID(scanner, carroServico);
                    break;
                case 3:
                    alterarCarro(scanner, carroServico);
                    break;
                case 4:
                    removerCarroPorID(scanner, carroServico);
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }