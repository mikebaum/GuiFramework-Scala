package org.mike.datatypes

import org.mike.parameter.ParameterSet


class Person extends ParameterSet {
	sealed trait Val[T] extends Parameter[T]
}

object Person extends Person {
  case object FIRST_NAME extends Val[String]
  case object LAST_NAME extends Val[String]
  case object AGE extends Val[Int]
}
