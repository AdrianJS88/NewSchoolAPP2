public class OptionalCourses {

      private String yearStudy;
      private String nameOfProfesor;

    @Override
    public String toString() {
        return "Optional course :" +
                ",Year of Study:" + yearStudy + '\'' +
                ", Name of the Profesor : " + nameOfProfesor + '\'' + '}';
    }

    public String getYearStudy() {
        return yearStudy;
    }

    public void setYearStudy(String yearStudy) {
        this.yearStudy = yearStudy;
    }

    public String getCursTinutDeNumeProfesor() {
        return nameOfProfesor;
    }

    public void setCursTinutDeNumeProfesor(String nameOfProfesor) {
        this.nameOfProfesor = nameOfProfesor;
    }

    public OptionalCourses(String yearStudy, String nameOfProfesor) {

        this.yearStudy = yearStudy;
        this.nameOfProfesor = nameOfProfesor;
    }
}


