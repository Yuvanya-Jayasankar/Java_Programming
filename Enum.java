package first;

enum Day{
	Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
}
public class Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day[] allDays=Day.values();
		 
		System.out.println("All Days of the Week:");
		for(Day d: allDays)
		{
			System.out.println(d);
			Day[] WorkingDays=new Day[5];
			WorkingDays[0]= Day.Monday;

	}
	}
}

