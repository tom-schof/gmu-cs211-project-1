



public class Lymphocyte extends WhiteBloodCell {

	@Override
	public void absorb(Entity in) {
		in.kill();
		this.release();
		
	}

	@Override
	public void release() {
		int kill_chance = (int) (Math.random() * 100);
		if (kill_chance < 10) {
			this.kill();
		}
	}
	
	public Lymphocyte(String nucleusType, Entity[] targets) {
		super(nucleusType,targets);
		this.setDNA("lymphocyte");
	}

}
