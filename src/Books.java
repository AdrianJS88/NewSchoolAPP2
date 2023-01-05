public class Books extends Student{
    public Books(String numeCurs, String sumarCurs, String obiectiveCurs, String cartiDecitit, String sugestiLectura, String temeLunare) {
        super(numeCurs, sumarCurs, obiectiveCurs, cartiDecitit, sugestiLectura, temeLunare);
    }

    @Override
    public String toString() {
        return "Books{" +
                "studyYear=" + studyYear +
                ", Tax=" + Tax +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
