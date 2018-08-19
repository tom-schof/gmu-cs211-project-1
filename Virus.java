

public class Virus extends Entity {

	public Virus(Strength strength) {
		super(strength);
		this.setDNA("virus");
	}
	
	@Override
	public void touchNeighbor(Entity neighbor) {
		
		if (this.getStrength() == Strength.DEAD || neighbor == null) {
		} 
		else {
				if (neighbor.getDNA().equals("neutrophil")) {
					neighbor.setDNA("virus");
					}
				}
			}

}
