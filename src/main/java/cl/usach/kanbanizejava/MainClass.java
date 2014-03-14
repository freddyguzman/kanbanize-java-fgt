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
        http.setUrl(urlApiBase + "get_board_settings/boardid/4/format/json");
        http.setApikey("AwtDWx0pEckWRtmoDtDUB1arJiRr8UVJw70yznzl");
        String result = http.getResult();*/
        
        Kanbanize kanbanize = new KanbanizeMake();
        String apiKey = "AwtDWx0pEckWRtmoDtDUB1arJiRr8UVJw70yznzl";
        kanbanize.setConfig(apiKey);
        
        System.out.println(kanbanize.getBoardActivities("4","2014-03-10","2014-03-13")); 
        
        
    }
}
