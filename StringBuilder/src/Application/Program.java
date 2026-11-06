package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import Entities.Comment;
import Entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		
		Comment c1 = new Comment ("Have a nice trip!");
		Comment c2 = new Comment ("How that's awesome!");
		
		Post p1 = new Post(
				sdf.parse("21/06/2018 13:05:44"),
				"Travelling to New Zealand",
				"I'm going to visit this wonderful contry!",
				12, null);
		
		p1.addComent(c1);
		p1.addComent(c2);
		
		System.out.println(p1);
		
		
	}

}
