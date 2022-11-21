package models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    String category;

    Double price;

    @ManyToMany(mappedBy = "products")
            @ToString.Exclude
            @EqualsAndHashCode.Exclude
    List<Order> orders;
}
