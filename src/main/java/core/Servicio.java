package core;

import domain.*;
import io.*;
import factory.*;
import core.*;

import java.util.*;
import java.io.IOException;


public class Servicio{

    public List<Figura> cargar(String ruta) throws IOException{
        
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