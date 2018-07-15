import java.util.ArrayList;

public class ClassRoomAnalyzer {
public ClassRoomAnalyzer () {
	
}
	public int getAverage(ArrayList<Integer> grades) {
		if ( grades.size() < 1 ) {
			System.out.println("Error ! The ArrayList can't be empty.");
			return 0;
		} else {
			int sum = 0;
			for (Integer grade : grades) {
				sum  = sum + grade ;
			}
			int average = sum / grades.size();
			System.out.println(average);
			return average;
		} 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> myClassroom = new ArrayList<Integer>();
		myClassroom.add(98);
		myClassroom.add(92);
		myClassroom.add(88);
		myClassroom.add(75);
		myClassroom.add(61);
		myClassroom.add(89);
		myClassroom.add(95);
		
		ClassRoomAnalyzer myAnalyzer = new ClassRoomAnalyzer() ;
		myAnalyzer.getAverage(myClassroom);
		
	}

}
