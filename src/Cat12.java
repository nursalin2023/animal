public class Cat12 {
    private String name ;
    private String color;
    private int age;
    private String weingth;
    public Cat12 (){

    }

    public Cat12(String name, String color, int age, String weing) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weingth = weing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWeing() {
        return weingth;
    }

    public void setWeing(String weing) {
        this.weingth = weing;
    }

    @Override
    public String toString() {
        return "Cat12{" +
                "name: " + name + "\n" +
                "color: " + color + "\n" +
                "age: " + age + "\n" +
                "weing: " + weingth;
    }
}
