package ws;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;


//les annotations utilisées ci-dessous sont des annotations JaxB

@XmlRootElement(name = "compte") //Quand on convertit cet object en xml son nom va être compte
@XmlAccessorType(XmlAccessType.FIELD)  //Pour utiliser l'annotation @XmlTransient Field pour dire que les annotations, c'est pour les champs et non pas pour les getters et les setters
public class Compte {
    private int code;
    private double solde;

    @XmlTransient //ignore l'attribut ci-dessous lors de la conversion de cet objet en XML
    private Date dateCreation;

    public Compte() {

    }

    public Compte(int code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
