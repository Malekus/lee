package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PIZZA", schema = "PIZZERIA", catalog = "")
public class PizzaEntity {
    private String nom;
    private Integer prix;

    public PizzaEntity() {
    }

    public PizzaEntity(String nom, Integer prix) {
        this.nom = nom;
        this.prix = prix;
    }

    @Id
    @Column(name = "NOM")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "PRIX")
    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PizzaEntity that = (PizzaEntity) o;
        return Objects.equals(nom, that.nom) &&
                Objects.equals(prix, that.prix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prix);
    }
}
