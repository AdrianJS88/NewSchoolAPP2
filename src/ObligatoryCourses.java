public class ObligatoryCourses {
     private String nameCourse;
    private String summaryOfCourse;
    private String obiectiveCurse;
    private String booksRead;
    private String sugestionForLecture;
    private String mounthHomework;



    public ObligatoryCourses() {

    }

    @Override
    public String toString() {
        return "OBLIGATORY COURSES{" +
                " NAME OF COURSE'" + nameCourse + '\'' +
                ", SUMMARY OF COURSE'" + summaryOfCourse + '\'' +
                ", OBECTIVE COURSE :" + obiectiveCurse + '\'' +
                ",BOOKS TO READ'" + booksRead + '\'' +
                ", SUGESTION FOR LECTURE'" + sugestionForLecture + '\'' +
                ", MOUNTH HOMEWORK'" + mounthHomework + '\'' +
                '}';
    }
    public String getNameCourse() {
        {
            String nameCourse = "Matematica";
            System.out.println(nameCourse);
        }
        return nameCourse;
    }


    public String getSummaryOfCourse() {
        System.out.println("Matematics ");
        return summaryOfCourse;
    }



    public String getBooksRead() {
        System.out.println("Algembra , Geometrical ,Functions ");
        return booksRead;
    }



    public String getMounthHomework() {
        System.out.println("Basic level practice");
        return mounthHomework;
    }




}


