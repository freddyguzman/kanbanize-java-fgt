/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.methods;

import cl.usach.elements.StructureElement;
import cl.usach.kanbanizejava.AppKanbanize;
import cl.usach.kanbanizejava.HTTP;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author FGT
 */
public class StructureMethods {
    
    String url;
    AppKanbanize appKanbanize;

    /**
     *
     * @param appKanbanize
     */
    public StructureMethods(AppKanbanize appKanbanize) {
        this.appKanbanize = appKanbanize;
    }
    
    /**
     * Obtiene la estructura completa del tablero
     * @param idBoard Identificador del tablero
     * @return Elemento Structure
     * @see http://kanbanize.com/ctrl_integration#get_full_board_structure
     */
    public StructureElement getFullBoardStructure(String idBoard){
        url = appKanbanize.getUrlApiBase() + "get_full_board_structure/boardid/" + idBoard + "/format/json";
        System.out.println(url);
        HTTP http = new HTTP(url, appKanbanize.getApiKey());
        StructureElement structureElement = null;
        try{
            JSONObject jsono = new JSONObject(http.getResult());
            structureElement = new StructureElement(jsono);
        }catch(JSONException e){
            System.out.println("Error: No existe una Estructura");
        }
        return structureElement;
    }
}
