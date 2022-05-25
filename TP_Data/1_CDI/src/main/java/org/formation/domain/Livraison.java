package org.formation.domain;

import java.time.Instant;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Livraison {

	private long id;
	
	private String noCommande;
	
	private Livreur livreur;
	
	private Status status;
	

	private Instant creationDate;
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livraison other = (Livraison) obj;
		if (id != other.id)
			return false;
		return true;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	


}
