package login;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "log")
@RequestScoped
public class log {
    private String user,pwd,language,card,caducity,cpu,cpumodel;
    private int amount;
    
    public log() {
    }
    
    public String getUser() {
        return user;
    }

    public int getAmount() {
        return amount;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getCpumodel() {
        return cpumodel;
    }

    public void setCpumodel(String cpumodel) {
        this.cpumodel = cpumodel;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getCaducity() {
        return caducity;
    }

    public void setCaducity(String caducity) {
        this.caducity = caducity;
    }
    
}
