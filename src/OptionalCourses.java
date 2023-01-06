public class OptionalCourses {
    private  String nameOfOptCourse ;
      private String yearStudy;
      private String nameOfProfesor;

    public String getNameOfOptCourse() {
        return nameOfOptCourse;
    }

    public void setNameOfOptCourse(String nameOfOptCourse) {
        this.nameOfOptCourse = nameOfOptCourse;
    }

    public String getYearStudy() {
        return yearStudy;
    }

    public void setYearStudy(String yearStudy) {
        this.yearStudy = yearStudy;
    }

    public String getNameOfProfesor() {
        return nameOfProfesor;
    }

    public void setNameOfProfesor(String nameOfProfesor) {
        this.nameOfProfesor = nameOfProfesor;
    }

    public OptionalCourses(String nameOfOptCourse, String yearStudy, String nameOfProfesor) {
        this.nameOfOptCourse = nameOfOptCourse;
        this.yearStudy = yearStudy;
        this.nameOfProfesor = nameOfProfesor;
    }

    @Override
    public String toString() {
        return  " Optional Courses: " + "\n" +"*********************"+"\n"+
        " Name of Course:" +nameOfOptCourse  +"\n" +
                " Year of Study:" +yearStudy +"\n" +
                " Name Of Profesor:" +nameOfProfesor  ;
    }
}



