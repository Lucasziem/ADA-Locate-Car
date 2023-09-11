package modelo;

public class Carro implements Entidade<Integer> {

    private Integer id;
    private String modelo;
    private String marca;
    private String cor;
    private String placa;
    private Tamanho tamanho;

    public Carro(Integer id, String modelo, String marca, String cor, String placa, Tamanho tamanho) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.placa = placa;
        this.tamanho = tamanho;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {this.id = id; }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

}
