package org.mike.parameter

import org.mike.datatypes.Person
import org.mike.datatypes.Person.AGE
import org.mike.datatypes.Person.FIRST_NAME
import org.mike.datatypes.Person.LAST_NAME
import org.mike.datatypes.Place

object EnumTest {
  def main( args: Array[String] )
  {
    val mike = Person()
    
    mike(FIRST_NAME) = "mike" 
    mike(LAST_NAME) = "baum"
    mike(AGE) = 38
    
    println(mike(FIRST_NAME))
    
    val lucy = Person()
    
    lucy(FIRST_NAME) = "Lucy"
      
    val house = Place()  
    house(Place.COUNTRY) = "Canada"
    house(Place.PROVINCE) = "Quebec"
      
    println(house(Place.COUNTRY))
    
    format(Person.FIRST_NAME)
  }

  def format( field : Person.Val[_] ) = field match {
    case FIRST_NAME => println("First Name:" + field)
    case LAST_NAME => println("Last Name:" + field)
    case AGE => println("Age: " + field)
  }
}
