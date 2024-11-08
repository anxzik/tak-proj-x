// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fig.proto

package com.atakmap.Tak;

public interface FederateGroupsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.atakmap.FederateGroups)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .com.atakmap.ServerHealth streamUpdate = 1;</code>
   */
  boolean hasStreamUpdate();
  /**
   * <code>optional .com.atakmap.ServerHealth streamUpdate = 1;</code>
   */
  com.atakmap.Tak.ServerHealth getStreamUpdate();
  /**
   * <code>optional .com.atakmap.ServerHealth streamUpdate = 1;</code>
   */
  com.atakmap.Tak.ServerHealthOrBuilder getStreamUpdateOrBuilder();

  /**
   * <code>repeated string federateGroups = 2;</code>
   */
  java.util.List<java.lang.String>
      getFederateGroupsList();
  /**
   * <code>repeated string federateGroups = 2;</code>
   */
  int getFederateGroupsCount();
  /**
   * <code>repeated string federateGroups = 2;</code>
   */
  java.lang.String getFederateGroups(int index);
  /**
   * <code>repeated string federateGroups = 2;</code>
   */
  com.google.protobuf.ByteString
      getFederateGroupsBytes(int index);

  /**
   * <code>repeated .com.atakmap.FederateProvenance federateProvenance = 3;</code>
   */
  java.util.List<com.atakmap.Tak.FederateProvenance> 
      getFederateProvenanceList();
  /**
   * <code>repeated .com.atakmap.FederateProvenance federateProvenance = 3;</code>
   */
  com.atakmap.Tak.FederateProvenance getFederateProvenance(int index);
  /**
   * <code>repeated .com.atakmap.FederateProvenance federateProvenance = 3;</code>
   */
  int getFederateProvenanceCount();
  /**
   * <code>repeated .com.atakmap.FederateProvenance federateProvenance = 3;</code>
   */
  java.util.List<? extends com.atakmap.Tak.FederateProvenanceOrBuilder> 
      getFederateProvenanceOrBuilderList();
  /**
   * <code>repeated .com.atakmap.FederateProvenance federateProvenance = 3;</code>
   */
  com.atakmap.Tak.FederateProvenanceOrBuilder getFederateProvenanceOrBuilder(
      int index);

  /**
   * <code>optional .com.atakmap.FederateHops federateHops = 4;</code>
   */
  boolean hasFederateHops();
  /**
   * <code>optional .com.atakmap.FederateHops federateHops = 4;</code>
   */
  com.atakmap.Tak.FederateHops getFederateHops();
  /**
   * <code>optional .com.atakmap.FederateHops federateHops = 4;</code>
   */
  com.atakmap.Tak.FederateHopsOrBuilder getFederateHopsOrBuilder();

  /**
   * <code>repeated .com.atakmap.FederateGroups nestedGroups = 5;</code>
   */
  java.util.List<com.atakmap.Tak.FederateGroups> 
      getNestedGroupsList();
  /**
   * <code>repeated .com.atakmap.FederateGroups nestedGroups = 5;</code>
   */
  com.atakmap.Tak.FederateGroups getNestedGroups(int index);
  /**
   * <code>repeated .com.atakmap.FederateGroups nestedGroups = 5;</code>
   */
  int getNestedGroupsCount();
  /**
   * <code>repeated .com.atakmap.FederateGroups nestedGroups = 5;</code>
   */
  java.util.List<? extends com.atakmap.Tak.FederateGroupsOrBuilder> 
      getNestedGroupsOrBuilderList();
  /**
   * <code>repeated .com.atakmap.FederateGroups nestedGroups = 5;</code>
   */
  com.atakmap.Tak.FederateGroupsOrBuilder getNestedGroupsOrBuilder(
      int index);
}
