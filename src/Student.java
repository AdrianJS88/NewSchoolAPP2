public class Student extends Person  {
    int studyYear ;
    boolean Tax  ;
    private static final int MAXANIMALS=150;
    private static Student[] students = new Student[MAXANIMALS];


    @Override
    public String toString() {
        return " Student Profile => " +
                " ,Name: " +name +'\''+
                ", Id number:" + id +
                ", Study Year :" + studyYear + '\'' +
                ",  Tax free :" + Tax + '\'' +
                '}';
    }

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
    public static void addContacts(Student c) {

        if (existContacts(c)) {
            System.out.println("CONTACT EXISTS , TRY ANOTHER ONE");
        } else if (agendaFull()) {
            System.out.println("FULL AGENDA ,PLEASE DELETE EXISTING ONES");
        } else {

            boolean find = false;
            for (int i = 0; i < students.length && !find; i++) {
                if (students[i] == null) {
                    students[i] = c;
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

    public static boolean existContacts(Student c) {
        boolean find = false;
        for (int i = 0; i < students.length && !find; i++) {
            if (students[i] != null && c.equals(students[i])) {
                return true;
            }
        }
        return false;
    }

    public static void showAllContacts() {

        if (freeContactSpace() == students.length) {
            System.out.println("NO CONTACTS TO SHOW");
        } else {
            for (int i = 0; i < students.length; i++) {
                if (students[i] != null) {
                    System.out.println(students[i]);
                }
            }
        }
    }



    public static void searchByName(String name) {
        boolean find = false;
        for (int i = 0; i < students.length && !find; i++) {
            if (students[i] != null && students[i].getName().trim().equalsIgnoreCase(name.trim())) {
                System.out.println("Contact is created: " + students[i].getName()  +  ", Student id: " + students[i].getId() + ", Study year: "+  students[i].studyYear + ", Paytax: " + students[i].isTax());
                find = true;
            }

        }
        if (!find) {
            System.out.println("CONTACT NOT FOUND");
        }
    }

    public static boolean agendaFull() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                return false;
            }
        }
        return true;
    }

    public static void deleteContact(Student c) {
        boolean find = false;
        for (int i = 0; i < students.length && !find; i++) {
            if (students[i] != null && students[i].equals(c)) {
                students[i] = null;
                find = true;
            }
        }
        if (find) {
            System.out.println("YOU HAVE DELETE A CONTACT");
        }else {
            System.out.println("ERROR , CONTACT IT'S NOT DELETED");
        }

    }

    public static int freeContactSpace() {
        int freeSpaceCounter = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                freeSpaceCounter++;
            }
        }
        return freeSpaceCounter;

    }
}
