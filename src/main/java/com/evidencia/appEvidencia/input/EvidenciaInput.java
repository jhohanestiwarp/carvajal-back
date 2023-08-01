package com.alcaldia.appAlcaldia.input;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class EvidenciaInput {
    @Getter
    @Setter
    private String nombre;
    @Getter @Setter
    private String precio;
    @Getter @Setter
    private String imagen;
    @Getter @Setter
    private String ruta_almacenamiento;
    @Getter @Setter
    private String stock;
    @Getter @Setter
    private String estado;


}
