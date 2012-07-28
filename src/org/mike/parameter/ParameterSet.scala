package org.mike.parameter

trait ParameterSet {
  type Val[T] <: Parameter[T]
  type PSET <: ParameterSet

  protected trait Parameter[T]

  lazy protected val _values = buildVals
  def values = _values
  
  // override and create a set containing all the defined Vals
  protected def buildVals : Set[Val[_]]
  
  def apply() : ParameterList[PSET] = ParameterList[PSET]
}