public class Fishn12 {
    private String name ;
    private String weight;
    private int age ;
    public Fishn12(){

    }

    public Fishn12 (String name ,String weight , int age ){
        this.name =name;
        this.weight = weight;
        this.age =age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public String toString() {
        return "Fishn12: \n" +
                "name:  " + name + "\n" +
                "weight:  " + weight + "\n" +
                "age: " + age ;
    }
}
