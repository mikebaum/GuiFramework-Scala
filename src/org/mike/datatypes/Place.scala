package org.mike.datatypes

import org.mike.parameter.ParameterSet
import org.mike.parameter.ParameterList

abstract class Place extends ParameterSet {
  sealed trait Val[T] extends Parameter[T]
  type PSET = Place
}

object Place extends Place {
  case object COUNTRY extends Val[String]
  case object PROVINCE extends Val[String]
}