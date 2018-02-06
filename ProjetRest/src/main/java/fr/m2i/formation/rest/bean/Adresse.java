package fr.m2i.formation.rest.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Adresse {
	private String rue;
	private String codepostal;
	private String ville;
	
	@XmlAttribute(name="numero", required=true)
	private int numero;
	
	
	
	public Adresse() {
		
	}
	
	public Adresse(String rue, String codepostal, String ville, int numero) {
		this.rue = rue;
		this.codepostal = codepostal;
		this.ville = ville;
		this.numero = numero;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getCodepostal() {
		return codepostal;
	}
	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Adresse [rue=" + rue + ", codepostal=" + codepostal + ", ville=" + ville + ", numero=" + numero + "]";
	}
	
	
	
	
}
