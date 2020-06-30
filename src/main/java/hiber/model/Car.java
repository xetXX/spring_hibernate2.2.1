package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @Column(name = "series")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int series;

    @Column(name = "name")
    private String name;

    @OneToOne(mappedBy = "car")
    private User user;

    public Car() {
    }

    public Car(String name, User user) {
        this.name = name;
        this.user = user;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
