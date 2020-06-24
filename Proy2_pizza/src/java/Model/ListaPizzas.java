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
public class ListaPizzas {

    public ListaPizzas() {
        this.pizzas = new ArrayList<>();
    }

    
    public ListaPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }
    
        @Override
    public String toString() {
        return toJSON().toString(4);
    }

    public JSONObject toJSON() {
        JSONArray a = new JSONArray();
        pizzas.forEach((p) -> {
            a.put(p.toJSON());
        });

        JSONObject r = new JSONObject();
        r.put("lista-pizzas", a);
        return r;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }
    
    private final List<Pizza> pizzas;
}
