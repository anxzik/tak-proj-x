// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fig.proto

package com.atakmap.Tak;

public interface FederatedEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.atakmap.FederatedEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .com.atakmap.GeoEvent event = 1;</code>
   */
  boolean hasEvent();
  /**
   * <code>optional .com.atakmap.GeoEvent event = 1;</code>
   */
  com.atakmap.Tak.GeoEvent getEvent();
  /**
   * <code>optional .com.atakmap.GeoEvent event = 1;</code>
   */
  com.atakmap.Tak.GeoEventOrBuilder getEventOrBuilder();

  /**
   * <code>optional .com.atakmap.ContactListEntry contact = 2;</code>
   */
  boolean hasContact();
  /**
   * <code>optional .com.atakmap.ContactListEntry contact = 2;</code>
   */
  com.atakmap.Tak.ContactListEntry getContact();
  /**
   * <code>optional .com.atakmap.ContactListEntry contact = 2;</code>
   */
  com.atakmap.Tak.ContactListEntryOrBuilder getContactOrBuilder();

  /**
   * <code>repeated string federateGroups = 3;</code>
   */
  java.util.List<java.lang.String>
      getFederateGroupsList();
  /**
   * <code>repeated string federateGroups = 3;</code>
   */
  int getFederateGroupsCount();
  /**
   * <code>repeated string federateGroups = 3;</code>
   */
  java.lang.String getFederateGroups(int index);
  /**
   * <code>repeated string federateGroups = 3;</code>
   */
  com.google.protobuf.ByteString
      getFederateGroupsBytes(int index);

  /**
   * <code>repeated .com.atakmap.FederateProvenance federateProvenance = 4;</code>
   */
  java.util.List<com.atakmap.Tak.FederateProvenance> 
      getFederateProvenanceList();
  /**
   * <code>repeated .com.atakmap.FederateProvenance federateProvenance = 4;</code>
   */
  com.atakmap.Tak.FederateProvenance getFederateProvenance(int index);
  /**
   * <code>repeated .com.atakmap.FederateProvenance federateProvenance = 4;</code>
   */
  int getFederateProvenanceCount();
  /**
   * <code>repeated .com.atakmap.FederateProvenance federateProvenance = 4;</code>
   */
  java.util.List<? extends com.atakmap.Tak.FederateProvenanceOrBuilder> 
      getFederateProvenanceOrBuilderList();
  /**
   * <code>repeated .com.atakmap.FederateProvenance federateProvenance = 4;</code>
   */
  com.atakmap.Tak.FederateProvenanceOrBuilder getFederateProvenanceOrBuilder(
      int index);

  /**
   * <code>optional .com.atakmap.FederateHops federateHops = 5;</code>
   */
  boolean hasFederateHops();
  /**
   * <code>optional .com.atakmap.FederateHops federateHops = 5;</code>
   */
  com.atakmap.Tak.FederateHops getFederateHops();
  /**
   * <code>optional .com.atakmap.FederateHops federateHops = 5;</code>
   */
  com.atakmap.Tak.FederateHopsOrBuilder getFederateHopsOrBuilder();
}
