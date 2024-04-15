import java.util.ArrayList;
import java.util.Collections;
/**
W12 D01 INHERITANCE AND POLYMORPHISM

AGENDA:
We will build the following
Instrument: which has a name, an origin, and price.
Guitar: which extends from Instrument and has a number of strings.
Drum: which extends from Instrument and has a number of pieces.

All classes have a default, overloaded, and copy constructor
as well as accessors, mutators, a toString() method,
and a play() method that prints an appropriate message
for the instrument to standard output.

*/
public class InstrumentDriver{
  public static void main(String[] args) {

    Instrument i = new Instrument("Piano", "Italy", 11000.50);
    Guitar g = new Guitar("Madrid", 4500.99, 6);
    Drum d = new Drum(6000, 8, "China");

    System.out.println(i + "\n");
    System.out.println(g + "\n");
    System.out.println(d + "\n");

    i.play();
    g.play();
    d.play();

    System.out.println(g.isExpensive() + "\n");


    Instrument i2 = d; //POLYMORPHISM
    i2.play(); // play the drum version
    // at runtime the JVM looks for and executed the MOST specific implementation of a method
    // LATE BINDING    (use in interview)

    System.out.println("\nPOLYMORPHISM EXAMPLE: \n");
    ArrayList<Instrument> al = new ArrayList<Instrument>();
    al.add(i);
    al.add(g);
    al.add(d);
    for (Instrument x: al){  //POLYMORPHISM looks into each class
      x.play();
    }
  }
}
