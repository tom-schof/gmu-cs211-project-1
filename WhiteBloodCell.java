

public abstract class WhiteBloodCell extends Entity {

	private String nucleusType; //

	private Entity[] targets;//

	public abstract void absorb(Entity in);

	public abstract void release();

	public WhiteBloodCell(String nucleusType, Entity[] targets) {
		super(Strength.HIGH);
		this.nucleusType = nucleusType;
		this.targets = targets;
	}
	
	

@Override
	public void touchNeighbor(Entity neighbor) {
		int battle = 0;
	
		if (this.getStrength() == Strength.DEAD) {
		} else {

			for (int i = 0; i < targets.length; i++) {
				

				if (neighbor == null) {
					
				}
				
				else if (targets[i].getDNA().equals(neighbor.getDNA())) {
					battle = 1 + (int)(Math.random() * ((10 - 1) + 1));
				
				if (this.getStrength() == Strength.HIGH && battle > 1) {
					absorb(neighbor);
				}
			
				else if (this.getStrength() == Strength.MEDIUM && battle > 5) {
					absorb(neighbor);
				}
				}
				else {
					
				}
			}
		}
		}
	


	
public void increaseStrength(){
        switch (getStrength()){
            case LOW:
                setStrength(Strength.MEDIUM);
                break;
            case MEDIUM:
                setStrength(Strength.HIGH);
                break;
        }
    }        

	
public void reduceStrength(){
           switch (getStrength()){
               case LOW:
                   setStrength(Strength.DEAD);
                   break;
               case MEDIUM:
                   setStrength(Strength.LOW);
                   break;
               case HIGH:
                   setStrength(Strength.MEDIUM);
                   break;
           }
       }        
}


