public class Teacher extends Person{
       private  String discipline ;

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public Teacher(String name, String id, String discipline) {
        super(name, id);
        this.discipline = discipline;
    }
}

