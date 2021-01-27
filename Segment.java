public class Segment{
  public long size;
  public int numberOfPages;
  public long pageSize;
  public int numberOfSegment;

  public Segment(long pageSize, int numberOfPages, int numberOfSegment){
    this.pageSize = pageSize;
    this.numberOfPages = numberOfPages;
    this.numberOfSegment = numberOfSegment;
    size = numberOfPages*pageSize;
  }
}
