package Entities;

public class Student {
	public String name;
	public double note1, note2, note3;
	
	public double[] calcFinalScore() {
		double total = note1 + note2 + note3;
		double miniScore = (60.0 / 100.0) * 100.0;
		boolean pass = false;
		double[] arr = new double[2];
		
	
		
		if(total >= miniScore) {
			pass = true;
			arr[0] = total;
			arr[1] = 0;
		} else {
			pass = false;
			arr[0] = total;
			arr[1] = miniScore - total;
		}
		
		return arr;
	}
}
