package cse360assignment02;

public class AddingMachine {
  private int total;
  private String history = "0";
  
  public static void main(String[] args) 
	{
	  AddingMachine calc = new AddingMachine();
	  calc.add(10);
	  calc.subtract(5);
	  calc.add(69);
	  System.out.println(calc.toString());
	  System.out.println(calc.getTotal());
	  calc.clear();
	  System.out.println(calc.toString());
	  System.out.println(calc.getTotal());

	}
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () {   // Method Used to get total so far
    return total;
  }
  
  public void add (int value) {   // Adding to the total value
	  total += value;
	  history = history + " + " + value;
	  
  }

  public void subtract (int value) {      // Subtracting from the total value
	  total -= value;
	  history = history + " - " + value;
  }

  public String toString () {  		//Printing total and changes madoe to total
    return "" + history;
  }

  public void clear() {				// Clears the AddingMachine
	  total = 0;
	  history = "0";
  }
}