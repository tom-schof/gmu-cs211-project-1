


public class Neutrophil extends WhiteBloodCell {
	
	private boolean sniffCytokines; //
	
	public Neutrophil(String nucleusType, Entity[] targets, boolean sniffCytokines) {
		super(nucleusType,targets);
		setDNA("neutrophil");
		this.sniffCytokines = sniffCytokines;
		

	}
	
	@Override
	public void absorb(Entity in) { 
		in.kill();
		this.reduceStrength();
		this.release();
	}
	
	@Override
	public void release() {
			int ctr = 0;
			int i = 0;
			if (this.getDNA().equals("virus")) {
				while (i < bloodstream.length && ctr < 3) {
					
					if (bloodstream[i] == null) {
						bloodstream[i] = new Virus(Strength.HIGH);
						ctr++;
					
					}
					i++;
				}
			}
			else {while (i < bloodstream.length && ctr < 3) {
				if (bloodstream[i] == null) {
					bloodstream[i] = new Cytokine();
					ctr++;
				
				}
				i++;
				
			}
			}
	}
				
	@Override
	public void touchNeighbor(Entity neighbor) {

		if (this.getStrength() == Strength.DEAD || neighbor == null) {
		} 
		else if (sniffCytokines == true) {
			if (neighbor.getDNA().equals("cytokine")) {
				this.increaseStrength();
			}
			else {
				super.touchNeighbor(neighbor);
			}
		}
		}
	
}


