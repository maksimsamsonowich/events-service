package eu.senla.eventsservice.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "age_limit", nullable = false)
    private Short ageLimit;

    @Column(name = "occupied_places", nullable = false)
    private Short occupiedPlace;

    @Column(name = "date", nullable = false)
    private Date date;

    @ToString.Exclude
    @OneToMany(mappedBy = "eventHolding",
            fetch = FetchType.LAZY)
    private Set<Ticket> tickets;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY,
            cascade = { CascadeType.MERGE, CascadeType.DETACH })
    @JoinColumn(name = "artists_id")
    private Artist eventOrganizer;

}
