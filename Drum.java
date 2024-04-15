public class Drum extends Instrument{

  // member vars
  protected int m_pieces; // 8 pieces
  // default constructor
  public Drum(){
    super();
    m_pieces = 8;
  }

  // fully specified constructor
  public Drum(double pr, int pc, String og){
    super("Drum", og, pr);
    m_pieces = pc;
  }

  // accecssor
  public int getPieces(){
    return m_pieces;
  }

  // to string method
  public String toString(){
    String s = super.toString();
    s += "\nThe number of set pieces are: " + m_pieces;
    return s;
  }


  // play method
  public void play(){ // overridden method
    System.out.println("Ba Dum CRASH!");
  }

}
