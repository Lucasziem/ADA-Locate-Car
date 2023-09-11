import modelo.Carro;
import modelo.ClienteFisico;
import modelo.ClienteJuridico;
import modelo.Tamanho;
import persistencia.memoria.CarroRepositorioMemoria;
import persistencia.memoria.ClienteFisicoRepositorioMemoria;
import persistencia.memoria.ClienteJuridicoRepositorioMemoria;
import servico.CarroServico;
import servico.ClienteFisicoServico;
import servico.ClienteJuridicoServico;

public class TerminalTeste {

    public static void main(String[] args) {

        // CARRO
        CarroRepositorioMemoria carroRepositorioMemoria = new CarroRepositorioMemoria();
        CarroServico carroServico = new CarroServico(carroRepositorioMemoria);

        Carro carro1 = new Carro(1,"civic", "honda", "prata","419s8s-1s1", Tamanho.MEDIO);
        Carro carro2 = new Carro(2,"civic 2", "honda 2", "prata 2","234242419s8s-1s1", Tamanho.PEQUENO);


        System.out.println("********************** \nCadastrando carro 1...");
        carroServico.cadastrar(carro1);

        System.out.println("********************** \nCadastrando carro 2...");
        carroServico.cadastrar(carro2);

        System.out.println("********************** \nCadastrando carro 2...");
        carroServico.cadastrar(carro2);

        // Buscar carro por id
        try {
            System.out.println("********************** \nBuscando carro de id 1");
            Carro carroBuscado1 = carroServico.buscarPorId(1);
            System.out.println("Carro encontrado! \n id: " + carroBuscado1.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            System.out.println("********************** \nBuscando carro de id 2");
            Carro carroBuscado2 = carroServico.buscarPorId(2);
            System.out.println("Carro encontrado! \n id: " + carroBuscado2.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // Remover carro por id
        System.out.println("********************** \nRemovendo carro de id 2");
        carroServico.removerCarroPorId(2);
        try {
            System.out.println("********************** \nBuscando carro de id 2");
            Carro carroBuscado2 = carroServico.buscarPorId(2);
            System.out.println("Carro encontrado! \n id: " + carroBuscado2.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // CLIENTE FÍSICO
        ClienteFisicoRepositorioMemoria clienteFisicoRepositorioMemoria = new ClienteFisicoRepositorioMemoria();
        ClienteFisicoServico clienteFisicoServico = new ClienteFisicoServico(clienteFisicoRepositorioMemoria);

        ClienteFisico clienteFisico1 = new ClienteFisico(1, "Claudio Silva", "Rua das Magnolias, 313, Santo André, São Paulo", , 045.786.543-65)
        ClienteFisico clienteFisico2 = new ClienteFisico(2,"Fernando Souza", "Rua das Camelias, 654, São Bernardo, São Paulo", , 954.654.655-56);


        System.out.println("********************** \nCadastrando Cliente Fisico 1...");
        ClienteFisicoServico.cadastrar(clienteFisico1);

        System.out.println("********************** \nCadastrando Cliente Fisico 2...");
        ClienteFisicoServico.cadastrar(clienteFisico2);

        System.out.println("********************** \nCadastrando Cliente Fisico 3...");
        ClienteFisicoServico.cadastrar(clienteFisico3);
        // Buscar cliente físico por id

        try {
            System.out.println("********************** \nBuscando Cliente Fisico de id 1");
            ClienteFisico clienteFisicoBuscado1 = clienteFisicoServico.buscarPorId(1);
            System.out.println("ClienteFisico encontrado! \n id: " + clienteFisicoBuscado1.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            System.out.println("********************** \nBuscando Cliente Fisico de id 2");
            Carro clienteFisicoBuscado2 = clienteFisicoServico.buscarPorId(2);
            System.out.println("Carro encontrado! \n id: " + clienteFisicoBuscado2.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // CLIENTE JURÍDICO
        ClienteJuridicoRepositorioMemoria clienteJuridicoRepositorioMemoria = new ClienteJuridicoRepositorioMemoria();
        ClienteJuridicoServico clienteJuridicoServico = new ClienteJuridicoServico(clienteJuridicoRepositorioMemoria);

        ClienteJuridico clienteJuridico1 = new ClienteJuridico(1, "Springer Carrier Ltda", "Rua Getulio Vargas, 675, São Caetano, São Paulo", , "12.232.343/3434-34");
        ClienteJuridico clienteJuridico2 = new ClienteJuridico(2,"Dell Ltda", "Rua Fernando Guimaraes, 484, Marilia, SP", , "12.232.343/3434-35");


        System.out.println("********************** \nCadastrando Cliente Juridico 1...");
        ClienteJuridicoServico.cadastrar(clienteJuridico1);

        System.out.println("********************** \nCadastrando carro 2...");
        ClienteJuridicoServico.cadastrar(clienteJuridico2);

        System.out.println("********************** \nCadastrando carro 2...");
        ClienteJuridicoServico.cadastrar(clienteJuridico3);

        // Buscar cliente jurídico por id
        try {
            System.out.println("********************** \nBuscando Cliente Juridico de id 1");
            ClienteJuridico clienteJuridicoBuscado1 = clienteJuridicoServico.buscarPorId(1);
            System.out.println("ClienteJuridico encontrado! \n id: " + clienteJuridicoBuscado1.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            System.out.println("********************** \nBuscando Cliente Juridico de id 2");
            Carro clienteJuridicoBuscado2 = clienteJuridicoServico.buscarPorId(2);
            System.out.println("Carro encontrado! \n id: " + clienteJuridicoBuscado2.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
