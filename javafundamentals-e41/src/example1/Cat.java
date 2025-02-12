package example1;

public class Cat implements Comparable<Cat>{
    int age;

    public Cat(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Cat o) {
        return this.getAge() - o.getAge();
    }
}
