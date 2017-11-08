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

public class btTriangleInfoMapData extends BulletBase {
	private long swigCPtr;
	
	protected btTriangleInfoMapData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btTriangleInfoMapData, normally you should not need this constructor it's intended for low-level usage. */ 
	public btTriangleInfoMapData(long cPtr, boolean cMemoryOwn) {
		this("btTriangleInfoMapData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btTriangleInfoMapData obj) {
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
				ExtrasJNI.delete_btTriangleInfoMapData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setHashTablePtr(java.nio.IntBuffer value) {
    assert value.isDirect() : "Buffer must be allocated direct.";
    {
      ExtrasJNI.btTriangleInfoMapData_hashTablePtr_set(swigCPtr, this, value);
    }
  }

  public java.nio.IntBuffer getHashTablePtr() {
    return ExtrasJNI.btTriangleInfoMapData_hashTablePtr_get(swigCPtr, this);
}

  public void setNextPtr(java.nio.IntBuffer value) {
    assert value.isDirect() : "Buffer must be allocated direct.";
    {
      ExtrasJNI.btTriangleInfoMapData_nextPtr_set(swigCPtr, this, value);
    }
  }

  public java.nio.IntBuffer getNextPtr() {
    return ExtrasJNI.btTriangleInfoMapData_nextPtr_get(swigCPtr, this);
}

  public void setValueArrayPtr(btTriangleInfoData value) {
    ExtrasJNI.btTriangleInfoMapData_valueArrayPtr_set(swigCPtr, this, btTriangleInfoData.getCPtr(value), value);
  }

  public btTriangleInfoData getValueArrayPtr() {
    long cPtr = ExtrasJNI.btTriangleInfoMapData_valueArrayPtr_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTriangleInfoData(cPtr, false);
  }

  public void setKeyArrayPtr(java.nio.IntBuffer value) {
    assert value.isDirect() : "Buffer must be allocated direct.";
    {
      ExtrasJNI.btTriangleInfoMapData_keyArrayPtr_set(swigCPtr, this, value);
    }
  }

  public java.nio.IntBuffer getKeyArrayPtr() {
    return ExtrasJNI.btTriangleInfoMapData_keyArrayPtr_get(swigCPtr, this);
}

  public void setConvexEpsilon(float value) {
    ExtrasJNI.btTriangleInfoMapData_convexEpsilon_set(swigCPtr, this, value);
  }

  public float getConvexEpsilon() {
    return ExtrasJNI.btTriangleInfoMapData_convexEpsilon_get(swigCPtr, this);
  }

  public void setPlanarEpsilon(float value) {
    ExtrasJNI.btTriangleInfoMapData_planarEpsilon_set(swigCPtr, this, value);
  }

  public float getPlanarEpsilon() {
    return ExtrasJNI.btTriangleInfoMapData_planarEpsilon_get(swigCPtr, this);
  }

  public void setEqualVertexThreshold(float value) {
    ExtrasJNI.btTriangleInfoMapData_equalVertexThreshold_set(swigCPtr, this, value);
  }

  public float getEqualVertexThreshold() {
    return ExtrasJNI.btTriangleInfoMapData_equalVertexThreshold_get(swigCPtr, this);
  }

  public void setEdgeDistanceThreshold(float value) {
    ExtrasJNI.btTriangleInfoMapData_edgeDistanceThreshold_set(swigCPtr, this, value);
  }

  public float getEdgeDistanceThreshold() {
    return ExtrasJNI.btTriangleInfoMapData_edgeDistanceThreshold_get(swigCPtr, this);
  }

  public void setZeroAreaThreshold(float value) {
    ExtrasJNI.btTriangleInfoMapData_zeroAreaThreshold_set(swigCPtr, this, value);
  }

  public float getZeroAreaThreshold() {
    return ExtrasJNI.btTriangleInfoMapData_zeroAreaThreshold_get(swigCPtr, this);
  }

  public void setNextSize(int value) {
    ExtrasJNI.btTriangleInfoMapData_nextSize_set(swigCPtr, this, value);
  }

  public int getNextSize() {
    return ExtrasJNI.btTriangleInfoMapData_nextSize_get(swigCPtr, this);
  }

  public void setHashTableSize(int value) {
    ExtrasJNI.btTriangleInfoMapData_hashTableSize_set(swigCPtr, this, value);
  }

  public int getHashTableSize() {
    return ExtrasJNI.btTriangleInfoMapData_hashTableSize_get(swigCPtr, this);
  }

  public void setNumValues(int value) {
    ExtrasJNI.btTriangleInfoMapData_numValues_set(swigCPtr, this, value);
  }

  public int getNumValues() {
    return ExtrasJNI.btTriangleInfoMapData_numValues_get(swigCPtr, this);
  }

  public void setNumKeys(int value) {
    ExtrasJNI.btTriangleInfoMapData_numKeys_set(swigCPtr, this, value);
  }

  public int getNumKeys() {
    return ExtrasJNI.btTriangleInfoMapData_numKeys_get(swigCPtr, this);
  }

  public void setPadding(String value) {
    ExtrasJNI.btTriangleInfoMapData_padding_set(swigCPtr, this, value);
  }

  public String getPadding() {
    return ExtrasJNI.btTriangleInfoMapData_padding_get(swigCPtr, this);
  }

  public btTriangleInfoMapData() {
    this(ExtrasJNI.new_btTriangleInfoMapData(), true);
  }

}
