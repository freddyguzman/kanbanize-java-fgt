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
    
    String KEY;
    String urlApiBase = "http://kanbanize.com/index.php/api/kanbanize/";

    public String getKEY() {
        return KEY;
    }

    public void setKEY(String KEY) {
        this.KEY = KEY;
    }

    public String getUrlApiBase() {
        return urlApiBase;
    }

    public void setUrlApiBase(String urlApiBase) {
        this.urlApiBase = urlApiBase;
    }   
}
