import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
    Anymal anymal=new Anymal();
    Shark shark=new Shark();
    Turtle turtle=new Turtle();
    Eagle eagle=new Eagle();
        Anymal []anymals={shark,turtle,eagle};
        for (Anymal a:anymals) {
          if (a instanceof Shark){
              System.out.print(a.getClass()+ " ");
              Shark.attack();

          } else if (a instanceof Turtle) {
              System.out.print(a.getClass()+" ");
              Turtle.swim();
          } else if (a instanceof Eagle) {
              System.out.print(a.getClass()+" ");
              Eagle.fly();
          }
        }


    }
}