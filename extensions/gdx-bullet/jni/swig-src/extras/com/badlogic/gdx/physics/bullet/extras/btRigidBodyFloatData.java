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

public class btRigidBodyFloatData extends BulletBase {
	private long swigCPtr;
	
	protected btRigidBodyFloatData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btRigidBodyFloatData, normally you should not need this constructor it's intended for low-level usage. */ 
	public btRigidBodyFloatData(long cPtr, boolean cMemoryOwn) {
		this("btRigidBodyFloatData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btRigidBodyFloatData obj) {
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
				ExtrasJNI.delete_btRigidBodyFloatData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setCollisionObjectData(btCollisionObjectFloatData value) {
    ExtrasJNI.btRigidBodyFloatData_collisionObjectData_set(swigCPtr, this, btCollisionObjectFloatData.getCPtr(value), value);
  }

  public btCollisionObjectFloatData getCollisionObjectData() {
    long cPtr = ExtrasJNI.btRigidBodyFloatData_collisionObjectData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btCollisionObjectFloatData(cPtr, false);
  }

  public void setInvInertiaTensorWorld(btMatrix3x3FloatData value) {
    ExtrasJNI.btRigidBodyFloatData_invInertiaTensorWorld_set(swigCPtr, this, btMatrix3x3FloatData.getCPtr(value), value);
  }

  public btMatrix3x3FloatData getInvInertiaTensorWorld() {
    long cPtr = ExtrasJNI.btRigidBodyFloatData_invInertiaTensorWorld_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btMatrix3x3FloatData(cPtr, false);
  }

  public void setLinearVelocity(btVector3FloatData value) {
    ExtrasJNI.btRigidBodyFloatData_linearVelocity_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getLinearVelocity() {
    long cPtr = ExtrasJNI.btRigidBodyFloatData_linearVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setAngularVelocity(btVector3FloatData value) {
    ExtrasJNI.btRigidBodyFloatData_angularVelocity_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getAngularVelocity() {
    long cPtr = ExtrasJNI.btRigidBodyFloatData_angularVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setAngularFactor(btVector3FloatData value) {
    ExtrasJNI.btRigidBodyFloatData_angularFactor_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getAngularFactor() {
    long cPtr = ExtrasJNI.btRigidBodyFloatData_angularFactor_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setLinearFactor(btVector3FloatData value) {
    ExtrasJNI.btRigidBodyFloatData_linearFactor_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getLinearFactor() {
    long cPtr = ExtrasJNI.btRigidBodyFloatData_linearFactor_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setGravity(btVector3FloatData value) {
    ExtrasJNI.btRigidBodyFloatData_gravity_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getGravity() {
    long cPtr = ExtrasJNI.btRigidBodyFloatData_gravity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setGravity_acceleration(btVector3FloatData value) {
    ExtrasJNI.btRigidBodyFloatData_gravity_acceleration_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getGravity_acceleration() {
    long cPtr = ExtrasJNI.btRigidBodyFloatData_gravity_acceleration_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setInvInertiaLocal(btVector3FloatData value) {
    ExtrasJNI.btRigidBodyFloatData_invInertiaLocal_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getInvInertiaLocal() {
    long cPtr = ExtrasJNI.btRigidBodyFloatData_invInertiaLocal_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setTotalForce(btVector3FloatData value) {
    ExtrasJNI.btRigidBodyFloatData_totalForce_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getTotalForce() {
    long cPtr = ExtrasJNI.btRigidBodyFloatData_totalForce_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setTotalTorque(btVector3FloatData value) {
    ExtrasJNI.btRigidBodyFloatData_totalTorque_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getTotalTorque() {
    long cPtr = ExtrasJNI.btRigidBodyFloatData_totalTorque_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setInverseMass(float value) {
    ExtrasJNI.btRigidBodyFloatData_inverseMass_set(swigCPtr, this, value);
  }

  public float getInverseMass() {
    return ExtrasJNI.btRigidBodyFloatData_inverseMass_get(swigCPtr, this);
  }

  public void setLinearDamping(float value) {
    ExtrasJNI.btRigidBodyFloatData_linearDamping_set(swigCPtr, this, value);
  }

  public float getLinearDamping() {
    return ExtrasJNI.btRigidBodyFloatData_linearDamping_get(swigCPtr, this);
  }

  public void setAngularDamping(float value) {
    ExtrasJNI.btRigidBodyFloatData_angularDamping_set(swigCPtr, this, value);
  }

  public float getAngularDamping() {
    return ExtrasJNI.btRigidBodyFloatData_angularDamping_get(swigCPtr, this);
  }

  public void setAdditionalDampingFactor(float value) {
    ExtrasJNI.btRigidBodyFloatData_additionalDampingFactor_set(swigCPtr, this, value);
  }

  public float getAdditionalDampingFactor() {
    return ExtrasJNI.btRigidBodyFloatData_additionalDampingFactor_get(swigCPtr, this);
  }

  public void setAdditionalLinearDampingThresholdSqr(float value) {
    ExtrasJNI.btRigidBodyFloatData_additionalLinearDampingThresholdSqr_set(swigCPtr, this, value);
  }

  public float getAdditionalLinearDampingThresholdSqr() {
    return ExtrasJNI.btRigidBodyFloatData_additionalLinearDampingThresholdSqr_get(swigCPtr, this);
  }

  public void setAdditionalAngularDampingThresholdSqr(float value) {
    ExtrasJNI.btRigidBodyFloatData_additionalAngularDampingThresholdSqr_set(swigCPtr, this, value);
  }

  public float getAdditionalAngularDampingThresholdSqr() {
    return ExtrasJNI.btRigidBodyFloatData_additionalAngularDampingThresholdSqr_get(swigCPtr, this);
  }

  public void setAdditionalAngularDampingFactor(float value) {
    ExtrasJNI.btRigidBodyFloatData_additionalAngularDampingFactor_set(swigCPtr, this, value);
  }

  public float getAdditionalAngularDampingFactor() {
    return ExtrasJNI.btRigidBodyFloatData_additionalAngularDampingFactor_get(swigCPtr, this);
  }

  public void setLinearSleepingThreshold(float value) {
    ExtrasJNI.btRigidBodyFloatData_linearSleepingThreshold_set(swigCPtr, this, value);
  }

  public float getLinearSleepingThreshold() {
    return ExtrasJNI.btRigidBodyFloatData_linearSleepingThreshold_get(swigCPtr, this);
  }

  public void setAngularSleepingThreshold(float value) {
    ExtrasJNI.btRigidBodyFloatData_angularSleepingThreshold_set(swigCPtr, this, value);
  }

  public float getAngularSleepingThreshold() {
    return ExtrasJNI.btRigidBodyFloatData_angularSleepingThreshold_get(swigCPtr, this);
  }

  public void setAdditionalDamping(int value) {
    ExtrasJNI.btRigidBodyFloatData_additionalDamping_set(swigCPtr, this, value);
  }

  public int getAdditionalDamping() {
    return ExtrasJNI.btRigidBodyFloatData_additionalDamping_get(swigCPtr, this);
  }

  public btRigidBodyFloatData() {
    this(ExtrasJNI.new_btRigidBodyFloatData(), true);
  }

}
