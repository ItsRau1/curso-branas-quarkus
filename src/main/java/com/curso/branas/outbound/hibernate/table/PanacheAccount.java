package com.curso.branas.outbound.hibernate.table;

import com.curso.branas.core.domain.valueObject.Cpf;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "account")
public class PanacheAccount extends PanacheEntityBase {

	@Id
	public String id;

	public String name;

	public String email;

	public String cpf;

	@Column(name = "car_plate")
	public String carPlate;

	@Column(name = "is_passanger")
	public Boolean isPassanger;

	@Column(name = "is_driver")
	public Boolean isDriver;

	public String password;

}
