package model;

import java.time.LocalDate;

public class Contrato {
    private PlanoInternet plano;
    private LocalDate dataInicio;

    public Contrato(PlanoInternet plano) {
        this.plano = plano;
        this.dataInicio = LocalDate.now();
    }

    public PlanoInternet getPlano() {
        return plano;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }


}
