public class Instrument{
  protected String m_name;
  /* PROTECTED access modifyers will make it 
  * available within parent and chile classes
  * and nowhere else
  */
  protected String m_origin;
  protected double m_price;
  // default constructor
  public Instrument(){
    m_name = null;
    m_origin = null;
    m_price = 0.0;
  }

  // fully specified constructor
  public Instrument(String n, String o, double p){
    m_name = n;
    m_origin = o;
    m_price = p;
  }

  // copy constrctor
  public Instrument(Instrument i){
    this.m_name = i.m_name;
    this.m_origin = i.m_origin;
    this.m_price = i.m_price;
  }
  // accessors
  public String getName(){
    return m_name;
  }

  public String getOrigin(){
    return m_origin;
  }

  public double getPrice(){
    return m_price;
  }

  // toString method
  public String toString(){
    String s = "";
    s += "The name is: " + m_name;
    s+= "\nThe origin is: " + m_origin;
    s+= "\nThe price is: " + m_price;
    return s;
  }

  // equals method
  public boolean equals(Object o){
    if(this==o){
      return true;
    }
    if (!(o instanceof Instrument)){
      return false;
    }else{
      Instrument i = (Instrument) o;
      return this.m_name.equals(i.m_name);
    }
  }

  // a random method
  public void play(){
    System.out.println("I am an instrument playing beautiful music");

  }

}
