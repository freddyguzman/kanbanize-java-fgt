/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.methods;

import cl.usach.elements.SettingElement;
import cl.usach.kanbanizejava.AppKanbanize;
import cl.usach.kanbanizejava.HTTP;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author FGT
 */
public class SettingMethods {
    
    String url;
    AppKanbanize appKanbanize;

    /**
     *
     * @param appKanbanize
     */
    public SettingMethods(AppKanbanize appKanbanize) {
        this.appKanbanize = appKanbanize;
    }
    
    /**
     * Obtiene la configuración del tablero
     * @param idBoard Identificador del tablero
     * @return Elemento Setting
     * @see http://kanbanize.com/ctrl_integration#get_board_settings
     */
    public SettingElement getSettingsBoard(String idBoard){
        url = appKanbanize.getUrlApiBase() + "get_board_settings/boardid/" + idBoard + "/format/json";
        HTTP http = new HTTP(url, appKanbanize.getApiKey());
        SettingElement settingElement = null;        
        try{
            JSONObject jsono = new JSONObject(http.getResult());
            settingElement = new SettingElement(jsono);
        }catch(JSONException e){
            System.out.println("Error: No existe configuración");
        }
        return settingElement;
    }
    
    
}
