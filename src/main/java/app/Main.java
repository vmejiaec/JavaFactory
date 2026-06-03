package app;

import io.*;
import domain.*;
import core.*;

import java.util.*;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        String rutaJson = args[0];        
        
        Servicio servicio = new Servicio();
        List<Figura> figuras = servicio.cargar(rutaJson);
        ReporteHtml reporte = new ReporteHtml();
        reporte.generar("reporte.html", figuras);

        System.out.println("Reporte generado.");
    }
}