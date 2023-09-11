package servico;

import modelo.ClienteJuridico;
import persistencia.ClienteJuridicoRepositorio;

public class ClienteJuridicoServico {

    private final ClienteJuridicoRepositorio clienteJuridicoRepositorioRepositorio;

    public ClienteJuridicoServico(ClienteJuridicoRepositorio clienteFisicoRepositorioRepositorio) {
        this.clienteJuridicoRepositorioRepositorio = clienteFisicoRepositorioRepositorio;
    }

    public ClienteJuridico cadastrar(ClienteJuridico cliente){
        try {
            if (!existeCliente(cliente.getId())) {
                System.out.println("Cliente Jurídico cadastrado!");
                return clienteJuridicoRepositorioRepositorio.salvar(cliente);
            } else {
                System.out.println("Cliente Jurídico já existe");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public ClienteJuridico buscarPorId(Integer id) throws Exception {
        if (id == null) {
            throw new Exception("Cliente Jurídico não encontrado.");
        } else {
            return clienteJuridicoRepositorioRepositorio.buscarPorId(id);
        }
    }

    private boolean existeCliente(Integer id) throws Exception {
        ClienteJuridico clienteEncontrado = buscarPorId(id);
        return clienteEncontrado != null;
    }

}
