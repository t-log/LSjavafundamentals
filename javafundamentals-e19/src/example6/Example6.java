package example6;

public class Example6 {
    /*The need for interfaces: To achieve loose coupling
    * Here Musician is dependent on an instance of Playable
    * If we had not used Playable interface and had used instance of Piano in Musician then
    * there is tight coupling between Musician and Piano. Say in future the Musician switched to playing
    * Guitar instead of Piano we need to replace in Musician class Piano with Guitar
    * Interface allows us to solve this problem by achieving loose coupling between Musician and its dependency
    *
    * Need for default method in interface : There can be a default implementation for a behaviour and then later
    * for any reason if it needs to have a different implementation it can be overridden in the class
    * that implements the interface. (Helps us in avoiding code duplication)
    *
    * Need for static method in interface : If default methods have duplicate code,it can be extracted out to
    * a static method and called in those default methods and the static method can be made private so that it
    * can't be accessed outside the interface
    * */
    public static void main(String[] args) {
        Musician musician = new Musician(new Guitar());
    }
}
