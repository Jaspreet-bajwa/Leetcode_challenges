import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;



public class Main {
  /**
   * Iterate through each line of input.
   */
	public class Port{
		  private String name;
		  private String type;
		  private int quantityPort = 0;
		  private int pricePort = 0;
		  private int quantityBench = 0;
		  private int priceBench = 0;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public int getQuantityPort() {
			return quantityPort;
		}
		public void setQuantityPort(int quantityPort) {
			this.quantityPort = quantityPort;
		}
		public int getPricePort() {
			return pricePort;
		}
		public void setPricePort(int pricePort) {
			this.pricePort = pricePort;
		}
		public int getQuantityBench() {
			return quantityBench;
		}
		public void setQuantityBench(int quantityBench) {
			this.quantityBench = quantityBench;
		}
		public int getPriceBench() {
			return priceBench;
		}
		public void setPriceBench(int priceBench) {
			this.priceBench = priceBench;
		}
		  

		}
	
	
	
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    Main main = new Main();
    while ((line = in.readLine()) != null) {
      String tokens[] = line.split("|");
      String port = tokens[0];
      String bench = tokens[1];      
      System.out.println(line);
    }
  }
}
