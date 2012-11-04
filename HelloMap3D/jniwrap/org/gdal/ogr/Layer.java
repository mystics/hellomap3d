/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.gdal.ogr;

import org.gdal.osr.SpatialReference;

public class Layer {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Layer(long cPtr, boolean cMemoryOwn) {
    if (cPtr == 0)
        throw new RuntimeException();
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }
  
  protected static long getCPtr(Layer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
  }

  private Object parentReference;

  protected static long getCPtrAndDisown(Layer obj) {
    if (obj != null)
    {
        obj.swigCMemOwn= false;
        obj.parentReference = null;
    }
    return getCPtr(obj);
  }

  /* Ensure that the GC doesn't collect any parent instance set from Java */
  protected void addReference(Object reference) {
    parentReference = reference;
  }

  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof Layer)
      equal = (((Layer)obj).swigCPtr == this.swigCPtr);
    return equal;
  }

  public int hashCode() {
     return (int)swigCPtr;
  }

  public double[] GetExtent(boolean force)
  {
      double[] argout = new double[4];
      try
      {
          int ret = GetExtent(argout, (force) ? 1 : 0);
          return (ret == 0) ? argout : null;
      }
      catch(RuntimeException e)
      {
          return null;
      }
  }

  public double[] GetExtent()
  {
      return GetExtent(true);
  }

  public int GetRefCount() {
    return ogrJNI.Layer_GetRefCount(swigCPtr, this);
  }

  public void SetSpatialFilter(Geometry filter) {
    ogrJNI.Layer_SetSpatialFilter(swigCPtr, this, Geometry.getCPtr(filter), filter);
  }

  public void SetSpatialFilterRect(double minx, double miny, double maxx, double maxy) {
    ogrJNI.Layer_SetSpatialFilterRect(swigCPtr, this, minx, miny, maxx, maxy);
  }

  public Geometry GetSpatialFilter() {
    long cPtr = ogrJNI.Layer_GetSpatialFilter(swigCPtr, this);
    Geometry ret = null;
    if (cPtr != 0) {
      ret = new Geometry(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public int SetAttributeFilter(String filter_string) {
    return ogrJNI.Layer_SetAttributeFilter(swigCPtr, this, filter_string);
  }

  public void ResetReading() {
    ogrJNI.Layer_ResetReading(swigCPtr, this);
  }

  public String GetName() {
    return ogrJNI.Layer_GetName(swigCPtr, this);
  }

  public int GetGeomType() {
    return ogrJNI.Layer_GetGeomType(swigCPtr, this);
  }

  public String GetGeometryColumn() {
    return ogrJNI.Layer_GetGeometryColumn(swigCPtr, this);
  }

  public String GetFIDColumn() {
    return ogrJNI.Layer_GetFIDColumn(swigCPtr, this);
  }

  public Feature GetFeature(int fid) {
    long cPtr = ogrJNI.Layer_GetFeature(swigCPtr, this, fid);
    return (cPtr == 0) ? null : new Feature(cPtr, true);
  }

  public Feature GetNextFeature() {
    long cPtr = ogrJNI.Layer_GetNextFeature(swigCPtr, this);
    return (cPtr == 0) ? null : new Feature(cPtr, true);
  }

  public int SetNextByIndex(int new_index) {
    return ogrJNI.Layer_SetNextByIndex(swigCPtr, this, new_index);
  }

  public int SetFeature(Feature feature) {
    return ogrJNI.Layer_SetFeature(swigCPtr, this, Feature.getCPtr(feature), feature);
  }

  public int CreateFeature(Feature feature) {
    return ogrJNI.Layer_CreateFeature(swigCPtr, this, Feature.getCPtr(feature), feature);
  }

  public int DeleteFeature(int fid) {
    return ogrJNI.Layer_DeleteFeature(swigCPtr, this, fid);
  }

  public int SyncToDisk() {
    return ogrJNI.Layer_SyncToDisk(swigCPtr, this);
  }

  public FeatureDefn GetLayerDefn() {
    long cPtr = ogrJNI.Layer_GetLayerDefn(swigCPtr, this);
    FeatureDefn ret = null;
    if (cPtr != 0) {
      ret = new FeatureDefn(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public int GetFeatureCount(int force) {
    return ogrJNI.Layer_GetFeatureCount__SWIG_0(swigCPtr, this, force);
  }

  public int GetFeatureCount() {
    return ogrJNI.Layer_GetFeatureCount__SWIG_1(swigCPtr, this);
  }

  public int GetExtent(double[] argout, int force) {
    return ogrJNI.Layer_GetExtent(swigCPtr, this, argout, force);
  }

  public boolean TestCapability(String cap) {
    return ogrJNI.Layer_TestCapability(swigCPtr, this, cap);
  }

  public int CreateField(FieldDefn field_def, int approx_ok) {
    return ogrJNI.Layer_CreateField__SWIG_0(swigCPtr, this, FieldDefn.getCPtr(field_def), field_def, approx_ok);
  }

  public int CreateField(FieldDefn field_def) {
    return ogrJNI.Layer_CreateField__SWIG_1(swigCPtr, this, FieldDefn.getCPtr(field_def), field_def);
  }

  public int DeleteField(int iField) {
    return ogrJNI.Layer_DeleteField(swigCPtr, this, iField);
  }

  public int ReorderField(int iOldFieldPos, int iNewFieldPos) {
    return ogrJNI.Layer_ReorderField(swigCPtr, this, iOldFieldPos, iNewFieldPos);
  }

  public int ReorderFields(int[] nList) {
    return ogrJNI.Layer_ReorderFields(swigCPtr, this, nList);
  }

  public int AlterFieldDefn(int iField, FieldDefn field_def, int nFlags) {
    return ogrJNI.Layer_AlterFieldDefn(swigCPtr, this, iField, FieldDefn.getCPtr(field_def), field_def, nFlags);
  }

  public int StartTransaction() {
    return ogrJNI.Layer_StartTransaction(swigCPtr, this);
  }

  public int CommitTransaction() {
    return ogrJNI.Layer_CommitTransaction(swigCPtr, this);
  }

  public int RollbackTransaction() {
    return ogrJNI.Layer_RollbackTransaction(swigCPtr, this);
  }

  public SpatialReference GetSpatialRef() {
    long cPtr = ogrJNI.Layer_GetSpatialRef(swigCPtr, this);
    return (cPtr == 0) ? null : new SpatialReference(cPtr, true);
  }

  public long GetFeaturesRead() {
    return ogrJNI.Layer_GetFeaturesRead(swigCPtr, this);
  }

  public int SetIgnoredFields(java.util.Vector options) {
    return ogrJNI.Layer_SetIgnoredFields(swigCPtr, this, options);
  }

}