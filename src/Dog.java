public class Dog {
    private String name;
    private String weingth;
    private int age;
    public Dog (){

    }

    public Dog(String name, String weing, int age) {
        this.name = name;
        this.weingth = weing;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeingth() {
        return weingth;
    }

    public void setWeingth(String weingth) {
        this.weingth = weingth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog: " +
                "name: " + name + "\n"+
                "weing: " + weingth + "\n" +
                "age: " + age ;
    }
}
