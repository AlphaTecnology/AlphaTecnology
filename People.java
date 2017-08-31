package Exercise;

public class People {
	
	private boolean PhysicalPerson;
	private boolean LegalPerson;
	
	public People(){	
	}
	
	public void PhysicalPerson() {
		this.LegalPerson = false;
		this.PhysicalPerson = true;
	}
	
	public void LegalPerson() {
		this.LegalPerson = true;
		this.PhysicalPerson = false;
	}

	public boolean isPhysicalPerson() {
		return PhysicalPerson;
	}

	public boolean isLegalPerson() {
		return LegalPerson;
	}
	
}
