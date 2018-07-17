package com.solution.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class AddressEntity {
	@Id
	private Long id;

	@Column(name = "address1")
	private String address;

	@ManyToOne
	@JoinColumn(name = "persion_Id")
	private PersionEntity person;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public PersionEntity getPerson() {
		return person;
	}

	public void setPerson(PersionEntity person) {
		this.person = person;
	}

}
