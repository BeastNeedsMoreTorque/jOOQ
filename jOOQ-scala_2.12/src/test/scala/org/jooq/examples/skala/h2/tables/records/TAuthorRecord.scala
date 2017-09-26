/*
 * This file is generated by jOOQ.
*/
package org.jooq.examples.skala.h2.tables.records


import java.lang.Integer
import java.lang.String
import java.sql.Date

import javax.annotation.Generated

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record6
import org.jooq.Row6
import org.jooq.examples.skala.h2.tables.TAuthor
import org.jooq.impl.UpdatableRecordImpl

import scala.Array


/**
 * This class is generated by jOOQ.
 */
@Generated(
  value = Array(
    "http://www.jooq.org",
    "jOOQ version:3.10.0"
  ),
  comments = "This class is generated by jOOQ"
)
class TAuthorRecord extends UpdatableRecordImpl[TAuthorRecord](TAuthor.T_AUTHOR) with Record6[Integer, String, String, Date, Integer, String] {

  /**
   * Setter for <code>PUBLIC.T_AUTHOR.ID</code>.
   */
  def setId(value : Integer) : Unit = {
    set(0, value)
  }

  /**
   * Getter for <code>PUBLIC.T_AUTHOR.ID</code>.
   */
  def getId : Integer = {
    val r = get(0)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>PUBLIC.T_AUTHOR.FIRST_NAME</code>.
   */
  def setFirstName(value : String) : Unit = {
    set(1, value)
  }

  /**
   * Getter for <code>PUBLIC.T_AUTHOR.FIRST_NAME</code>.
   */
  def getFirstName : String = {
    val r = get(1)
    if (r == null) null else r.asInstanceOf[String]
  }

  /**
   * Setter for <code>PUBLIC.T_AUTHOR.LAST_NAME</code>.
   */
  def setLastName(value : String) : Unit = {
    set(2, value)
  }

  /**
   * Getter for <code>PUBLIC.T_AUTHOR.LAST_NAME</code>.
   */
  def getLastName : String = {
    val r = get(2)
    if (r == null) null else r.asInstanceOf[String]
  }

  /**
   * Setter for <code>PUBLIC.T_AUTHOR.DATE_OF_BIRTH</code>.
   */
  def setDateOfBirth(value : Date) : Unit = {
    set(3, value)
  }

  /**
   * Getter for <code>PUBLIC.T_AUTHOR.DATE_OF_BIRTH</code>.
   */
  def getDateOfBirth : Date = {
    val r = get(3)
    if (r == null) null else r.asInstanceOf[Date]
  }

  /**
   * Setter for <code>PUBLIC.T_AUTHOR.YEAR_OF_BIRTH</code>.
   */
  def setYearOfBirth(value : Integer) : Unit = {
    set(4, value)
  }

  /**
   * Getter for <code>PUBLIC.T_AUTHOR.YEAR_OF_BIRTH</code>.
   */
  def getYearOfBirth : Integer = {
    val r = get(4)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>PUBLIC.T_AUTHOR.ADDRESS</code>.
   */
  def setAddress(value : String) : Unit = {
    set(5, value)
  }

  /**
   * Getter for <code>PUBLIC.T_AUTHOR.ADDRESS</code>.
   */
  def getAddress : String = {
    val r = get(5)
    if (r == null) null else r.asInstanceOf[String]
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------
  override def key : Record1[Integer] = {
    return super.key.asInstanceOf[ Record1[Integer] ]
  }

  // -------------------------------------------------------------------------
  // Record6 type implementation
  // -------------------------------------------------------------------------

  override def fieldsRow : Row6[Integer, String, String, Date, Integer, String] = {
    super.fieldsRow.asInstanceOf[ Row6[Integer, String, String, Date, Integer, String] ]
  }

  override def valuesRow : Row6[Integer, String, String, Date, Integer, String] = {
    super.valuesRow.asInstanceOf[ Row6[Integer, String, String, Date, Integer, String] ]
  }
  override def field1 : Field[Integer] = TAuthor.T_AUTHOR.ID
  override def field2 : Field[String] = TAuthor.T_AUTHOR.FIRST_NAME
  override def field3 : Field[String] = TAuthor.T_AUTHOR.LAST_NAME
  override def field4 : Field[Date] = TAuthor.T_AUTHOR.DATE_OF_BIRTH
  override def field5 : Field[Integer] = TAuthor.T_AUTHOR.YEAR_OF_BIRTH
  override def field6 : Field[String] = TAuthor.T_AUTHOR.ADDRESS
  override def component1 : Integer = getId
  override def component2 : String = getFirstName
  override def component3 : String = getLastName
  override def component4 : Date = getDateOfBirth
  override def component5 : Integer = getYearOfBirth
  override def component6 : String = getAddress
  override def value1 : Integer = getId
  override def value2 : String = getFirstName
  override def value3 : String = getLastName
  override def value4 : Date = getDateOfBirth
  override def value5 : Integer = getYearOfBirth
  override def value6 : String = getAddress

  override def value1(value : Integer) : TAuthorRecord = {
    setId(value)
    this
  }

  override def value2(value : String) : TAuthorRecord = {
    setFirstName(value)
    this
  }

  override def value3(value : String) : TAuthorRecord = {
    setLastName(value)
    this
  }

  override def value4(value : Date) : TAuthorRecord = {
    setDateOfBirth(value)
    this
  }

  override def value5(value : Integer) : TAuthorRecord = {
    setYearOfBirth(value)
    this
  }

  override def value6(value : String) : TAuthorRecord = {
    setAddress(value)
    this
  }

  override def values(value1 : Integer, value2 : String, value3 : String, value4 : Date, value5 : Integer, value6 : String) : TAuthorRecord = {
    this.value1(value1)
    this.value2(value2)
    this.value3(value3)
    this.value4(value4)
    this.value5(value5)
    this.value6(value6)
    this
  }

  /**
   * Create a detached, initialised TAuthorRecord
   */
  def this(id : Integer, firstName : String, lastName : String, dateOfBirth : Date, yearOfBirth : Integer, address : String) = {
    this()

    set(0, id)
    set(1, firstName)
    set(2, lastName)
    set(3, dateOfBirth)
    set(4, yearOfBirth)
    set(5, address)
  }
}