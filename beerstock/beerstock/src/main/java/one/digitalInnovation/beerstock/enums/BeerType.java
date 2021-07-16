package one.digitalInnovation.beerstock.enums;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;


@Entity
@AllArgsConstructor
public enum BeerType {

    LAGER("Lager"),
    MALZBIER("Malzbier"),
    WITBIER("Witbier"),
    WEISS("Weiss"),
    ALE("Ale"),
    IPA("IPA"),
    STOUT("Stout");

    private final String description;
}