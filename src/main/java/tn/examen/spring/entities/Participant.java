package tn.examen.spring.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Participant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int idPart;
	
	private String nom;
	private String prenom;
	
	@Enumerated(EnumType.STRING)
	private Tache tache;
	
	@ManyToMany(mappedBy="participants", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Evenement> evenements;
	
	
}
