package com.devBootCamp.exercicio4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Voo {
    private Integer nroVoo;
    private LocalDateTime dataHoraVoo;
    private Integer nroMaximoAssentos;
    private List<Integer> assentosLivres = new ArrayList<>();

    public Voo(Integer nroVoo, LocalDateTime dataHoraVoo, Integer nroMaximoAssentos) {
        this.nroVoo = nroVoo;
        this.dataHoraVoo = dataHoraVoo;
        this.nroMaximoAssentos = nroMaximoAssentos;
    }

    public Integer getNroVoo() {
        return nroVoo;
    }

    public void setNroVoo(Integer nroVoo) {
        this.nroVoo = nroVoo;
    }

    public LocalDateTime getDataHoraVoo() {
        return dataHoraVoo;
    }

    public void setDataHoraVoo(LocalDateTime dataHoraVoo) {
        this.dataHoraVoo = dataHoraVoo;
    }

    public Integer getNroMaximoAssentos() {
        return nroMaximoAssentos;
    }

    public void setNroMaximoAssentos(Integer nroMaximoAssentos) {
        this.nroMaximoAssentos = nroMaximoAssentos;
    }

    public List<Integer> assentosLivres(){

        for (int i = 1; i <= nroMaximoAssentos; i++) {
            assentosLivres.add(i);
        }

        return assentosLivres;
    }

    public void primeiroLivre(Integer nroAssento){
        for (int i = nroAssento; i <= nroMaximoAssentos; i++) {
             verifica(i);
             return;
        }
    }

    public Boolean verifica(Integer nroAssento){
        if(assentosLivres.contains(nroAssento)) {
            System.out.println(nroAssento);
            return true;
        }

        System.out.println("Nenhum assento livre.");
        return false;
    }

    public void proximoLivre(Integer nroAssento) {
        primeiroLivre(nroAssento);
    }

    public void ocupaAssento(Integer nroAssento) {
        if(verifica(nroAssento)) {
            assentosLivres.remove(nroAssento);
        } else {
            System.out.println("Assento " + nroAssento + " ocupado.");
        }
    }

    public void vagas(){
        Integer vagas = 0;
        for (int i = 1; i <= nroMaximoAssentos; i++) {
             if(verifica(i)) {
                 vagas += 1;
             }
            System.out.println("Vagas dispiníveis: " + vagas);
        }
    }


}
