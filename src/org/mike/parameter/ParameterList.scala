package org.mike.parameter

import collection.mutable

case class TypeTuple2[S,T0[S0]](val _1 : T0[S], val _2 : S) {
  override def toString = "(" + _1 + ", " + _2 + ")"
}

class ParameterList[P <: ParameterSet] {
  
  type K[SO] = P#Val[SO]
  
  private val values = new mutable.HashMap[K[_], Any]()
  
  def apply[S](key: K[S]): S = get(key).get
  
  def get[S](key : K[S]) : Option[S] = values.get(key).asInstanceOf[Option[S]]
  
  def update[S](key : K[S], element : S) : Unit = values.update(key, element)
  
  def foreach(f : Function[TypeTuple2[_,K], Unit]) : Unit = values.foreach {
	  case (k,e) => f(TypeTuple2[Any,K](k.asInstanceOf[K[Any]],e))
  }
  
  def put[S]( param : K[S], value : S ) : ParameterList[P] = { values(param) = value; this }

  override def toString  = getClass.getSimpleName + values.mkString("[",", ", "]")
}

object ParameterList { 

  def apply[P <: ParameterSet] : ParameterList[P] = new ParameterList[P]
  
//  def apply[P <: ParameterSet](elem : TypeTuple2[_, P#Val]) : ParameterList[P#Val] = 
//    apply[P]().put(elem._1, elem._2)
}
