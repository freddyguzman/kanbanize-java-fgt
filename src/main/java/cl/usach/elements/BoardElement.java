/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.elements;

import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author FGT
 */
public class BoardElement {
    
    String id;
    String name;
    
    /**
     *
     * @param jsonO
     * @throws JSONException
     */
    public BoardElement(JSONObject jsonO) throws JSONException{     
        this.id = jsonO.get("id").toString();
        if(!jsonO.isNull("name")) this.name = jsonO.get("name").toString();
    }

    /**
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String string;
        string = "id : " + this.id + "\n";
        string += "name : " + this.name + "\n";
        return string;
    }    
}
