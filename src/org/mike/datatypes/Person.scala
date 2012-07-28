package org.mike.datatypes

import org.mike.parameter.ParameterSet


abstract protected class Person extends ParameterSet {
	sealed trait Val[T] extends Parameter[T]
	type PSET = Person
}

object Person extends Person { 
  case object FIRST_NAME extends Val[String]
  case object LAST_NAME extends Val[String]
  case object AGE extends Val[Int]
  
  override def buildVals = Set(FIRST_NAME, LAST_NAME, AGE)
}
