package in.ashokit.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class PersonPK {

	private Long aadhar;
	private String passport;

	public Long getAadhar() {
		return aadhar;
	}

	public void setAadhar(Long aadhar) {
		this.aadhar = aadhar;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "PersonPK [aadhar=" + aadhar + ", passport=" + passport + "]";
	}

}
