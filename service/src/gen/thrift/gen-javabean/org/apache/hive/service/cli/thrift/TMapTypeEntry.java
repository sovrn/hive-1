/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hive.service.cli.thrift;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TMapTypeEntry implements org.apache.thrift.TBase<TMapTypeEntry, TMapTypeEntry._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TMapTypeEntry");

  private static final org.apache.thrift.protocol.TField KEY_TYPE_PTR_FIELD_DESC = new org.apache.thrift.protocol.TField("keyTypePtr", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField VALUE_TYPE_PTR_FIELD_DESC = new org.apache.thrift.protocol.TField("valueTypePtr", org.apache.thrift.protocol.TType.I32, (short)2);

  private int keyTypePtr; // required
  private int valueTypePtr; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    KEY_TYPE_PTR((short)1, "keyTypePtr"),
    VALUE_TYPE_PTR((short)2, "valueTypePtr");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // KEY_TYPE_PTR
          return KEY_TYPE_PTR;
        case 2: // VALUE_TYPE_PTR
          return VALUE_TYPE_PTR;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __KEYTYPEPTR_ISSET_ID = 0;
  private static final int __VALUETYPEPTR_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.KEY_TYPE_PTR, new org.apache.thrift.meta_data.FieldMetaData("keyTypePtr", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TTypeEntryPtr")));
    tmpMap.put(_Fields.VALUE_TYPE_PTR, new org.apache.thrift.meta_data.FieldMetaData("valueTypePtr", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TTypeEntryPtr")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TMapTypeEntry.class, metaDataMap);
  }

  public TMapTypeEntry() {
  }

  public TMapTypeEntry(
    int keyTypePtr,
    int valueTypePtr)
  {
    this();
    this.keyTypePtr = keyTypePtr;
    setKeyTypePtrIsSet(true);
    this.valueTypePtr = valueTypePtr;
    setValueTypePtrIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMapTypeEntry(TMapTypeEntry other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.keyTypePtr = other.keyTypePtr;
    this.valueTypePtr = other.valueTypePtr;
  }

  public TMapTypeEntry deepCopy() {
    return new TMapTypeEntry(this);
  }

  @Override
  public void clear() {
    setKeyTypePtrIsSet(false);
    this.keyTypePtr = 0;
    setValueTypePtrIsSet(false);
    this.valueTypePtr = 0;
  }

  public int getKeyTypePtr() {
    return this.keyTypePtr;
  }

  public void setKeyTypePtr(int keyTypePtr) {
    this.keyTypePtr = keyTypePtr;
    setKeyTypePtrIsSet(true);
  }

  public void unsetKeyTypePtr() {
    __isset_bit_vector.clear(__KEYTYPEPTR_ISSET_ID);
  }

  /** Returns true if field keyTypePtr is set (has been assigned a value) and false otherwise */
  public boolean isSetKeyTypePtr() {
    return __isset_bit_vector.get(__KEYTYPEPTR_ISSET_ID);
  }

  public void setKeyTypePtrIsSet(boolean value) {
    __isset_bit_vector.set(__KEYTYPEPTR_ISSET_ID, value);
  }

  public int getValueTypePtr() {
    return this.valueTypePtr;
  }

  public void setValueTypePtr(int valueTypePtr) {
    this.valueTypePtr = valueTypePtr;
    setValueTypePtrIsSet(true);
  }

  public void unsetValueTypePtr() {
    __isset_bit_vector.clear(__VALUETYPEPTR_ISSET_ID);
  }

  /** Returns true if field valueTypePtr is set (has been assigned a value) and false otherwise */
  public boolean isSetValueTypePtr() {
    return __isset_bit_vector.get(__VALUETYPEPTR_ISSET_ID);
  }

  public void setValueTypePtrIsSet(boolean value) {
    __isset_bit_vector.set(__VALUETYPEPTR_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case KEY_TYPE_PTR:
      if (value == null) {
        unsetKeyTypePtr();
      } else {
        setKeyTypePtr((Integer)value);
      }
      break;

    case VALUE_TYPE_PTR:
      if (value == null) {
        unsetValueTypePtr();
      } else {
        setValueTypePtr((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case KEY_TYPE_PTR:
      return Integer.valueOf(getKeyTypePtr());

    case VALUE_TYPE_PTR:
      return Integer.valueOf(getValueTypePtr());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case KEY_TYPE_PTR:
      return isSetKeyTypePtr();
    case VALUE_TYPE_PTR:
      return isSetValueTypePtr();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TMapTypeEntry)
      return this.equals((TMapTypeEntry)that);
    return false;
  }

  public boolean equals(TMapTypeEntry that) {
    if (that == null)
      return false;

    boolean this_present_keyTypePtr = true;
    boolean that_present_keyTypePtr = true;
    if (this_present_keyTypePtr || that_present_keyTypePtr) {
      if (!(this_present_keyTypePtr && that_present_keyTypePtr))
        return false;
      if (this.keyTypePtr != that.keyTypePtr)
        return false;
    }

    boolean this_present_valueTypePtr = true;
    boolean that_present_valueTypePtr = true;
    if (this_present_valueTypePtr || that_present_valueTypePtr) {
      if (!(this_present_valueTypePtr && that_present_valueTypePtr))
        return false;
      if (this.valueTypePtr != that.valueTypePtr)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_keyTypePtr = true;
    builder.append(present_keyTypePtr);
    if (present_keyTypePtr)
      builder.append(keyTypePtr);

    boolean present_valueTypePtr = true;
    builder.append(present_valueTypePtr);
    if (present_valueTypePtr)
      builder.append(valueTypePtr);

    return builder.toHashCode();
  }

  public int compareTo(TMapTypeEntry other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TMapTypeEntry typedOther = (TMapTypeEntry)other;

    lastComparison = Boolean.valueOf(isSetKeyTypePtr()).compareTo(typedOther.isSetKeyTypePtr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKeyTypePtr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.keyTypePtr, typedOther.keyTypePtr);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValueTypePtr()).compareTo(typedOther.isSetValueTypePtr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValueTypePtr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.valueTypePtr, typedOther.valueTypePtr);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // KEY_TYPE_PTR
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.keyTypePtr = iprot.readI32();
            setKeyTypePtrIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // VALUE_TYPE_PTR
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.valueTypePtr = iprot.readI32();
            setValueTypePtrIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(KEY_TYPE_PTR_FIELD_DESC);
    oprot.writeI32(this.keyTypePtr);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(VALUE_TYPE_PTR_FIELD_DESC);
    oprot.writeI32(this.valueTypePtr);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TMapTypeEntry(");
    boolean first = true;

    sb.append("keyTypePtr:");
    sb.append(this.keyTypePtr);
    first = false;
    if (!first) sb.append(", ");
    sb.append("valueTypePtr:");
    sb.append(this.valueTypePtr);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetKeyTypePtr()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'keyTypePtr' is unset! Struct:" + toString());
    }

    if (!isSetValueTypePtr()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'valueTypePtr' is unset! Struct:" + toString());
    }

  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

