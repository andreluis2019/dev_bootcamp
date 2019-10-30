package exercicio2;

public class Carro {
    private String modelo;
    private String cor;
    private Integer ano;
    //private String marca;
    private Marca marca;
    private String chassi;
    private Proprietario proprietario;
    private Double velocidadeMaxima;
    private Double velocidadeAtual;
    private Integer numeroMarchas;
    private Integer marchaRe = 0;
    private Integer marchaAtual = 1;
    private Double quantidadeCombustivel;

    public Carro(Proprietario proprietario, Double quantidadeCombustivel) {
        this.proprietario = proprietario;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public Integer getMarchaAtual() {
        return marchaAtual;
    }

    public void setMarchaAtual(Integer marchaAtual) {
        this.marchaAtual = marchaAtual;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(Double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public Integer getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(Integer numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public Double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void setQuantidadeCombustivel(Double quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void acelerarCarro(){
        if(velocidadeAtual <= velocidadeMaxima){
            velocidadeAtual += 1;
            System.out.println(velocidadeAtual + "Km/h");
        } else {
            System.out.println("Atingiu a velocidade máxima.");
        }
    }

    public void freiarCarro(){
        velocidadeAtual = 0D;
    }

    public void trocarMarcha() {
        if(marchaAtual <= numeroMarchas){
            System.out.println("Marcha: " + marchaAtual);
            marchaAtual += 1;
        } else {
            System.out.println("Atingiu o número de marchas máximo.");
        }
    }

    public void reduzirMarcha(){
        if(marchaAtual > 1){
            marchaAtual -= 1;
            System.out.println("Marcha: " + marchaAtual);
        }
    }

    public Double calculaAutonomia(Double consumoMedio){
        return consumoMedio * quantidadeCombustivel;
    }



}
