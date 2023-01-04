public class Student extends Person  {
    int studyYear ;
    boolean Tax  ;

    public Student(String name, String id, int studyYear, boolean tax) {
        super(name, id);
        this.studyYear = studyYear;
        Tax = tax;
    }

}
