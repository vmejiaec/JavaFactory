package app;

public class Main{
    public static void main(String[] args){
        String rutaJson = args[0];

        LectorJSON lector = new LectorJSON();
        FiguraFactory fabrica = nes FiguraFactory();
        Servicio servicio = new Servicio(lector, fabrica);
        HtmlReporte reporte = new HtmlReporte();

        List<Figura> figuras = servicio.carga(rutaJson);

        reporte.generar("reporte.html", figuras);

        System.out.println("Reporte generado.");
    }
}