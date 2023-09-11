package servico;


import modelo.ClienteFisico;
import persistencia.ClienteFisicoRepositorio;

public class ClienteFisicoServico {

    private final ClienteFisicoRepositorio clienteFisicoRepositorioRepositorio;

    public ClienteFisicoServico(ClienteFisicoRepositorio clienteFisicoRepositorioRepositorio) {
        this.clienteFisicoRepositorioRepositorio = clienteFisicoRepositorioRepositorio;
    }

    public ClienteFisico cadastrar(ClienteFisico cliente){
        try {
            if (!existeCliente(cliente.getId())) {
                System.out.println("Cliente Físico cadastrado!");
                return clienteFisicoRepositorioRepositorio.salvar(cliente);
            } else {
                System.out.println("Cliente Físico já existe");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public ClienteFisico buscarPorId(Integer id) throws Exception {
        if (id == null) {
            throw new Exception("Cliente Físico não encontrado.");
        } else {
            return clienteFisicoRepositorioRepositorio.buscarPorId(id);
        }
    }

    private boolean existeCliente(Integer id) throws Exception {
        ClienteFisico clienteEncontrado = buscarPorId(id);
        return clienteEncontrado != null;
    }

}
