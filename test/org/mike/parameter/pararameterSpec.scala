package org.mike.parameter

import org.specs.runner.JUnitSuiteRunner
import org.specs.Specification
import org.junit.runner.RunWith
import org.specs.SpecificationWithJUnit
import org.mike.datatypes.Person

@RunWith(classOf[JUnitSuiteRunner])
class pararameterSpec extends SpecificationWithJUnit {
	
	"A parameter set" should {
	  "have one Val per defined parameter" in {
	    Person.values must have size(3)
	  }
	}
}