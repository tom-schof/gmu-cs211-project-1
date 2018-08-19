



public class Cytokine extends Entity {
	
	public Cytokine() {
	
		super(Strength.DEAD);
		setDNA("cytokine");
			
		}
	@Override
	public void touchNeighbor(Entity neighbor)	{
		if (neighbor == null) {
		}
		else if (neighbor.getDNA().equals("neutrophil")) {
			this.kill();
		}


	}
}
