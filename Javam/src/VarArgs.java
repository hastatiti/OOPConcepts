
public class VarArgs {
	int daysOff = 0;
	public int daysOffWork(int... days) {
		
		for(int i = 0; i<days.length; i++) {
			daysOff += days[i];
		}
		return daysOff;
		
	}
	
	@Override
	public String toString() {
		return "daysOff are " + daysOff ; 
	}

	public static void main(String[] args) {
		VarArgs v = new VarArgs();
		v.daysOffWork(1,2);
		//System.out.println(v.daysOffWork(1,2));
		System.out.println(v.toString());
	}
}
