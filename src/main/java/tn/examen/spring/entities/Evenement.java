package tn.examen.spring.entities;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
public class Evenement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	private String description ;
	
	@Temporal(TemporalType.DATE)
	private Date dateDebut ;
	
	@Temporal(TemporalType.DATE)
	private Date dateFin ;

	
	private float count;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	
	private List<Participant> participants;
	
	
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JsonIgnore
	private List<Logistique> logistiques;
	
}
