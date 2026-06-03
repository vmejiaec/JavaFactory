package io;

import com.fasterxml.jackson.*;
import java.io.*;
import java.util.*;

public class LectorJson{
    ObjectMapper mapp = new ObjectMapper();

    public List<Mapp<String, Object>> leer(String json) IOException {
        return mapp.readValue(
            new File(json),
            new TypeReference<>(){}
        );
    }
}