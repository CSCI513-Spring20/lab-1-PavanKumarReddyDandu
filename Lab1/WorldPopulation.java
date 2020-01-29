// Lab-1 
// Participants : Pavan Kumar Reddy Dandu(z1862294)
//                Balaji Naidu Sadhu(z1860906)
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.StringTokenizer;

public class WorldPopulation {

	SortStrategy sortStrategy;
	long[] population = new long[13484]; // Cheating because we know number of records!!
	// Lab Exercise:  After creating some strategy classes -- set the default strategy here.
	public WorldPopulation(){
		sortStrategy = new InsertionSort(); // Set the default strategy here.	
	}
	
	public void readInputFile(){
		population = readPopulationFile("src\\WorldPopulation.csv");
	}
	
	public void setStrategy(SortStrategy strategy){
		sortStrategy = strategy;
	}
	
	// Lab Exercise:  Read in the WorldPopulation.csv
	// Extract ONLY the numbers and store them into population[]
	public long[] readPopulationFile(String fileName){
		int count = 0;
		try {
			FileReader inputFile = new FileReader(fileName);
			BufferedReader reader = new BufferedReader(inputFile);
			String line;
			while((line = reader.readLine()) != null) {
				StringTokenizer tokenizer = new StringTokenizer(line, ",");
				String Name = tokenizer.nextToken();
				String year = tokenizer.nextToken();
				String popul =tokenizer.nextToken();
				long populate = Long.parseLong(popul);
				population[count] = populate;
				count++;

			//System.out.println(line);
			}
			reader.close();
			} catch (Exception e) {
			e.printStackTrace();
			}
	  
		return population;
	}
	
	// Lab Exercise.  Complete this method.
	// Delegate sorting to the strategy object
	public void sortPopulation(SortStrategy method){
		method.sort(population);
		
		
	}
	
	public void computeTotalPopulation(){
		System.out.println("dd");
	}
	
	// Experiment with various strategies.
	// Create 3 strategies -- Bubble, insertion, and selection sort.
	public static void main(String[] args) {
		WorldPopulation worldPopulation = new WorldPopulation();
		
		SelectionSort select = new SelectionSort();
		InsertionSort insert = new InsertionSort();
		BubbleSort bubble = new BubbleSort();
		worldPopulation.readInputFile();
		worldPopulation.setStrategy(select);  
		worldPopulation.sortPopulation(select);	
		worldPopulation.readInputFile();
		worldPopulation.setStrategy(insert);  
		worldPopulation.sortPopulation(insert);
		worldPopulation.readInputFile();
		worldPopulation.setStrategy(bubble);
		worldPopulation.sortPopulation(bubble);
	}

}
