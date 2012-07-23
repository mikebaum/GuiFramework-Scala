package org.mike.datatypes

import org.mike.parameter.ParameterSet
import org.mike.parameter.ParameterList

protected class Address extends ParameterSet {
  sealed trait Val[T] extends Parameter[T]
  type PSET = Address
}

object Address extends Address {
  case object COUNTRY extends Val[String]
  case object PROVINCE extends Val[String]
  case object CITY extends Val[String]
}