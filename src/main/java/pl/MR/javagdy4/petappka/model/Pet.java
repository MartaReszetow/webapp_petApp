package pl.MR.javagdy4.petappka.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String age;
    private Double weight;
    private boolean pureRace;
    private String ownersName=this.owner.getFirstName();
    private Race race;
    @ManyToOne
    private Owner owner;

}
