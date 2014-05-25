/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.methods;

import cl.usach.kanbanizejava.AppKanbanize;
import cl.usach.kanbanizejava.HTTP;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author FGT
 */
public class Conf {
    
    String url;
    AppKanbanize appKanbanize;
    
    public Conf(AppKanbanize appKanbanize){
        this.appKanbanize = appKanbanize;
    }
    
    public Boolean checkConf(){
        url = appKanbanize.getUrlApiBase() + "get_projects_and_boards/format/json";
        HTTP http = new HTTP(url, appKanbanize.getApiKey());
        try{
            JSONObject jsono = new JSONObject(http.getResult());
            if(!jsono.isNull("error")){
                return false;
            }else{
               return true; 
            }            
        }catch(JSONException e){
            System.out.println("Error: No existen Projectos");
            return false;
        }
    }
}
