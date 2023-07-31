package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="PermanentEmp")
@PrimaryKeyJoinColumn(name = "empid")


public class PermanentEmp extends Emp {
	@Column
	float allowances;
	@Column
	float bouns;
	@Column
	float deductions;
	public PermanentEmp() {
		super();
	
	}
	
	
	public PermanentEmp(String name, String email, String contactno, float basic, float allowances, float bouns,
			float deductions) {
		super(name, email, contactno, basic);
		this.allowances = allowances;
		this.bouns = bouns;
		this.deductions = deductions;
	}

	public float getAllowances() {
		return allowances;
	}
	public void setAllowances(float allowances) {
		this.allowances = allowances;
	}
	public float getBouns() {
		return bouns;
	}
	public void setBouns(float bouns) {
		this.bouns = bouns;
	}
	public float getDeductions() {
		return deductions;
	}
	public void setDeductions(float deductions) {
		this.deductions = deductions;
	}
	
	
	
	

}
