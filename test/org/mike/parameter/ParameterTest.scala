package org.mike.parameter

import org.mike.datatypes.Person
import org.mike.datatypes.Person.AGE
import org.mike.datatypes.Person.FIRST_NAME
import org.mike.datatypes.Person.LAST_NAME
import org.mike.datatypes.Address
import org.mike.datatypes.Address._


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
      
    val house = Address()  
    house(COUNTRY) = "Canada"
    house(PROVINCE) = "Quebec"
    house(CITY) = "Notre-Dame-de-L'Ile-Perrot"
      
    println(house(Address.COUNTRY))
    
    format(Person.FIRST_NAME)
  }

  def format( field : Person.Val[_] ) = field match {
    case FIRST_NAME => println("First Name:" + field)
    case LAST_NAME => println("Last Name:" + field)
    case AGE => println("Age: " + field)
  }
}
