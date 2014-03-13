/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.kanbanizejava;

import cl.usach.elements.*;
import cl.usach.methods.*;
import java.util.List;

/**
 *
 * @author FGT
 */
public class KanbanizeMake implements Kanbanize{
    
    AppKanbanize appKanbanize = new AppKanbanize();
    
    public void setConfig(String apiKey){
        this.appKanbanize.setApiKey(apiKey);
    }
    
    /* ---------------- Metodos Project --------------- */
    
    public List<ProjectElement> getProjectsAndBoards(){
        ProjectMethods projectMethods = new ProjectMethods(appKanbanize);
        List<ProjectElement> projectElements = projectMethods.getProjectsAndBoards();
        return projectElements;
    }
    
    /* ---------------- Metodos Structure --------------- */
    
    public StructureElement getFullBoardStructure(String idBoard){
        StructureMethods structureMethods = new StructureMethods(appKanbanize);
        StructureElement structureElements = structureMethods.getFullBoardStructure(idBoard);
        return structureElements;
    }
    
}
