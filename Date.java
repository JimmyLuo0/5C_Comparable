/**
  Represent a date
 */
public class Date implements Comparable{
    private int y,m,d;
    

    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }
	
	public int compareTo (Object date){
		Date temp = (Date)date;
		if(y == temp.y){
			if(m == temp.m){
				if(d == temp.d)
					return 0;
				else return d - temp.d;
			}
			else return m - temp.m;
		}
		else return y - temp.y;
	}
}