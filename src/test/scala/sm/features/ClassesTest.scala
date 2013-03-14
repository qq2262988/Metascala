package sm.features

import org.scalatest.FreeSpec
import sm.Util

class ClassesTest extends FreeSpec with Util{

  "classes" - {
    val tester = new Tester("sm.features.classes.ClassStuff")
    "customClass" in tester.run("customClass")
    "inheritence" in tester.run("inheritence")
    "constructor" in tester.run("constructor")
    "superConstructor" in tester.run("superConstructor")
    "override" in tester.run("override")
    "innerClass" in tester.run("innerClass")
  }
  "interfaces" - {

    val tester = new Tester("sm.features.classes.Interfaces")
    "implement" in tester.run("implement", 10)
    "abstractClass" in tester.run("abstractClass")
    "shadowedInheritedGet" in tester.run("shadowedInheritedGet")
    "shadowedInheritedSet" in tester.run("shadowedInheritedSet")
  }
}
