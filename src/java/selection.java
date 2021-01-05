import java.awt.Point;
import java.awt.Rectangle;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "selection")
@RequestScoped
public class selection {
    private Point click;
    final private Rectangle cpu = new Rectangle();
    final private Rectangle ram = new Rectangle();
    final private Rectangle disk = new Rectangle();
    
    public selection() {
    }
    
}
