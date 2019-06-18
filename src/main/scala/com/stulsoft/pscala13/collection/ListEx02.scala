/*
 * Copyright (c) 2019. Yuriy Stul 
 */

package com.stulsoft.pscala13.collection

/**
  * @author Yuriy Stul
  */
object ListEx02 extends App {
  test1()

  def test1(): Unit = {
    println("==>test1")
    val l = List(1, 2, 3)
    println(s"l.lengthIs: ${l.lengthIs}")

    println(s"l.lengthIs.<(15) = ${l.lengthIs.<(15)}")
    println(s"l.lengthIs < 15 = ${l.lengthIs < 15}")
    println(s"l.length < 15 = ${l.length < 15}")


    println("<==test1")
  }
}