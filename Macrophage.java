


public class Macrophage extends WhiteBloodCell {
	
	private int count; //

	@Override
	public void absorb(Entity in) {
		in.kill();
		count++;
		this.release();
	}

	@Override
	public void release() {
		if (count > 100) {
			this.kill();
		}
	}

	public Macrophage(String nucleusType, Entity[] targets) {
		super(nucleusType,targets);
		this.setDNA("macrophage");
	}
	
	@Override
	public void touchNeighbor(Entity neighbor) {
		super.touchNeighbor(neighbor);
		if (this.getStrength() == Strength.DEAD || neighbor == null) {
		} 
		else if (neighbor.getDNA().equals("neutrophil")) {
			if (neighbor.getStrength() == Strength.LOW) {
				this.absorb(neighbor);
			}
			else {
			}
		}
		}
}
