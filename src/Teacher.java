public class Teacher extends Person {
    private String discipline;

    public static Teacher[] getTeacher() {
        return Teacher;
    }

    public static void setTeacher(Teacher[] teacher) {
        Teacher = teacher;
    }

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

    private static final int appMemoryAvaible2 =500;
    private static Teacher[] Teacher = new Teacher[appMemoryAvaible2];



    public static void addcontacts2(Teacher c2) {

        if (existContacts2(c2)) {
            System.out.println("CONTACT EXISTS , TRY ANOTHER ONE");
        } else if (agendaFull2()) {
            System.out.println("FULL AGENDA ,PLEASE DELETE EXISTING ONES");
        } else {

            boolean find = false;
            for (int i = 0; i < Teacher.length && !find; i++) {
                if (Teacher[i] == null) {
                    Teacher[i] = c2;
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

    public static boolean existContacts2(Teacher c2) {
        boolean find = false;
        for (int i = 0; i < Teacher.length && !find; i++) {
            if (Teacher[i] != null && c2.equals(Teacher[i])) {
                return true;
            }
        }
        return false;
    }

    public static void showAllContacts2() {

        if (freeContactSpace2() == Teacher.length) {
            System.out.println("NO TEACHER CONTACT TO SHOW!!!");
        } else {
            for (int i = 0; i < Teacher.length; i++) {
                if (Teacher[i] != null) {
                    System.out.println(Teacher[i]);
                }
            }
        }
    }


    public static void searchByName2(String name2) {
        boolean find = false;
        for (int i = 0; i < Teacher.length && !find; i++) {
            if (Teacher[i] != null && Teacher[i].getName().trim().equalsIgnoreCase(name2.trim())) {
                System.out.println("Contact is created: " + Teacher[i].getName() + ", Student id: " + Teacher[i].getId() + "Disciplina :"+ Teacher[i].getDiscipline());
                find = true;
            }

        }
        if (!find) {
            System.out.println("CONTACT NOT FOUND");
        }
    }

    public static boolean agendaFull2() {
        for (int i = 0; i < Teacher.length; i++) {
            if (Teacher[i] == null) {
                return false;
            }
        }
        return true;
    }

    public static void deleteContact2(Teacher c2) {
        boolean find = false;
        for (int i = 0; i < Teacher.length && !find; i++) {
            if (Teacher[i] != null && Teacher[i].equals(c2)) {
                Teacher[i] = null;
                find = true;
            }
        }
        if (find) {
            System.out.println("YOU HAVE DELETE A CONTACT");
        } else {
            System.out.println("ERROR , CONTACT IT'S NOT DELETED");
        }

    }

    public static int freeContactSpace2() {
        int freeSpaceCounter2 = 0;
        for (int i = 0; i < Teacher.length; i++) {
            if (Teacher[i] == null) {
                freeSpaceCounter2++;
            }
        }
        return freeSpaceCounter2;

    }

    @Override
    public String toString() {
        return "Teacher:" + "\n" +
                "Discipline:" + discipline +"\n" +
                "Name:" + name  + "\n" +
                "Id:" + id + "\n" +"*************************" ;
    }

}