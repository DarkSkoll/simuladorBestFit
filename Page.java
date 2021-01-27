public class Page
{
  public int id;
  public int physical;
  public byte R;
  public byte M;
  public int inMemTime;
  public int lastTouchTime;
  public long high;
  public long low;
  public int numSegmento;

  public Page( int id, int physical, byte R, byte M, int inMemTime, int lastTouchTime, long high, long low )
  {
    this.id = id;
    this.physical = physical;
    this.R = R;
    this.M = M;
    this.inMemTime = inMemTime;
    this.lastTouchTime = lastTouchTime;
    this.high = high;
    this.low = low;

	if(physical>=0 || physical<2){numSegmento=1;}
        if(physical>=2 || physical<5){numSegmento=2;}
        if(physical>=5 || physical<11){numSegmento=3;}
        if(physical>=11 || physical<20){numSegmento=4;}
        if(physical>=20 || physical<32){numSegmento=5;}
  }
	public void setText(int numSegmento){
		this.numSegmento=numSegmento;
	}
	public String getText(){
		return(Integer.toString(numSegmento));
	}
}
