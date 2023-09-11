package persistencia.memoria;

import modelo.Entidade;
import persistencia.Repositorio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class RepositorioMemoriaAbstrato<E extends Entidade<ID>, ID> implements Repositorio<E, ID> {

    private final Map<ID, E> dados = new HashMap<>();

    @Override
    public E salvar(E entidade) {
        E entidadeJaCadastrada = buscarPorId(entidade.getId());
        if (entidadeJaCadastrada != null) {
            remover(entidadeJaCadastrada);
        }
        dados.put(entidade.getId(), entidade);
        return entidade;
    }

    @Override
    public void remover(E entidade) {
        removerPorId(entidade.getId());
    }

    @Override
    public boolean removerPorId(ID identificador) {
        E entidadeRemovida = dados.remove(identificador);
        return entidadeRemovida != null;
    }

    @Override
    public List<E> listarTodos() {
        return new ArrayList<>(dados.values());
    }

    @Override
    public E buscarPorId(ID identificador) {
        return dados.get(identificador);
    }
}
