package Saburov.equalsHashCode;

public class MyClass {
    Long id;
    private String name;

    public MyClass(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public boolean equals (Object obj){
//        System.out.println("Equals is called " + this + ": " + obj);
//        MyClass other = (MyClass) obj;
//        return id.equals(other.id) && name.equals(other.name);
//    }

    @Override
    public String toString() {
        return "MyClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int hashCode (){
        System.out.println("HashCode is called " + this);
        return id.intValue();
    }
}
