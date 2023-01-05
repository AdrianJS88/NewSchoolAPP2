public class CursuriObligatori extends Student{
     private String numeCurs ;
    private String SumarCurs ;
    private String obiectiveCurs ;
    private String cartiDecitit ;
    private String sugestiLectura ;
    private String temeLunare ;

    public CursuriObligatori(String numeCurs, String sumarCurs, String obiectiveCurs, String cartiDecitit, String sugestiLectura, String temeLunare) {
        super(numeCurs,sumarCurs,obiectiveCurs,cartiDecitit, sugestiLectura,temeLunare);
        this.numeCurs = numeCurs;
        SumarCurs = sumarCurs;
        this.obiectiveCurs = obiectiveCurs;
        this.cartiDecitit = cartiDecitit;
        this.sugestiLectura = sugestiLectura;
        this.temeLunare = temeLunare;
    }

    @Override
    public String toString() {
        return "CursuriObligatori{" +
                "numeCurs='" + numeCurs + '\'' +
                ", SumarCurs='" + SumarCurs + '\'' +
                ", obiectiveCurs='" + obiectiveCurs + '\'' +
                ", cartiDecitit='" + cartiDecitit + '\'' +
                ", sugestiLectura='" + sugestiLectura + '\'' +
                ", temeLunare='" + temeLunare + '\'' +
                ", studyYear=" + studyYear +
                ", Tax=" + Tax +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public void setNumeCurs(String numeCurs) {
        this.numeCurs = numeCurs;
    }

    public String getSumarCurs() {
        return SumarCurs;
    }

    public void setSumarCurs(String sumarCurs) {
        SumarCurs = sumarCurs;
    }

    public String getObiectiveCurs() {
        return obiectiveCurs;
    }

    public void setObiectiveCurs(String obiectiveCurs) {
        this.obiectiveCurs = obiectiveCurs;
    }

    public String getCartiDecitit() {
        return cartiDecitit;
    }

    public void setCartiDecitit(String cartiDecitit) {
        this.cartiDecitit = cartiDecitit;
    }

    public String getSugestiLectura() {
        return sugestiLectura;
    }

    public void setSugestiLectura(String sugestiLectura) {
        this.sugestiLectura = sugestiLectura;
    }

    public String getTemeLunare() {
        return temeLunare;
    }

    public void setTemeLunare(String temeLunare) {
        this.temeLunare = temeLunare;
    }

    public CursuriObligatori(String name, String id, int studyYear, boolean tax, String numeCurs, String sumarCurs, String obiectiveCurs, String cartiDecitit, String sugestiLectura, String temeLunare) {
        super(name, id, studyYear, tax);
        this.numeCurs = numeCurs;
        SumarCurs = sumarCurs;
        this.obiectiveCurs = obiectiveCurs;
        this.cartiDecitit = cartiDecitit;
        this.sugestiLectura = sugestiLectura;
        this.temeLunare = temeLunare;
    }
}


