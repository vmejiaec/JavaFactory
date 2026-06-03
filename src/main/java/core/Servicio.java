package core;

import java.util.*;
import io.IOException;


public class Servicio{

    public List<Figura> cargar(String ruta) IOException{
        
        LectorJson lector = new LectorJson();
        FiguraFactory fabrica = new FiguraFactory();

        List<Map<String, Object>> lista = lector.leer(ruta);
        List<Figura> figuras = new ArrayList<>();

        for (Map<String, Object> item : lista){
            figuras.add(fabrica.crear(item));
        }

        return figuras;
    }

}