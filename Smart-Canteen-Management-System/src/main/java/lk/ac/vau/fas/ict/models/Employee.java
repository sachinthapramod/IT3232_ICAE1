package lk.ac.vau.fas.ict.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee extends Person {
    private String position;

    @ManyToMany(mappedBy = "employees")
    private List<Canteen> canteens;
}
