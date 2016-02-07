package cworks.app.domain;

import java.util.Collection;

/**
 * Unique is a condition applied to an Object to uniquely identify it
 * An Object can have multiple Unique constraints applied to it.
 *
 * For example a Person object could have these Unique requirements
 * p.firstName(), p.lastName(), p.email()
 * p.ssn()
 *
 */
public interface Unique {
    String getName();
    Object value();
    Object value(int n);
    Collection<Object> values();
}
