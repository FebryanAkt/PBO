package Tugas;

public class Komputer {
    private String specPC;
    private String keyboard;
    private String headphone;
    private String monitor;

    public Komputer(){

    }
    public Komputer(String specPC, String keyboard, String headphone, String monitor){
        this.specPC = specPC;
        this.keyboard = keyboard;
        this.headphone = headphone;
        this.monitor = monitor;
    }

    public void setSpecPC(String specPC){
        this.specPC = specPC;
    }
    public void setKeyboard(String keyboard){
        this.keyboard = keyboard;
    }
    public void setHeadphone(String headphone){
        this.headphone = headphone;
    }
    public void setMonitor(String monitor){
        this.monitor = monitor;
    }
    public String getSpecPC(){
        return specPC;
    }
    public String getKeyboard(){
        return keyboard;
    }
    public String getHeadphone(){
        return headphone;
    }
    public String getMonitor(){
        return monitor;
    }
    public String info() {
        String info = "";
        info += "--- KOMPUTER ---\n";
        info += "SpecPC = " + this.specPC + "\n";
        info += "Keyboard = " + this.keyboard + "\n";
        info += "Headphone = " + this.headphone + "\n";
        info += "Monitor = " + this.monitor + "\n";
        return info;
    }
}
