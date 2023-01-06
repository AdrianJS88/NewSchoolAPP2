public class ObligatoryCourses {
     private String nameCourse;
    private String summaryOfCourse;
    private String obiectiveCurse;
    private String booksRead;
    private String sugestionForLecture;
    private String monthHomework;


    public ObligatoryCourses(String nameCourse, String summaryOfCourse, String obiectiveCurse, String booksRead, String sugestionForLecture, String monthHomework) {
        this.nameCourse = nameCourse;
        this.summaryOfCourse = summaryOfCourse;
        this.obiectiveCurse = obiectiveCurse;
        this.booksRead = booksRead;
        this.sugestionForLecture = sugestionForLecture;
        this.monthHomework = monthHomework;
    }

    @Override
    public String toString() {
        return " OBLIGATORY COURSES:"+"*" + "\n"+"*********************" + "\n"+
                " NAME OF COURSE:"+nameCourse +
                " * SUMMARY OF COURSE:"+summaryOfCourse + "\n" +
                "  * OBECTIVE COURSE:"+obiectiveCurse  +
                " * BOOKS TO READ:"+booksRead  +
                " * SUGESTION FOR LECTURE:"+sugestionForLecture +
                " * MONTH HOMEWORK: "+ monthHomework;
    }
    public String getNameCourse() {
        {

            System.out.println(nameCourse);
        }
        return nameCourse;
    }


    public String getSummaryOfCourse() {

        return summaryOfCourse;
    }



    public String getBooksRead() {

        return booksRead;
    }



    public String getMonthHomework() {

        return monthHomework;
    }




}


