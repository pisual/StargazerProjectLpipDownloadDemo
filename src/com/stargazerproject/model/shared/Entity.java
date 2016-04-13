package com.stargazerproject.model.shared;

import java.io.Serializable;

/**
 * An entity, as explained in the DDD book.
 *  
 */
public interface Entity<T> extends Serializable{

  /**
   * Entities compare by identity, not by attributes.
   *
   * @param other The other entity.
   * @return true if the identities are the same, regardles of other attributes.
   */
  public boolean sameIdentityAs(T other);
  
  public String toString();

  public T clone() throws CloneNotSupportedException ;

}
