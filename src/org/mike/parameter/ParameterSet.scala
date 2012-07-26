package org.mike.parameter

trait ParameterSet {
  type Val[T] <: Parameter[T]
  type PSET <: ParameterSet

  protected trait Parameter[T] {
    self: Val[T] => _values += this
    println( "added: " + this + " to " + ParameterSet.this )
  }

  private var _values = Set.empty[Val[_]]
  def values = _values
  
  def apply() : ParameterList[PSET] = ParameterList[PSET]
}