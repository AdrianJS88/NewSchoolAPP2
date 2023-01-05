import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        boolean Exit = false ;
        int Options ;


        String name ;
        String id = null;
        Student c = null;
        int studyYear = 0;
        boolean tax = false;

        String name2 ;
        String id2 = null;
        Teacher c2;
        String discipline = null;


        while (!Exit) {
            System.out.println("0. ADD TEACHER CONTACT");
            System.out.println("1. ADD STUDENT CONTACT");
            System.out.println("2. SEE ALL CONTACTS");
            System.out.println("3. SEARCH CONTACTS");
            System.out.println("4. LIST SAVED CONTACTS");
            System.out.println("5. DELETE CONTACT");
            System.out.println("6. MEMORY AVAIBLE CONTACTS");
            System.out.println("7. CHECK AGENDA  ");
            System.out.println("8. Exit");
            try {
                System.out.println(" PLEASE CHOOSE A OPTION");
                Options = sc.nextInt();

                switch (Options) {
                    case 0:
                        System.out.println(" ADD TEACHER NAME");
                        name2 = sc.next();

                        System.out.println("ADD TEACHER  ID NUMBER");
                        id2 = sc.next();

                        System.out.println("ADD TEACHER DISCIPLINE ");
                        discipline = sc.next();



                        c2 = new Teacher(name2,id2,discipline);
                        Teacher.addcontacts2(c2);
                        break;

                    case 1:
                        System.out.println(" ADD STUDENT NAME");
                        name = sc.next();

                        System.out.println("ADD STUDENT  ID NUMBER");
                        id = sc.next();

                        System.out.println("ADD STUDENT STUDY YEAR ");
                        studyYear = sc.nextInt();

                        System.out.println("ADD  TRUE IF PAY TAX  ");
                        tax = sc.nextBoolean();

                        System.out.println("cursuri obligatori");

                        
                        c = new Student(name,id,studyYear,tax);
                        Student.addContacts(c);

                        break;

                    case 2:
                        Teacher.showAllContacts2();
                        Student.showAllContacts();


                        break;

                    case 3:
                        System.out.println("CONTACT NAME :");
                        name2 = sc.next();

                        Student.searchByName(name2);

                        System.out.println("CONTACT NAME :");
                        name = sc.next();

                        Student.searchByName(name);

                        break;

                    case 4:
                        System.out.println("CONTACT TEACHER NAME :");
                        name2 = sc.next();

                        c2 = new Teacher(name2,id2,discipline);

                        if (Teacher.existContacts2(c2)) {
                            System.out.println("CONTACT TEACHER EXIST ");
                        }else {
                            System.out.println("CONTACT TEACHER DOSEN'T EXIST");
                        }

                     //*************************************************************

                        System.out.println("CONTACT STUDENT NAME :");
                        name = sc.next();

                        c = new Student(name,id,studyYear,tax);

                        if (Student.existContacts(c)) {
                            System.out.println("CONTACT EXIST ");
                        }else {
                            System.out.println("CONTACT DOSEN'T EXIST");
                        }

                        break;

                    case 5:
                        System.out.println("CONTACT TEACHER NAME :");
                        name2 = sc.next();
                        c2 = new Teacher(name2,id2,discipline);
                        Teacher.deleteContact2(c2);

                        //*******************************************************


                        System.out.println("CONTACT NAME :");
                        name = sc.next();
                        c = new Student(name,id,studyYear,tax);
                        Student.deleteContact(c);

                        break;


                    case 6:

                        System.out.println("NUMBER OF MEMORY CONTACTS AVAIBLE :" + Student.freeContactSpace());
                        break;
                    case 7:
                        if (Student.agendaFull()){
                            System.out.println("FULL MEMORY OF AGENDA");
                        }else {
                            System.out.println("YOU CAN ADD MORE CONTACTS");
                        }



                        break;
                    case 8:
                        Exit = true;
                        break;
                    default:
                        System.out.println("ONLY NUMBERS BETWEEN 1 AND 8");
                }
            }catch (InputMismatchException e){
                System.out.println("YOU MUST ENTER ONLY NUMBERS");
                sc.next();
            }
        }



    }
}