package view;
import controller.Controller;
import java.util.Scanner;
import model.AnalysisString;

public class Main {
    public static void main(String[] args) {
        AnalysisString model = new AnalysisString();
        View view = new View();
        Controller controller = new Controller(model, view);

        Scanner scanner = new Scanner(System.in);
        
		System.out.println("===== Analysis String program ====");
		System.out.print("Input String: ");
		
		String input = scanner.nextLine();

		System.out.println("\n-----Result Analysis------");
		
		controller.analyzeString(input);
    }
}