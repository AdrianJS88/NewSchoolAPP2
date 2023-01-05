public class Teacher extends Person{
       private  String discipline ;

    public String getDiscipline() {
        return discipline;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "discipline='" + discipline + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public Teacher(String name, String id, String discipline) {
        super(name, id);
        this.discipline = discipline;
    }
}

