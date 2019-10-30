package exercicio2;

import java.time.LocalDate;

public class Teste {

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua X", "123", "Bairro X");

        Proprietario proprietario = new Proprietario("João", "0123456789", "98765432");
        proprietario.setDataNascimento(LocalDate.of(1990, 05, 27));
        proprietario.setEndereco(endereco);

        Carro carro1 = new Carro(proprietario, 60D);
        Marca marca = new Marca("Ford");
        carro1.setMarca(marca);
        carro1.setAno(2005);
        carro1.setChassi("1235jhasr-099989asdf");
        carro1.setCor("Prata");
        carro1.setModelo("Ka");
        carro1.setNumeroMarchas(5);
        carro1.setVelocidadeAtual(10D);
        carro1.setVelocidadeMaxima(250D);

        System.out.println("Acelerando");
        for (Double i = carro1.getVelocidadeAtual(); i <= carro1.getVelocidadeMaxima(); i++) {
            carro1.acelerarCarro();
        }
        System.out.println();

        System.out.println("Freando");
        carro1.freiarCarro();
        System.out.println();

        System.out.println("Trocando marcha");
        for (int i = carro1.getMarchaAtual(); i <= carro1.getNumeroMarchas(); i++) {
            carro1.trocarMarcha();
        }
        System.out.println();

        System.out.println("Reduzindo marcha");
        for (int i = carro1.getMarchaAtual(); i >= 0; i--) {
            carro1.reduzirMarcha();
        }
        System.out.println();

        System.out.println("Autonomia "+ carro1.calculaAutonomia(15D));


    }
}
