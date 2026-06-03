package io;

import dominio.Figura;

import java.util.*;
import io.IOException;
import nio.file.*;

public class ReporteHtml{

    public void generar(String archivo, List<Figura> figuras) IOException{
        StringBuilder html = new StringBuilder();
        html.append("<html><head><meta charset=\"UTF-8\">")
            .append("<title>Reporte</title></head>")
            .append("<body>")
            .append("<h1>Reporte de Figuras</h1>")
            .append("<table>")
            .append("<tr><th>Tipo</th><th>Area</th><th>Perimetro</th></tr>");
        
        for (Figura figura: figuras){
            html.append("<tr>")
                .append("<td>").append(figura.tipo()).append("</td>")
                .append("<td>").append(figura.area()).append("</td>")
                .append("<td>").append(figura.perimetro()).append("</td>")
        }

        html.append("</table></body></html>");

        Files.writeString(Path.of(archivo), html.toString());
    }
}