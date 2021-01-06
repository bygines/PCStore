package resources;

import java.awt.Point;
import java.awt.Rectangle;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Map;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@Named(value = "newJSFManagedBean")
@SessionScoped
public class selection implements Serializable {

    public selection() {
        
    }
    
    private Point click;
    final private Rectangle cpu = new Rectangle(640, 426);
    /*final private Rectangle ram = new Rectangle();
    final private Rectangle disk = new Rectangle();*/
    
    public void oyente(ActionEvent e) {
        FacesContext context = FacesContext.getCurrentInstance();
        String clientId = e.getComponent().getClientId(context);
        Map requestParams = context.getExternalContext().getRequestParameterMap();
        int x = new Integer((String) requestParams.get(clientId + ".x"));
        int y = new Integer((String) requestParams.get(clientId + ".y"));
        System.out.println(e.toString());
        click = new Point(x, y);
    }
    
    public String accion() {
        String resultado;
        if(cpu.contains(click)){
            resultado = "cpu";
        } else {
            resultado = "error";
        } 
        
        return resultado;
    }
}
