package Student;

public class FulltimeStudent implements Student{
    private Integer id;
    private String name;
    private Double gpa;
    public FulltimeStudent(){
        id = null;
        name = "";
        gpa = 0.0;

    }

    public FulltimeStudent(Integer id, String name){
        // TODO 
        this.id = id;
        this.name = name;
    }

    public FulltimeStudent(Integer id, String name, Double gpa){
        //TODO
        this.id = id;
        this.name = name;
        this.gpa = gpa;
      }

    @Override
    public void setID(Integer id) {
        // TODO 
        this.id = id;
    }

    @Override
    public Integer getID() {
        return id;
    }

    @Override
    public void setGPA(Double gpa) {
        this.gpa = gpa;
        // TODO
    }

    @Override
    public Double getGPA() {
        return gpa;
    }

    @Override
    public void setName(String name) {
        // TODO
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
    
}
