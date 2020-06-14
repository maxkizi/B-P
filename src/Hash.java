import org.w3c.dom.ls.LSOutput;

public class Hash {
    private Long id;
    private String name;

    public Hash(Long id, String name){
        this.id = id;
        this.name = name;
    }


    public Long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
   public boolean equals(Object obj){
        System.out.println("Equals is called: " + this + " : " + obj);
        Hash other = (Hash) obj;
        return  id.equals(other.id) && name.equals(other.name);
    }

    @Override
    public int hashCode() {
        System.out.println("HashCode is called: " + this);
        return id.intValue();
    }

    @Override
    public String toString() {
        return "Hash{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

