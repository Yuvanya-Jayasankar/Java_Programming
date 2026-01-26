package first;

public class StudentScore {
	//USE CASE -2 FROM DAY 1
	//for day 1 use cases u need to do right click, run as ,
	//run configurations, and in argument give input and run then output will come. 
	public static void main(String[] args){
		String name = args[0];
		int MarksInEng = Integer.parseInt(args[1]);
		int MarksInMath = Integer.parseInt(args[2]);

		int Total = MarksInEng + MarksInMath;
		int Percent = (Total*100)/200;
		char Grade;
		if(Percent >=90){
		    Grade = 'A';
		}
		else if(Percent >= 75){
		    Grade = 'B';
		}
		else if(Percent >= 50){
		   Grade = 'C';
		}
		else{
		    Grade = 'F';
		}
		        System.out.println("Student: " + name);
		        System.out.println("English: " + MarksInEng);
		        System.out.println("Maths: " + MarksInMath);
		        System.out.println("Total: " + Total);
		        System.out.println("Percentage: " + Percent + "%");
		        System.out.println("Grade: " + Grade); 
		Student s = new Student();
		s= null;        
		}
		}
		class Student{
		    String name;
		    int MarksInEng;
		    int MarksInMath;
		}

