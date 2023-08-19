package backend.task.restaurant.model.persistence.entity.table;

import backend.task.restaurant.model.persistence.entity.base.BaseEntity;
import backend.task.restaurant.model.persistence.entity.table.enums.Area;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Table Entity class.
 *
 * @author Vahe
 */
@Getter
@Setter
@Entity
@Table(name = "tables")
public class TableEntity extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer seatNumber;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Area area;

    @Column(nullable = false)
    private boolean reservable;
}
