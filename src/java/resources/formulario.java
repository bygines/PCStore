package resources;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Locale;
import javax.faces.event.ValueChangeEvent;

@Named(value = "formulario")
@SessionScoped
public class formulario implements Serializable {
    private String localeCode = Locale.getDefault().toString();
    private String usuario;
    
    public formulario() {
    }
    
    public void cambioIdioma(ValueChangeEvent evento){
        localeCode = evento.getNewValue().toString();
    }    

    public String getLocaleCode() {
        return localeCode;
    }

    public void setLocaleCode(String localeCode) {
        this.localeCode = localeCode;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
}
