/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.kanbanizejava;

/**
 *
 * @author FGT
 */
public class AppKanbanize {
    
    String apiKey;
    String urlApiBase = "http://kanbanize.com/index.php/api/kanbanize/";

    /**
     *
     * @return
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     *
     * @param apiKey
     */
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     *
     * @return
     */
    public String getUrlApiBase() {
        return urlApiBase;
    }

    /**
     *
     * @param urlApiBase
     */
    public void setUrlApiBase(String urlApiBase) {
        this.urlApiBase = urlApiBase;
    }   
}
