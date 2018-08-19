

public abstract class Entity {
	
	private String DNA; //
	private Strength strength; //
	protected static Entity[] bloodstream; 
	
	
	
	public Entity(Strength strength) {
		
		this.strength = strength;
		
	}

	public void kill() {
		strength = Strength.DEAD;
		
	}
	
	public abstract void touchNeighbor(Entity neighbor);
	
	public String getDNA() {
		return DNA;
	}

	public void setDNA(String dNA) {
		DNA = dNA;
	}

	public Strength getStrength() {
		return strength;
	}

	public void setStrength(Strength strength) {
		this.strength = strength;
	}

	public static void setEntity(int size) {
		bloodstream = new Entity[size];
	}
}
