/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.methods;

import cl.usach.elements.ActivityElement;
import cl.usach.kanbanizejava.AppKanbanize;
import cl.usach.kanbanizejava.HTTP;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author FGT
 */
public class ActivityMethods {
    
    String url;
    AppKanbanize appKanbanize;
    int pageDefault = 30;

    /**
     *
     * @param appKanbanize
     */
    public ActivityMethods(AppKanbanize appKanbanize) {
        this.appKanbanize = appKanbanize;
    }
    
    /**
     * Obtiene todas las actividades del tablero
     * @param idBoard Identificador del tablero
     * @param fromDate Fecha desde (formato: yyyy-mm-dd)
     * @param toDate Fecha hasta (formato: yyyy-mm-dd)
     * @return Lista de elementos Activity
     * @throws ParseException
     * @see http://kanbanize.com/ctrl_integration#get_board_activities
     */
    public List<ActivityElement> getBoardActivities(String idBoard, String fromDate, String toDate) throws ParseException{        
        List<ActivityElement> activityElements = new ArrayList<ActivityElement>();
        int total = getTotalActivities(idBoard,fromDate,toDate);        
        if(total > 0){
            int pages = getTotalPages(total);            
            for (int i = 1; i <= pages; i++) {
                url = appKanbanize.getUrlApiBase() + "get_board_activities/boardid/" + idBoard + "/fromdate/" + fromDate + "/todate/"+ toDate + "/page/" + i + "/format/json";
                HTTP http = new HTTP(url, appKanbanize.getApiKey());                
                try{
                    JSONObject jsono = new JSONObject(http.getResult());                    
                    JSONArray jsona = new JSONArray(jsono.getJSONArray("activities").toString());
                    for (int j = 0; j < jsona.length(); j++) {
                        ActivityElement activityElement = new ActivityElement(jsona.getJSONObject(j));
                        activityElements.add(activityElement);
                    }
                }catch(JSONException e){
                    System.out.println("Error: No existen actividades");
                } 
            }
        }
        return activityElements;
    }
    
    /**
     * Obtiene el total de actividades del tablero
     * @param idBoard Identificador del tablero
     * @param fromDate Fecha desde (formato: yyyy-mm-dd)
     * @param toDate Fecha hasta (formato: yyyy-mm-dd)
     * @return cantidad total de actividades
     */
    public int getTotalActivities(String idBoard, String fromDate, String toDate){
        url = appKanbanize.getUrlApiBase() + "get_board_activities/boardid/" + idBoard + "/fromdate/" + fromDate + "/todate/"+ toDate + "/resultsperpage/1/format/json";
        HTTP http = new HTTP(url, appKanbanize.getApiKey());
        int total = 0;
        try{
            JSONObject jsono = new JSONObject(http.getResult());
            total = jsono.getInt("allactivities");
        }catch(JSONException e){
            System.out.println("Error: No existen actividades");
        }        
        return total;
    }
    
    /**
     * Obtiene la cantidad de paginas a partir del total de actividades
     * @param totalActivities Cantidad total de actividades
     * @return Total de paginas
     */
    public int getTotalPages(int totalActivities){
        int resto = totalActivities%pageDefault; 
        if (resto == 0) return totalActivities/pageDefault;
        else return (totalActivities/pageDefault)+1;
    }
}
