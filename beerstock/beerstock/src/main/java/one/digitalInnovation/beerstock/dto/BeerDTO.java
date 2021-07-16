package one.digitalInnovation.beerstock.dto;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalInnovation.beerstock.enums.BeerType;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BeerDTO { private Long id;

    @NotNull
    private String name;
    @NotNull
    private String brand;
    @NotNull
    private Integer max;
    @NotNull
    private Integer quantity;
    @Enumerated(EnumType.STRING)
    @NotNull
    private BeerType type;
}
