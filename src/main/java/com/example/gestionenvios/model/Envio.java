package com.example.gestionenvios.model;

public class Envio {
    private int numeroSeguimiento;
    private String destinatario;
    private String empresaEnvio;
    private String paisOrigen;
    private String paisDestino;
    private String ubicacionActual;
    private String estado;
    private String fechaSalida;
    private String fechaEstimadaLlegada;


    public Envio(int numeroSeguimiento, String destinatario, String empresaEnvio, 
                 String paisOrigen, String paisDestino, String ubicacionActual, 
                 String estado, String fechaSalida, String fechaEstimadaLlegada) {

        this.numeroSeguimiento = numeroSeguimiento;
        this.destinatario = destinatario;
        this.empresaEnvio = empresaEnvio;
        this.paisOrigen = paisOrigen;
        this.paisDestino = paisDestino;
        this.ubicacionActual = ubicacionActual;
        this.estado = estado;
        this.fechaSalida = fechaSalida;
        this.fechaEstimadaLlegada = fechaEstimadaLlegada;
    }


    public int getNumeroSeguimiento(){
        return numeroSeguimiento;
    }
    public String getDestinatario(){
        return destinatario;
    }
    public String getEmpresaEnvio() {
        return empresaEnvio; 
    }
    public String getPaisOrigen() { 
        return paisOrigen; 
    }
    public String getPaisDestino() { 
        return paisDestino; 
    }
    public String getUbicacionActual() { 
        return ubicacionActual; 
    }
    public String getEstado() { 
        return estado; 
    }
    public String getFechaSalida() { 
        return fechaSalida; 
    }
    public String getFechaEstimadaLlegada() { 
        return fechaEstimadaLlegada; 
    }

    
}
