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

public class btCollisionObjectFloatData extends BulletBase {
	private long swigCPtr;
	
	protected btCollisionObjectFloatData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btCollisionObjectFloatData, normally you should not need this constructor it's intended for low-level usage. */ 
	public btCollisionObjectFloatData(long cPtr, boolean cMemoryOwn) {
		this("btCollisionObjectFloatData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btCollisionObjectFloatData obj) {
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
				ExtrasJNI.delete_btCollisionObjectFloatData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setBroadphaseHandle(long value) {
    ExtrasJNI.btCollisionObjectFloatData_broadphaseHandle_set(swigCPtr, this, value);
  }

  public long getBroadphaseHandle() {
    return ExtrasJNI.btCollisionObjectFloatData_broadphaseHandle_get(swigCPtr, this);
  }

  public void setCollisionShape(long value) {
    ExtrasJNI.btCollisionObjectFloatData_collisionShape_set(swigCPtr, this, value);
  }

  public long getCollisionShape() {
    return ExtrasJNI.btCollisionObjectFloatData_collisionShape_get(swigCPtr, this);
  }

  public void setRootCollisionShape(btCollisionShapeData value) {
    ExtrasJNI.btCollisionObjectFloatData_rootCollisionShape_set(swigCPtr, this, btCollisionShapeData.getCPtr(value), value);
  }

  public btCollisionShapeData getRootCollisionShape() {
    long cPtr = ExtrasJNI.btCollisionObjectFloatData_rootCollisionShape_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btCollisionShapeData(cPtr, false);
  }

  public void setName(String value) {
    ExtrasJNI.btCollisionObjectFloatData_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return ExtrasJNI.btCollisionObjectFloatData_name_get(swigCPtr, this);
  }

  public void setWorldTransform(btTransformFloatData value) {
    ExtrasJNI.btCollisionObjectFloatData_worldTransform_set(swigCPtr, this, btTransformFloatData.getCPtr(value), value);
  }

  public btTransformFloatData getWorldTransform() {
    long cPtr = ExtrasJNI.btCollisionObjectFloatData_worldTransform_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransformFloatData(cPtr, false);
  }

  public void setInterpolationWorldTransform(btTransformFloatData value) {
    ExtrasJNI.btCollisionObjectFloatData_interpolationWorldTransform_set(swigCPtr, this, btTransformFloatData.getCPtr(value), value);
  }

  public btTransformFloatData getInterpolationWorldTransform() {
    long cPtr = ExtrasJNI.btCollisionObjectFloatData_interpolationWorldTransform_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransformFloatData(cPtr, false);
  }

  public void setInterpolationLinearVelocity(btVector3FloatData value) {
    ExtrasJNI.btCollisionObjectFloatData_interpolationLinearVelocity_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getInterpolationLinearVelocity() {
    long cPtr = ExtrasJNI.btCollisionObjectFloatData_interpolationLinearVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setInterpolationAngularVelocity(btVector3FloatData value) {
    ExtrasJNI.btCollisionObjectFloatData_interpolationAngularVelocity_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getInterpolationAngularVelocity() {
    long cPtr = ExtrasJNI.btCollisionObjectFloatData_interpolationAngularVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setAnisotropicFriction(btVector3FloatData value) {
    ExtrasJNI.btCollisionObjectFloatData_anisotropicFriction_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getAnisotropicFriction() {
    long cPtr = ExtrasJNI.btCollisionObjectFloatData_anisotropicFriction_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setContactProcessingThreshold(float value) {
    ExtrasJNI.btCollisionObjectFloatData_contactProcessingThreshold_set(swigCPtr, this, value);
  }

  public float getContactProcessingThreshold() {
    return ExtrasJNI.btCollisionObjectFloatData_contactProcessingThreshold_get(swigCPtr, this);
  }

  public void setDeactivationTime(float value) {
    ExtrasJNI.btCollisionObjectFloatData_deactivationTime_set(swigCPtr, this, value);
  }

  public float getDeactivationTime() {
    return ExtrasJNI.btCollisionObjectFloatData_deactivationTime_get(swigCPtr, this);
  }

  public void setFriction(float value) {
    ExtrasJNI.btCollisionObjectFloatData_friction_set(swigCPtr, this, value);
  }

  public float getFriction() {
    return ExtrasJNI.btCollisionObjectFloatData_friction_get(swigCPtr, this);
  }

  public void setRollingFriction(float value) {
    ExtrasJNI.btCollisionObjectFloatData_rollingFriction_set(swigCPtr, this, value);
  }

  public float getRollingFriction() {
    return ExtrasJNI.btCollisionObjectFloatData_rollingFriction_get(swigCPtr, this);
  }

  public void setContactDamping(float value) {
    ExtrasJNI.btCollisionObjectFloatData_contactDamping_set(swigCPtr, this, value);
  }

  public float getContactDamping() {
    return ExtrasJNI.btCollisionObjectFloatData_contactDamping_get(swigCPtr, this);
  }

  public void setContactStiffness(float value) {
    ExtrasJNI.btCollisionObjectFloatData_contactStiffness_set(swigCPtr, this, value);
  }

  public float getContactStiffness() {
    return ExtrasJNI.btCollisionObjectFloatData_contactStiffness_get(swigCPtr, this);
  }

  public void setRestitution(float value) {
    ExtrasJNI.btCollisionObjectFloatData_restitution_set(swigCPtr, this, value);
  }

  public float getRestitution() {
    return ExtrasJNI.btCollisionObjectFloatData_restitution_get(swigCPtr, this);
  }

  public void setHitFraction(float value) {
    ExtrasJNI.btCollisionObjectFloatData_hitFraction_set(swigCPtr, this, value);
  }

  public float getHitFraction() {
    return ExtrasJNI.btCollisionObjectFloatData_hitFraction_get(swigCPtr, this);
  }

  public void setCcdSweptSphereRadius(float value) {
    ExtrasJNI.btCollisionObjectFloatData_ccdSweptSphereRadius_set(swigCPtr, this, value);
  }

  public float getCcdSweptSphereRadius() {
    return ExtrasJNI.btCollisionObjectFloatData_ccdSweptSphereRadius_get(swigCPtr, this);
  }

  public void setCcdMotionThreshold(float value) {
    ExtrasJNI.btCollisionObjectFloatData_ccdMotionThreshold_set(swigCPtr, this, value);
  }

  public float getCcdMotionThreshold() {
    return ExtrasJNI.btCollisionObjectFloatData_ccdMotionThreshold_get(swigCPtr, this);
  }

  public void setHasAnisotropicFriction(int value) {
    ExtrasJNI.btCollisionObjectFloatData_hasAnisotropicFriction_set(swigCPtr, this, value);
  }

  public int getHasAnisotropicFriction() {
    return ExtrasJNI.btCollisionObjectFloatData_hasAnisotropicFriction_get(swigCPtr, this);
  }

  public void setCollisionFlags(int value) {
    ExtrasJNI.btCollisionObjectFloatData_collisionFlags_set(swigCPtr, this, value);
  }

  public int getCollisionFlags() {
    return ExtrasJNI.btCollisionObjectFloatData_collisionFlags_get(swigCPtr, this);
  }

  public void setIslandTag1(int value) {
    ExtrasJNI.btCollisionObjectFloatData_islandTag1_set(swigCPtr, this, value);
  }

  public int getIslandTag1() {
    return ExtrasJNI.btCollisionObjectFloatData_islandTag1_get(swigCPtr, this);
  }

  public void setCompanionId(int value) {
    ExtrasJNI.btCollisionObjectFloatData_companionId_set(swigCPtr, this, value);
  }

  public int getCompanionId() {
    return ExtrasJNI.btCollisionObjectFloatData_companionId_get(swigCPtr, this);
  }

  public void setActivationState1(int value) {
    ExtrasJNI.btCollisionObjectFloatData_activationState1_set(swigCPtr, this, value);
  }

  public int getActivationState1() {
    return ExtrasJNI.btCollisionObjectFloatData_activationState1_get(swigCPtr, this);
  }

  public void setInternalType(int value) {
    ExtrasJNI.btCollisionObjectFloatData_internalType_set(swigCPtr, this, value);
  }

  public int getInternalType() {
    return ExtrasJNI.btCollisionObjectFloatData_internalType_get(swigCPtr, this);
  }

  public void setCheckCollideWith(int value) {
    ExtrasJNI.btCollisionObjectFloatData_checkCollideWith_set(swigCPtr, this, value);
  }

  public int getCheckCollideWith() {
    return ExtrasJNI.btCollisionObjectFloatData_checkCollideWith_get(swigCPtr, this);
  }

  public void setPadding(String value) {
    ExtrasJNI.btCollisionObjectFloatData_padding_set(swigCPtr, this, value);
  }

  public String getPadding() {
    return ExtrasJNI.btCollisionObjectFloatData_padding_get(swigCPtr, this);
  }

  public btCollisionObjectFloatData() {
    this(ExtrasJNI.new_btCollisionObjectFloatData(), true);
  }

}
