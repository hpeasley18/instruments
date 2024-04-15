// we want guitar class to own everything Instrument has PLUS whatever else we want to specify
public class Guitar extends Instrument{
  protected int m_strings;

  /*always call the super constrctor at the very beginning of the childs constructor*/

  public Guitar(){
    super(); //MUST ALWAYS: calling the default constructor for the SUPER CLASS (Instrument)
    m_strings = 6;
  }

  public Guitar(double pr, int s){
    super("Guitar", "Spain", pr); // info fed to the SUPER CLASS' constructor
    m_strings = s;
  }

  public Guitar(String og, double pr, int s){
    super("Guitar", og, pr);
    m_strings = s;
  }

  // toString method
  public String toString(){
    //use the toString from super class
    String s = super.toString();
    s += "\nThe number of strings is: " + m_strings;
    return s;
  }

  public int getStrings(){
    return m_strings;
  }

  // play method for Guitar
  public void play(){ //overridden method
    System.out.println("Twang!");
  }

  // is the guitar expensive
  public boolean isExpensive(){
    boolean ret = false;
    if (m_price > 3000){
      ret = true;
    }
    return ret;
  }
}
