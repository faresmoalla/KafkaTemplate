package tn.examen.spring.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Logistique {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int idLog;
	private String description;
	private boolean reserve;
	private float prixUnit;
	private int quantite;
	
	
}
