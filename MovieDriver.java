import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		
		String answer = null;
		Scanner keyboard = new Scanner(System.in);
		Movie movie = new Movie();
		
		do {
			System.out.println("Enter the name of a movie");
			String name = keyboard.nextLine();
			movie.setTitle(name);
		
			System.out.println("Enter the rating of the movie");
			String rating = keyboard.nextLine();
			movie.setRating(rating);
		
			System.out.println("Enter the number of tickets sold for this movie");
			int soldTickets = keyboard.nextInt();
			movie.setSoldTickets(soldTickets);
		
			System.out.print(movie.toString());
		
			System.out.println("\nDo you want to enter another? (y or n)");
			keyboard.nextLine();
			answer = keyboard.nextLine();
		} while (answer.equals("y"));

		System.out.println("Goodbye");
		
	}

}
