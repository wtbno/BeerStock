package one.digitalInnovation.beerstock.entity;

import one.digitalInnovation.beerstock.enums.BeerType;
import org.springframework.data.annotation.Id;
import sun.jvm.hotspot.debugger.cdbg.EnumType;
//import sun.jvm.hotspot.debugger.cdbg.EnumType;

import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Beer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private int max;

    @Column(nullable = false)
    private int quantity;

    @Enumerated(EnumType.String)
    @Column(nullable = false)
    private BeerType type;
}
