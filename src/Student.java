public class Student extends Person  {
    int studyYear ;
    boolean Tax  ;

    String [] Studentii = new  String[250];
    String [] Profesorii = new String[200];




    public int getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(int studyYear) {
        this.studyYear = studyYear;
    }

    public boolean isTax() {
        return Tax;
    }

    public void setTax(boolean tax) {
        Tax = tax;
    }

    public Student(String name, String id, int studyYear, boolean tax) {
        super(name, id);
        this.studyYear = studyYear;
        Tax = tax;
    }
    public boolean existContacts(String c) {
        boolean find = false;
        for (int i = 0; i < Studentii.length && !find; i++) {
            if (Studentii[i] != null && c.equals(Studentii[i])) {
                return true;
            }
        }
        return false;
    }
    public boolean agendaFull() {
        for (int i = 0; i < Studentii.length; i++) {
            if (Studentii[i] == null) {
                return false;
            }
        }
        return true;
    }public void addContacts(String c) {

        if (existContacts(c)) {
            System.out.println("CONTACT EXISTS , TRY ANOTHER ONE");
        } else if (agendaFull()) {
            System.out.println("FULL AGENDA ,PLEASE DELETE EXISTING ONES");
        } else {

            boolean find = false;
            for (int i = 0; i < Studentii.length && !find; i++) {
                if (Studentii[i] == null) {
                    Studentii[i] = c;
                    find = true;
                }
            }
            if (find) {
                System.out.println("YOU ADD A CONTACT");
            } else {
                System.out.println("ERROR YOU HAVE NOT CREATE A CONTACT");

            }

        }
    }
    public int freeContactSpace() {
        int freeSpaceCounter = 0;
        for (int i = 0; i < Studentii.length; i++) {
            if (Studentii[i] == null) {
                freeSpaceCounter++;
            }
        }
        return freeSpaceCounter;
    }
    public void deleteContact(Student c) {
        boolean find = false;
        for (int i = 0; i < Studentii.length && !find; i++) {
            if (Studentii[i] != null && Studentii[i].equals(c)) {
                Studentii[i] = null;
                find = true;
            }
        }
        if (find) {
            System.out.println("YOU HAVE DELETE A CONTACT");
        }else {
            System.out.println("ERROR , CONTACT IT'S NOT DELETED");
        }

    }
}
