package com.yourube.demo.mode;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Access(AccessType.FIELD)
public class ParentEntity implements Serializable{

	private static final long serialVersionUID = -3786772182703618339L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id",unique=true,nullable=false)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
