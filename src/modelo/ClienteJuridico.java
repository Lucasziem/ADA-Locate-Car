package modelo;

import java.util.List;

public class ClienteJuridico extends Cliente {
    String cnpj;

    public ClienteJuridico(Integer id, String nome, String endereco, List<Carro> carrosAlugados, String cnpj) {
        super(id, nome, endereco, carrosAlugados);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "ClienteJuridico{" +
                "cnpj='" + cnpj + '\'' +
                '}';
    }
}
