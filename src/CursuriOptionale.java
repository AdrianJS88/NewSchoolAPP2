public class CursuriOptionale extends CursuriObligatori{

      private String anStudiu;
      private String cursTinutDeNumeProfesor ;

    @Override
    public String toString() {
        return "CursuriOptionale{" +
                "anStudiu='" + anStudiu + '\'' +
                ", cursTinutDeNumeProfesor='" + cursTinutDeNumeProfesor + '\'' +
                ", studyYear=" + studyYear +
                ", Tax=" + Tax +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public String getAnStudiu() {
        return anStudiu;
    }

    public void setAnStudiu(String anStudiu) {
        this.anStudiu = anStudiu;
    }

    public String getCursTinutDeNumeProfesor() {
        return cursTinutDeNumeProfesor;
    }

    public void setCursTinutDeNumeProfesor(String cursTinutDeNumeProfesor) {
        this.cursTinutDeNumeProfesor = cursTinutDeNumeProfesor;
    }

    public CursuriOptionale(String name, String id, int studyYear, boolean tax, String numeCurs, String sumarCurs, String obiectiveCurs,
                            String cartiDecitit, String sugestiLectura, String temeLunare, String anStudiu, String cursTinutDeNumeProfesor) {
        super(name, id, studyYear, tax, numeCurs, sumarCurs, obiectiveCurs, cartiDecitit, sugestiLectura, temeLunare);
        this.anStudiu = anStudiu;
        this.cursTinutDeNumeProfesor = cursTinutDeNumeProfesor;
    }
}

