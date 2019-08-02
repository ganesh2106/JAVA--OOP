package task_11_OOP;

class Animals {
	//attributes
	int numTeeth;
	boolean spots;
	int weight;
	
	//constructor method
	public Animals(int numTeeth, boolean spots, int weight) {
		this.numTeeth = numTeeth;
		this.spots = spots;
		this.weight = weight;
		
	}
	public String toString() {
		return "Are there spots: " + spots + "\nweight: " + weight + "\nnumber of teeth: " + numTeeth;
	}
}

	class Lion extends Animals {
		
		//Attributes
		String type;
		
		//constructor method
		public Lion(int numTeeth, boolean spots, int weight) {
			super(numTeeth, spots, weight);
			this.setType(weight);
			//very confused about this
			//it seems this would set a parameter called type on construction
			//based on a method (setType) that has used a constructor(weight)
			//from the superclas(Lion) as an input
		
		}
		
		//method to set type depending on weight
		public void setType(int weight) {
			if(weight < 80) 
			{
				this.type = "cub";
			}
			else if (weight > 80 && weight < 120) {
				this.type = "female";
			}
			else {
				this.type = "male";
			}
		}
		
		public String toString() {
			return "This lion is a " + type;
		}
		
	}
	
	class Rhino extends Animals{
		
		//attributes
		String food;
		
		//constructor method
		public Rhino (int numTeeth, boolean spots, int weight) {
			super(numTeeth, spots, weight);
			setfoodType(numTeeth);
			//i get it now
			//this method is used to create a constructor parameter for the subclass
			//using parameters from the superclass
		}
		
		public void setfoodType(int numTeeth) {
			if(numTeeth > 50) 
			{
				this.food = "grass";
			}
			else 
			{
				this.food = "bush";
			}
		}
		
		public String toString()
		{
			return "This rhino weighs: " + weight + " and eats "+ food;
		}
		
	}
	
	class Cheetah extends Animals{
		//attributes
		String mane;
		
		//constructor method
		public Cheetah (int numTeeth, boolean spots, int weight) {
			super(numTeeth, spots, weight);
			setType(weight);
		}
		
		public void setType(int weight) {
			if (weight > 100) {
				this.mane = "a mane";
			}
			else 
			{
			this.mane = "no mane";	
			}
		}
		
		public String toString()
		{
			return "This cheetah has a " + mane;
		}
		
	}
	
	class Elephant extends Animals{
		//attributes
		private int tusks;
		private String name;
		
		public Elephant(int numTeeth, boolean spots, int weight) 
		{
			super (numTeeth, spots, weight);
			this.tusks = tusks;
			this.name = name;
		}
		
		public String getName() 
		{
			return name;
		}
		
		public void setName(String name) 
			{
			this.name = name;
			}
		
		public int getTusks() {
			return tusks;
		}
		
		public void setTusks(int tusks) {
			if (tusks < 0) {
				System.out.println("Elephant cannot have negative amount of tusks");
			}
			else 
			{
			this.tusks = tusks;
			}
		}
	}

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals cat = new Animals(26, false, 5);
		System.out.println(cat.toString());
		Lion mufasa = new Lion(32, false, 140);
		System.out.println(mufasa.toString());
		Rhino reggie = new Rhino(200, false, 500);
		System.out.println(reggie.toString());
		Cheetah charlie = new Cheetah (120, true, 95 );
		System.out.println(charlie.toString());
		Elephant ellie = new Elephant(50, false, 1000);
		ellie.setTusks(-5);
		

	}

}
