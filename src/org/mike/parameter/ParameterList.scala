package org.mike.parameter

import collection.mutable

class ParameterList[P <: ParameterSet] {
  
  //type PTuple[T] <: Tuple2[P#Val[T], T]
  
  private val values = new mutable.HashMap[P#Val[Any], Any]()
  
  def update[T <: Any](param: P#Val[T], value: T): Unit = { values(param) = value }
  
  def apply[T <: Any](key: P#Val[T]): T = values.get(key).asInstanceOf[Option[T]] match {
	  case None => values.default(key).asInstanceOf[T]
	  case Some(value) => value
  }
  
  def put[T <: Any]( param : P#Val[T], value : T ) : ParameterList[P] = { values(param) = value; this }

  override def toString  = getClass.getSimpleName + values.mkString("[",", ", "]")
}

object ParameterList { 

  def apply[P <: ParameterSet] : ParameterList[P] = new ParameterList[P]
  
  def apply[P <: ParameterSet, T <: Any](elems : Tuple2[P#Val[T], T]): ParameterList[P] = 
    apply[P].put(elems._1, elems._2)
}
