package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "STOCKPIZZA", schema = "PIZZERIA", catalog = "")
public class StockpizzaEntity {
    private int id;
    private Integer quantite;
    private PizzaEntity pizza;

    public StockpizzaEntity() {
    }

    public StockpizzaEntity(int id, Integer quantite, PizzaEntity pizza) {
        this.id = id;
        this.quantite = quantite;
        this.pizza = pizza;
    }

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "QUANTITE")
    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockpizzaEntity that = (StockpizzaEntity) o;
        return id == that.id &&
                Objects.equals(quantite, that.quantite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantite);
    }

    @OneToOne
    @JoinColumn(name = "PIZZA", referencedColumnName = "NOM")
    public PizzaEntity getPizza() {
        return pizza;
    }

    public void setPizza(PizzaEntity pizza) {
        this.pizza = pizza;
    }
}
