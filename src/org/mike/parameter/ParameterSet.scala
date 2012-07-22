package org.mike.parameter

trait ParameterSet {
  type Val[T] <: Parameter[T]

  protected trait Parameter[T] {
    self: Val[T] => _values += this
  }

  private var _values = Set.empty[Val[_]]
  def values = _values
}