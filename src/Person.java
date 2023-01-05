public class Person  {
    String name ;
    String id ;
    public  boolean equals(Student c){
        if (this.name.trim().equalsIgnoreCase(c.getName().trim())){
            return  true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }
}
