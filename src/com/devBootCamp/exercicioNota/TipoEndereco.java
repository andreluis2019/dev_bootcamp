package com.devBootCamp.exercicioNota;

public enum TipoEndereco {
    COBRANCA("Cobranca"),
    RESIDENCIAL("Residencial"),
    ENTREGA("Entrega");

    private String label;

    TipoEndereco(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
