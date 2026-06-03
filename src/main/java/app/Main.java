package app;

import io.*;


public class Main{
    public static void main(String[] args){
        String rutaJson = args[0];
        
        
        Servicio servicio = new Servicio();
        


        List<Figura> figuras = servicio.cargar(rutaJson);

        ReporteHtml reporte = new HtmlReporte();
        reporte.generar("reporte.html", figuras);

        System.out.println("Reporte generado.");
    }
}