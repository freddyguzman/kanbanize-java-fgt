/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.kanbanizejava;

import cl.usach.elements.ProjectElement;
import java.util.List;

/**
 *
 * @author FGT
 */
public interface Kanbanize {
    
    public void setConfig(String apiKey);
    
    public List<ProjectElement> getProjectsAndBoards();
}
