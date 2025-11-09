public class InternshipEmployee extends Employee{
    private int length;

    public InternshipEmployee(String name, int length){
        this.length = length;
        this.name = name;
    }
    public int getLength(){
        return length;
    }
    
}
