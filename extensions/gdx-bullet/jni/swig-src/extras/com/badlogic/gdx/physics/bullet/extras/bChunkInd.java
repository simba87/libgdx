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

public class bChunkInd extends BulletBase {
	private long swigCPtr;
	
	protected bChunkInd(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new bChunkInd, normally you should not need this constructor it's intended for low-level usage. */ 
	public bChunkInd(long cPtr, boolean cMemoryOwn) {
		this("bChunkInd", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(bChunkInd obj) {
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
				ExtrasJNI.delete_bChunkInd(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public bChunkInd() {
    this(ExtrasJNI.new_bChunkInd(), true);
  }

  public void setCode(int value) {
    ExtrasJNI.bChunkInd_code_set(swigCPtr, this, value);
  }

  public int getCode() {
    return ExtrasJNI.bChunkInd_code_get(swigCPtr, this);
  }

  public void setLen(int value) {
    ExtrasJNI.bChunkInd_len_set(swigCPtr, this, value);
  }

  public int getLen() {
    return ExtrasJNI.bChunkInd_len_get(swigCPtr, this);
  }

  public void setOldPtr(long value) {
    ExtrasJNI.bChunkInd_oldPtr_set(swigCPtr, this, value);
  }

  public long getOldPtr() {
    return ExtrasJNI.bChunkInd_oldPtr_get(swigCPtr, this);
  }

  public void setDna_nr(int value) {
    ExtrasJNI.bChunkInd_dna_nr_set(swigCPtr, this, value);
  }

  public int getDna_nr() {
    return ExtrasJNI.bChunkInd_dna_nr_get(swigCPtr, this);
  }

  public void setNr(int value) {
    ExtrasJNI.bChunkInd_nr_set(swigCPtr, this, value);
  }

  public int getNr() {
    return ExtrasJNI.bChunkInd_nr_get(swigCPtr, this);
  }

}
