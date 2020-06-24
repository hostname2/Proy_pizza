/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author sebas
 */
public class ListaComplementos {

    public ListaComplementos(List<Complemento> complementos) {
        this.complementos = complementos;
    }

    public ListaComplementos() {
        complementos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return toJSON().toString(4);
    }

    public JSONObject toJSON() {
        JSONArray a = new JSONArray();
        complementos.forEach((p) -> {
            a.put(p.toJSON());
        });

        JSONObject r = new JSONObject();
        r.put("lista-complementos", a);
        return r;
    }

    public List<Complemento> getComplementos() {
        return complementos;
    }

    private final List<Complemento> complementos;
}
