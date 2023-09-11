package modelo;

import java.io.Serializable;

public interface Entidade<T> extends Serializable {

    T getId();

}
