package io;

import domain.*;

import java.util.*;
import java.io.IOException;
import java.nio.file.*;

public class ReporteHtml{

    public void generar(String archivo, List<Figura> figuras) throws IOException{
        StringBuilder html = new StringBuilder();
        html.append("<html><head><meta charset=\"UTF-8\">")
            .append("<title>Reporte</title></head>")
            .append("<body>")
            .append("<h1>Reporte de Figuras</h1>")
            .append("<table>")
            .append("<tr><th>Tipo</th><th>Area</th><th>Perimetro</th></tr>");
        
        for (Figura figura: figuras){
            if (figura == null ) continue;
            
            html.append("<tr>")
                .append("<td>").append(figura.tipo()).append("</td>")
                .append("<td>").append(figura.area()).append("</td>")
                .append("<td>").append(figura.perimetro()).append("</td>")
                .append("</tr>");
        }

        html.append("</table></body></html>");

        Files.writeString(Path.of(archivo), html.toString());
    }
}