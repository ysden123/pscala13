/*
 * Copyright (c) 2019. Yuriy Stul
 */

package com.stulsoft.pscala13.collection

/** List is abstract class
  *
  * @author Yuriy Stul
  */
object ListEx01 extends App {
  test1()
  test2()
  test3()

  def test1(): Unit = {
    println("==>test1")
    val l1 = List(1, 2, 3) // calls companion apply method
    println(s"l1: $l1")
    println("<==test1")
  }

  def test2(): Unit = {
    println("==>test2")
    val l2 = 1 :: 2 :: 3 :: Nil // usage of "::" operator and Nil
    println(s"l2: $l2")
    println("<==test2")
  }

  def test3(): Unit ={
    println("==>test3")
    val l = List(1,2,3)
    println(s"l.lengthIs: ${l.lengthIs}")

    println("<==test3")
  }
}
