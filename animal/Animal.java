package samples.animal;

public abstract class Animal {
	
	//Properties
	String scientificName,popularName;
	int age;
	double mass;
	
	
	//Construtuores
	public Animal() {}
	
	//Construtores
	public Animal (String scientificName,String popularName) {
		this.scientificName=scientificName;
		this.popularName=popularName;
		
	}
	
	//Constructores metodo virtual
	public Animal (String scientificName,String popularName,int age,double mass) {
		this(scientificName,popularName);
		this.age=age;
		this.mass=mass;
	}
	
	
	@Override
	public String toString() {
		String subInfo="\nscientificName=" + scientificName + "\npopularName=" + popularName + "\nage=" + age + "\nmass="
				+ mass + "";
		return subInfo;
	}

	//behaviors
	public abstract void born();
	
	
	public abstract void eat() ;

	public abstract void grows();

	public abstract void reproduces();
	public abstract void die() ;
	
	
}
