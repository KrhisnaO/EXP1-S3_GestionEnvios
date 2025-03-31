package com.example.gestionenvios.service;

import com.example.gestionenvios.model.Envio;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

//SERVICIO QUE GESTIONA LOS ENVIOS INTERNACIONALES
//PERMITE OBTENER LA LISTA DE ENVIOS Y BUSCAR ENVIOS POR SU NUMERO DE SEGUIMIENTO

@Service
public class EnvioService {

    ///LISTA EN MEMORIA QUE SIMULA LA BBDD DE ENVIOS
    private final List<Envio> envios = new ArrayList<>();

    //CONSTRUCTOR QUE INICIALIZA ALGUNOS ENVIOS DE EJEMPLO

    public EnvioService() {
        envios.add(new Envio(1, "Carlos Pérez", "DHL", "Chile", "España", 
            "Centro de Distribución - Santiago", "En tránsito", 
            "2025-03-25", "2025-04-02"));
    
        envios.add(new Envio(2, "Ana López", "FedEx", "México", "Argentina", 
            "Aeropuerto Internacional - Ciudad de México", "En aduana", 
            "2025-03-27", "2025-04-05"));
    
        envios.add(new Envio(3, "Luis Martínez", "UPS", "Estados Unidos", "Alemania", 
            "Aeropuerto de Frankfurt", "En despacho aduanero", 
            "2025-03-20", "2025-03-30"));
    
        envios.add(new Envio(4, "María González", "Correos de España", "España", "Francia", 
            "Centro Logístico de Madrid", "En tránsito", 
            "2025-03-22", "2025-03-28"));
    
        envios.add(new Envio(5, "Pedro Ramírez", "Amazon Logistics", "Canadá", "Brasil", 
            "Centro de Distribución - Sao Paulo", "Entregado", 
            "2025-03-18", "2025-03-25"));
    
        envios.add(new Envio(6, "Sofía Herrera", "TNT Express", "Australia", "Japón", 
            "Aeropuerto Internacional de Tokio", "En aduana", 
            "2025-03-21", "2025-03-29"));
    
        envios.add(new Envio(7, "Jorge Díaz", "DHL", "Reino Unido", "Italia", 
            "Centro de Clasificación - Roma", "En tránsito", 
            "2025-03-24", "2025-04-01"));
    
        envios.add(new Envio(8, "Valentina Rojas", "FedEx", "Colombia", "Estados Unidos", 
            "Centro de Distribución - Miami", "En tránsito", 
            "2025-03-26", "2025-04-03"));
    
        envios.add(new Envio(9, "Andrés López", "Correos de Chile", "Chile", "Perú", 
            "Centro Logístico - Lima", "En despacho", 
            "2025-03-28", "2025-04-06"));
    
        envios.add(new Envio(10, "Fernando Castillo", "Blue Express", "Argentina", "Uruguay", 
            "Centro de Clasificación - Montevideo", "En tránsito", 
            "2025-03-30", "2025-04-07"));
    }
    
    //OBTIENE LA LISTA COMPLETA DE TODOS LOS ENVIOS DE LA BBDD EN MEMORIA
    public List<Envio> getEnvios(){
        return envios;
    }


    //OBTENER ENVIOS POR SU NUMERO DE SEGUIMIENTO
    //SI NO ENCUENTRA, DEVUELVE UN OBJETO INDICANDO QUE NO HA SIDO ENCONTRADO 
    public Envio getEnvioBynumeroSeguimiento(int numeroSeguimiento) {
        return envios.stream()
        .filter(envio -> envio.getNumeroSeguimiento() == numeroSeguimiento )
        .findFirst()
        .orElse(new Envio(0, "No encontrado", "Desconocida", 
        "Desconocido", "Desconocido", "Sin ubicación", 
        "Sin información", "----", "----"));
    }
}
