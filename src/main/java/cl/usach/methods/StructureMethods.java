/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.methods;

import cl.usach.elements.StructureElement;
import cl.usach.kanbanizejava.AppKanbanize;
import cl.usach.kanbanizejava.HTTP;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author FGT
 */
public class StructureMethods {
    
    String url;
    AppKanbanize appKanbanize;

    public StructureMethods(AppKanbanize appKanbanize) {
        this.appKanbanize = appKanbanize;
    }
    
    public StructureElement getFullBoardStructure(String idBoard){
        url = appKanbanize.getUrlApiBase() + "get_full_board_structure/boardid/" + idBoard + "/format/json";
        System.out.println(url);
        HTTP http = new HTTP(url, appKanbanize.getApiKey());
        JSONArray jsona;
        StructureElement structureElement = null;
        try{
            JSONObject jsono = new JSONObject(http.getResult());
            structureElement = new StructureElement(jsono);
        }catch(JSONException e){
            System.out.println("Error: No existen Projectos");
        }
        return structureElement;
    }
}
