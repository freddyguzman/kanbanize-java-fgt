package cl.usach.kanbanizejava;

import java.text.ParseException;
import org.json.JSONException;

/**
 * Hello world!
 *
 */
public class MainClass 
{
    public static void main( String[] args ) throws JSONException, ParseException
    {
        /*String urlApiBase = "http://kanbanize.com/index.php/api/kanbanize/";
        
        HTTP http = new HTTP();
        http.setUrl(urlApiBase + "get_projects_and_boards/format/json");
        String result = http.getResult();
        System.out.println(result); */
        
        Kanbanize kanbanize = new KanbanizeMake();
        String apiKey = "AwtDWx0pEckWRtmoDtDUB1arJiRr8UVJw70yznzl";
        kanbanize.setConfig(apiKey);
        
        System.out.println(kanbanize.getProjectsAndBoards()); 
        
        
    }
}
