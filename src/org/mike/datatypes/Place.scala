package org.mike.datatypes

import org.mike.parameter.ParameterSet
import org.mike.parameter.ParameterList

abstract class Place extends ParameterSet[Place] {
  sealed trait Val[T] extends Parameter[T]
}

object Place extends Place {
  case object COUNTRY extends Val[String]
  case object PROVINCE extends Val[String]
  def apply() : ParameterList[Place] = ParameterList[Place]
}