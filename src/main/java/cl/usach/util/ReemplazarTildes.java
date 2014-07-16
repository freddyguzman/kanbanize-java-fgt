/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.util;

/**
 *
 * @author FGT
 */
public class ReemplazarTildes {
    
    public String formatString(String string){
        string = string.replace("Ã¡", "á");
        string = string.replace("Ã©", "é");
        string = string.replace("Ã*", "í");
        string = string.replace("Ã³", "ó");
        string = string.replace("Ãº", "ú");
        string = string.replace("Ã", "Á");
        string = string.replace("Ã‰", "É");
        string = string.replace("Ã", "Í");
        string = string.replace("Ã“", "Ó");
        string = string.replace("Ãš", "Ú");
        string = string.replace("Ã±", "ñ");
        string = string.replace("Ã‘", "Ñ");
        
        return string;
    }
}
