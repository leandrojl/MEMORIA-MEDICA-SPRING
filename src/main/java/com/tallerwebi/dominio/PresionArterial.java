package com.tallerwebi.dominio;

public class PresionArterial {

    Integer presionAlta;
    Integer presionBaja;
    Integer pulsaciones;

    public PresionArterial(Integer presionAlta, Integer presionBaja, Integer pulsaciones) {
        this.presionAlta = presionAlta;
        this.presionBaja = presionBaja;
        this.pulsaciones = pulsaciones;
    }

    public PresionArterial() {

    }

    public Integer getPresionAlta() {
        return presionAlta;
    }

    public void setPresionAlta(Integer presionAlta) {
        this.presionAlta = presionAlta;
    }

    public Integer getPresionBaja() {
        return presionBaja;
    }

    public void setPresionBaja(Integer presionBaja) {
        this.presionBaja = presionBaja;
    }

    public Integer getPulsaciones() {
        return pulsaciones;
    }

    public void setPulsaciones(Integer pulsaciones) {
        this.pulsaciones = pulsaciones;
    }
}
