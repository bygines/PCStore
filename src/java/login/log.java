package login;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "log")
@RequestScoped
public class log {
    private String user,pwd,language;
    
    public log() {
    }
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String country) {
        this.language = language;
    }
    
}
