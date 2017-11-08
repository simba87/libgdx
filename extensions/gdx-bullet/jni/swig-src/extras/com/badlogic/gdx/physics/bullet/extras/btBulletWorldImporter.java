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

public class btBulletWorldImporter extends btWorldImporter {
	private long swigCPtr;
	
	protected btBulletWorldImporter(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, ExtrasJNI.btBulletWorldImporter_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btBulletWorldImporter, normally you should not need this constructor it's intended for low-level usage. */
	public btBulletWorldImporter(long cPtr, boolean cMemoryOwn) {
		this("btBulletWorldImporter", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(ExtrasJNI.btBulletWorldImporter_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btBulletWorldImporter obj) {
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
				ExtrasJNI.delete_btBulletWorldImporter(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    ExtrasJNI.btBulletWorldImporter_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    ExtrasJNI.btBulletWorldImporter_change_ownership(this, swigCPtr, true);
  }

  public btBulletWorldImporter(btDynamicsWorld world) {
    this(ExtrasJNI.new_btBulletWorldImporter__SWIG_0(btDynamicsWorld.getCPtr(world), world), true);
    ExtrasJNI.btBulletWorldImporter_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public btBulletWorldImporter() {
    this(ExtrasJNI.new_btBulletWorldImporter__SWIG_1(), true);
    ExtrasJNI.btBulletWorldImporter_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public boolean loadFile(String fileName, String preSwapFilenameOut) {
    return ExtrasJNI.btBulletWorldImporter_loadFile__SWIG_0(swigCPtr, this, fileName, preSwapFilenameOut);
  }

  public boolean loadFile(String fileName) {
    return ExtrasJNI.btBulletWorldImporter_loadFile__SWIG_1(swigCPtr, this, fileName);
  }

  public boolean loadFileFromMemory(btBulletFile file) {
    return ExtrasJNI.btBulletWorldImporter_loadFileFromMemory__SWIG_0(swigCPtr, this, btBulletFile.getCPtr(file), file);
  }

  public boolean convertAllObjects(btBulletFile file) {
    return (getClass() == btBulletWorldImporter.class) ? ExtrasJNI.btBulletWorldImporter_convertAllObjects(swigCPtr, this, btBulletFile.getCPtr(file), file) : ExtrasJNI.btBulletWorldImporter_convertAllObjectsSwigExplicitbtBulletWorldImporter(swigCPtr, this, btBulletFile.getCPtr(file), file);
  }

  public boolean loadFileFromMemory(java.nio.ByteBuffer memoryBuffer, int len) {
    assert memoryBuffer.isDirect() : "Buffer must be allocated direct.";
    {
      return ExtrasJNI.btBulletWorldImporter_loadFileFromMemory__SWIG_1(swigCPtr, this, memoryBuffer, len);
    }
  }

}
