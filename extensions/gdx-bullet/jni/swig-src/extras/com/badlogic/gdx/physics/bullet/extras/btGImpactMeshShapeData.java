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

public class btGImpactMeshShapeData extends BulletBase {
	private long swigCPtr;
	
	protected btGImpactMeshShapeData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btGImpactMeshShapeData, normally you should not need this constructor it's intended for low-level usage. */ 
	public btGImpactMeshShapeData(long cPtr, boolean cMemoryOwn) {
		this("btGImpactMeshShapeData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btGImpactMeshShapeData obj) {
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
				ExtrasJNI.delete_btGImpactMeshShapeData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setCollisionShapeData(btCollisionShapeData value) {
    ExtrasJNI.btGImpactMeshShapeData_collisionShapeData_set(swigCPtr, this, btCollisionShapeData.getCPtr(value), value);
  }

  public btCollisionShapeData getCollisionShapeData() {
    long cPtr = ExtrasJNI.btGImpactMeshShapeData_collisionShapeData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btCollisionShapeData(cPtr, false);
  }

  public void setMeshInterface(btStridingMeshInterfaceData value) {
    ExtrasJNI.btGImpactMeshShapeData_meshInterface_set(swigCPtr, this, btStridingMeshInterfaceData.getCPtr(value), value);
  }

  public btStridingMeshInterfaceData getMeshInterface() {
    long cPtr = ExtrasJNI.btGImpactMeshShapeData_meshInterface_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btStridingMeshInterfaceData(cPtr, false);
  }

  public void setLocalScaling(btVector3FloatData value) {
    ExtrasJNI.btGImpactMeshShapeData_localScaling_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getLocalScaling() {
    long cPtr = ExtrasJNI.btGImpactMeshShapeData_localScaling_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setCollisionMargin(float value) {
    ExtrasJNI.btGImpactMeshShapeData_collisionMargin_set(swigCPtr, this, value);
  }

  public float getCollisionMargin() {
    return ExtrasJNI.btGImpactMeshShapeData_collisionMargin_get(swigCPtr, this);
  }

  public void setGimpactSubType(int value) {
    ExtrasJNI.btGImpactMeshShapeData_gimpactSubType_set(swigCPtr, this, value);
  }

  public int getGimpactSubType() {
    return ExtrasJNI.btGImpactMeshShapeData_gimpactSubType_get(swigCPtr, this);
  }

  public btGImpactMeshShapeData() {
    this(ExtrasJNI.new_btGImpactMeshShapeData(), true);
  }

}
