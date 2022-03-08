package de.telekom.sea7;

import javax.persistence.*;

@Entity
@Table(name = "iban")
public class IbanImpl {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iban_id;
	@Column(name = "IbanNR")
	private String iban;
//	@OneToMany(mappedBy = "iban")
//	private ZahlungImpl zahlung;
	
	public IbanImpl() {

	}

	public IbanImpl(int iban_id, String iban) {
		this.iban_id = iban_id;
		this.iban = iban;
	}

	public int getIban_id() {
		return iban_id;
	}

	public void setIban_id(int iban_id) {
		this.iban_id = iban_id;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

}
