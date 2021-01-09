package resources;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "log")
@RequestScoped
public class log {
    
    private String user,pwd,language,card,caducity,cpu,cpumodel,marca, capacidadRam,ramFormato, tecnologia,
            almacenamiento,credit, nameCard, numberCard, expiracion, cvv;

    public String getExpiracion() {
        return expiracion;
    }

    public void setExpiracion(String expiracion) {
        this.expiracion = expiracion;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCapacidadRam() {
        return capacidadRam;
    }

    public void setCapacidadRam(String capacidadRam) {
        this.capacidadRam = capacidadRam;
    }

    public String getRamFormato() {
        return ramFormato;
    }

    public void setRamFormato(String ramFormato) {
        this.ramFormato = ramFormato;
    }
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
    
    public void reset () {
        this.user = "";
        this.pwd = "";
    }
    
    private boolean mostrarItem = false;

    public boolean isMostrarItem() {
        return mostrarItem;
    }

    public void setMostrarItem(boolean mostrarItem) {
        this.mostrarItem = mostrarItem;
    }
    
    /*public void change (AjaxBehaviorEvent event) {
        if(cpu == "amd") {
            mostrarItem = true;
        }
        System.out.println(cpu);
    }*/
    
}
