/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.extras;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.physics.bullet.dynamics.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.physics.bullet.inversedynamics.MultiBodyTree;
import com.badlogic.gdx.physics.bullet.dynamics.btDynamicsWorld;
import com.badlogic.gdx.physics.bullet.dynamics.btContactSolverInfo;
import com.badlogic.gdx.physics.bullet.collision.btCollisionShape;

public class bDNA extends BulletBase {
	private long swigCPtr;
	
	protected bDNA(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new bDNA, normally you should not need this constructor it's intended for low-level usage. */ 
	public bDNA(long cPtr, boolean cMemoryOwn) {
		this("bDNA", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(bDNA obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				ExtrasJNI.delete_bDNA(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public bDNA() {
    this(ExtrasJNI.new_bDNA(), true);
  }

  public void init(String data, int len, boolean swap) {
    ExtrasJNI.bDNA_init__SWIG_0(swigCPtr, this, data, len, swap);
  }

  public void init(String data, int len) {
    ExtrasJNI.bDNA_init__SWIG_1(swigCPtr, this, data, len);
  }

  public int getArraySize(String str) {
    return ExtrasJNI.bDNA_getArraySize(swigCPtr, this, str);
  }

  public int getArraySizeNew(short name) {
    return ExtrasJNI.bDNA_getArraySizeNew(swigCPtr, this, name);
  }

  public int getElementSize(short type, short name) {
    return ExtrasJNI.bDNA_getElementSize(swigCPtr, this, type, name);
  }

  public int getNumNames() {
    return ExtrasJNI.bDNA_getNumNames(swigCPtr, this);
  }

  public String getName(int ind) {
    return ExtrasJNI.bDNA_getName(swigCPtr, this, ind);
  }

  public String getType(int ind) {
    return ExtrasJNI.bDNA_getType(swigCPtr, this, ind);
  }

  public java.nio.ShortBuffer getStruct(int ind) {
    return ExtrasJNI.bDNA_getStruct(swigCPtr, this, ind);
}

  public short getLength(int ind) {
    return ExtrasJNI.bDNA_getLength(swigCPtr, this, ind);
  }

  public int getReverseType(short type) {
    return ExtrasJNI.bDNA_getReverseType__SWIG_0(swigCPtr, this, type);
  }

  public int getReverseType(String type) {
    return ExtrasJNI.bDNA_getReverseType__SWIG_1(swigCPtr, this, type);
  }

  public int getNumStructs() {
    return ExtrasJNI.bDNA_getNumStructs(swigCPtr, this);
  }

  public boolean lessThan(bDNA other) {
    return ExtrasJNI.bDNA_lessThan(swigCPtr, this, bDNA.getCPtr(other), other);
  }

  public void initCmpFlags(bDNA memDNA) {
    ExtrasJNI.bDNA_initCmpFlags(swigCPtr, this, bDNA.getCPtr(memDNA), memDNA);
  }

  public boolean flagNotEqual(int dna_nr) {
    return ExtrasJNI.bDNA_flagNotEqual(swigCPtr, this, dna_nr);
  }

  public boolean flagEqual(int dna_nr) {
    return ExtrasJNI.bDNA_flagEqual(swigCPtr, this, dna_nr);
  }

  public boolean flagNone(int dna_nr) {
    return ExtrasJNI.bDNA_flagNone(swigCPtr, this, dna_nr);
  }

  public int getPointerSize() {
    return ExtrasJNI.bDNA_getPointerSize(swigCPtr, this);
  }

  public void dumpTypeDefinitions() {
    ExtrasJNI.bDNA_dumpTypeDefinitions(swigCPtr, this);
  }

}
