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

public class btMultiBodyLinkFloatData extends BulletBase {
	private long swigCPtr;
	
	protected btMultiBodyLinkFloatData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btMultiBodyLinkFloatData, normally you should not need this constructor it's intended for low-level usage. */ 
	public btMultiBodyLinkFloatData(long cPtr, boolean cMemoryOwn) {
		this("btMultiBodyLinkFloatData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btMultiBodyLinkFloatData obj) {
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
				ExtrasJNI.delete_btMultiBodyLinkFloatData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setZeroRotParentToThis(btQuaternionFloatData value) {
    ExtrasJNI.btMultiBodyLinkFloatData_zeroRotParentToThis_set(swigCPtr, this, btQuaternionFloatData.getCPtr(value), value);
  }

  public btQuaternionFloatData getZeroRotParentToThis() {
    long cPtr = ExtrasJNI.btMultiBodyLinkFloatData_zeroRotParentToThis_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btQuaternionFloatData(cPtr, false);
  }

  public void setParentComToThisComOffset(btVector3FloatData value) {
    ExtrasJNI.btMultiBodyLinkFloatData_parentComToThisComOffset_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getParentComToThisComOffset() {
    long cPtr = ExtrasJNI.btMultiBodyLinkFloatData_parentComToThisComOffset_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setThisPivotToThisComOffset(btVector3FloatData value) {
    ExtrasJNI.btMultiBodyLinkFloatData_thisPivotToThisComOffset_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getThisPivotToThisComOffset() {
    long cPtr = ExtrasJNI.btMultiBodyLinkFloatData_thisPivotToThisComOffset_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setJointAxisTop(btVector3FloatData value) {
    ExtrasJNI.btMultiBodyLinkFloatData_jointAxisTop_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getJointAxisTop() {
    long cPtr = ExtrasJNI.btMultiBodyLinkFloatData_jointAxisTop_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setJointAxisBottom(btVector3FloatData value) {
    ExtrasJNI.btMultiBodyLinkFloatData_jointAxisBottom_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getJointAxisBottom() {
    long cPtr = ExtrasJNI.btMultiBodyLinkFloatData_jointAxisBottom_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setLinkInertia(btVector3FloatData value) {
    ExtrasJNI.btMultiBodyLinkFloatData_linkInertia_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getLinkInertia() {
    long cPtr = ExtrasJNI.btMultiBodyLinkFloatData_linkInertia_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setDofCount(int value) {
    ExtrasJNI.btMultiBodyLinkFloatData_dofCount_set(swigCPtr, this, value);
  }

  public int getDofCount() {
    return ExtrasJNI.btMultiBodyLinkFloatData_dofCount_get(swigCPtr, this);
  }

  public void setLinkMass(float value) {
    ExtrasJNI.btMultiBodyLinkFloatData_linkMass_set(swigCPtr, this, value);
  }

  public float getLinkMass() {
    return ExtrasJNI.btMultiBodyLinkFloatData_linkMass_get(swigCPtr, this);
  }

  public void setParentIndex(int value) {
    ExtrasJNI.btMultiBodyLinkFloatData_parentIndex_set(swigCPtr, this, value);
  }

  public int getParentIndex() {
    return ExtrasJNI.btMultiBodyLinkFloatData_parentIndex_get(swigCPtr, this);
  }

  public void setJointType(int value) {
    ExtrasJNI.btMultiBodyLinkFloatData_jointType_set(swigCPtr, this, value);
  }

  public int getJointType() {
    return ExtrasJNI.btMultiBodyLinkFloatData_jointType_get(swigCPtr, this);
  }

  public void setJointPos(float[] value) {
    ExtrasJNI.btMultiBodyLinkFloatData_jointPos_set(swigCPtr, this, value);
  }

  public float[] getJointPos() {
    return ExtrasJNI.btMultiBodyLinkFloatData_jointPos_get(swigCPtr, this);
}

  public void setJointVel(float[] value) {
    ExtrasJNI.btMultiBodyLinkFloatData_jointVel_set(swigCPtr, this, value);
  }

  public float[] getJointVel() {
    return ExtrasJNI.btMultiBodyLinkFloatData_jointVel_get(swigCPtr, this);
}

  public void setJointTorque(float[] value) {
    ExtrasJNI.btMultiBodyLinkFloatData_jointTorque_set(swigCPtr, this, value);
  }

  public float[] getJointTorque() {
    return ExtrasJNI.btMultiBodyLinkFloatData_jointTorque_get(swigCPtr, this);
}

  public void setPosVarCount(int value) {
    ExtrasJNI.btMultiBodyLinkFloatData_posVarCount_set(swigCPtr, this, value);
  }

  public int getPosVarCount() {
    return ExtrasJNI.btMultiBodyLinkFloatData_posVarCount_get(swigCPtr, this);
  }

  public void setJointDamping(float value) {
    ExtrasJNI.btMultiBodyLinkFloatData_jointDamping_set(swigCPtr, this, value);
  }

  public float getJointDamping() {
    return ExtrasJNI.btMultiBodyLinkFloatData_jointDamping_get(swigCPtr, this);
  }

  public void setJointFriction(float value) {
    ExtrasJNI.btMultiBodyLinkFloatData_jointFriction_set(swigCPtr, this, value);
  }

  public float getJointFriction() {
    return ExtrasJNI.btMultiBodyLinkFloatData_jointFriction_get(swigCPtr, this);
  }

  public void setJointLowerLimit(float value) {
    ExtrasJNI.btMultiBodyLinkFloatData_jointLowerLimit_set(swigCPtr, this, value);
  }

  public float getJointLowerLimit() {
    return ExtrasJNI.btMultiBodyLinkFloatData_jointLowerLimit_get(swigCPtr, this);
  }

  public void setJointUpperLimit(float value) {
    ExtrasJNI.btMultiBodyLinkFloatData_jointUpperLimit_set(swigCPtr, this, value);
  }

  public float getJointUpperLimit() {
    return ExtrasJNI.btMultiBodyLinkFloatData_jointUpperLimit_get(swigCPtr, this);
  }

  public void setJointMaxForce(float value) {
    ExtrasJNI.btMultiBodyLinkFloatData_jointMaxForce_set(swigCPtr, this, value);
  }

  public float getJointMaxForce() {
    return ExtrasJNI.btMultiBodyLinkFloatData_jointMaxForce_get(swigCPtr, this);
  }

  public void setJointMaxVelocity(float value) {
    ExtrasJNI.btMultiBodyLinkFloatData_jointMaxVelocity_set(swigCPtr, this, value);
  }

  public float getJointMaxVelocity() {
    return ExtrasJNI.btMultiBodyLinkFloatData_jointMaxVelocity_get(swigCPtr, this);
  }

  public void setLinkName(String value) {
    ExtrasJNI.btMultiBodyLinkFloatData_linkName_set(swigCPtr, this, value);
  }

  public String getLinkName() {
    return ExtrasJNI.btMultiBodyLinkFloatData_linkName_get(swigCPtr, this);
  }

  public void setJointName(String value) {
    ExtrasJNI.btMultiBodyLinkFloatData_jointName_set(swigCPtr, this, value);
  }

  public String getJointName() {
    return ExtrasJNI.btMultiBodyLinkFloatData_jointName_get(swigCPtr, this);
  }

  public void setLinkCollider(btCollisionObjectFloatData value) {
    ExtrasJNI.btMultiBodyLinkFloatData_linkCollider_set(swigCPtr, this, btCollisionObjectFloatData.getCPtr(value), value);
  }

  public btCollisionObjectFloatData getLinkCollider() {
    long cPtr = ExtrasJNI.btMultiBodyLinkFloatData_linkCollider_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btCollisionObjectFloatData(cPtr, false);
  }

  public void setPaddingPtr(String value) {
    ExtrasJNI.btMultiBodyLinkFloatData_paddingPtr_set(swigCPtr, this, value);
  }

  public String getPaddingPtr() {
    return ExtrasJNI.btMultiBodyLinkFloatData_paddingPtr_get(swigCPtr, this);
  }

  public btMultiBodyLinkFloatData() {
    this(ExtrasJNI.new_btMultiBodyLinkFloatData(), true);
  }

}
