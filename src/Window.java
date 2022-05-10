class Window extends Rectangle {

    String material;


    public Window(int height, int width, String material) {
        super(height, width);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public static void main(String[] args) {
        Window window = new Window(2, 5, "wood");
        window.checker();
        window.setMaterial("plastic");
        System.out.println(window.getPerimeter());
        System.out.println(window.getArea());
        System.out.println(window.getMaterial());
    }

}

class Person{
    String firstName;
    String lastName;
    int age;
    int weight;
    int height;
    int sex;

    public Person(String firstName, String lastName, int age, int weight, int height, int sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.sex = sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
class Student extends Person{
    int course;
    String specialization;
    String university;

    public Student(String firstName, String lastName, int age, int weight, int height, int sex, int course, String specialization, String university) {
        super(firstName, lastName, age, weight, height, sex);
        this.course = course;
        this.specialization = specialization;
        this.university = university;
    }


}

