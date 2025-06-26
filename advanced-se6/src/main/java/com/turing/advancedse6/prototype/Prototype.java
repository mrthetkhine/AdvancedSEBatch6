package com.turing.advancedse6.prototype;

public interface Prototype extends Cloneable {
	Prototype reproduce()throws CloneNotSupportedException;
}
