
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import junit.framework.TestCase;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class TestTimesToUTC extends TestCase {
    
    public void testinTimesToUTC() {
      Calendar mytimeL = Calendar.getInstance();
       
        DateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        TimeZone obj = TimeZone.getTimeZone("UTC");
        
        System.out.println("Local:: " + formatter.format(mytimeL.getTime()));
        
        formatter.setTimeZone(obj);
        
        System.out.println("UTC:: " + formatter.format(mytimeL.getTime()));
       
         
         assertEquals(formatter.getTimeZone().getID(), "UTC");
        
   }
}
