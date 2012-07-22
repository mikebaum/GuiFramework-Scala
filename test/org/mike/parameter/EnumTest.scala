package org.mike.parameter

import org.mike.datatypes.Person
import org.mike.datatypes.Person.AGE
import org.mike.datatypes.Person.FIRST_NAME
import org.mike.datatypes.Person.LAST_NAME

object EnumTest {
  def main( args: Array[String] )
  {
    val mike = ParameterList[Person]
    
    mike(FIRST_NAME) = "mike" 
    mike(LAST_NAME) = "baum"
    mike(AGE) = 38
    
    println(mike(FIRST_NAME))
    
    val lucy = ParameterList[Person, String]( FIRST_NAME -> "Lucy" )
    
    println(lucy(FIRST_NAME))
  }

  def format( field : Person.Val[_] ) = field match {
    case FIRST_NAME => println("First Name")
  }
}
