// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fig.proto

package com.atakmap.Tak;

public final class FigProto {
  private FigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_atakmap_FederatedEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_atakmap_FederatedEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_atakmap_GeoEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_atakmap_GeoEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_atakmap_BinaryBlob_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_atakmap_BinaryBlob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_atakmap_ContactListEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_atakmap_ContactListEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_atakmap_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_atakmap_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_atakmap_Identity_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_atakmap_Identity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_atakmap_Subscription_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_atakmap_Subscription_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_atakmap_ClientHealth_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_atakmap_ClientHealth_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_atakmap_ServerHealth_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_atakmap_ServerHealth_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_atakmap_ROL_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_atakmap_ROL_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_atakmap_FederateGroups_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_atakmap_FederateGroups_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_atakmap_TakServerVersion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_atakmap_TakServerVersion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_atakmap_FederateProvenance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_atakmap_FederateProvenance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_atakmap_FederateHops_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_atakmap_FederateHops_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tfig.proto\022\013com.atakmap\"\354\001\n\016FederatedEv" +
      "ent\022$\n\005event\030\001 \001(\0132\025.com.atakmap.GeoEven" +
      "t\022.\n\007contact\030\002 \001(\0132\035.com.atakmap.Contact" +
      "ListEntry\022\026\n\016federateGroups\030\003 \003(\t\022;\n\022fed" +
      "erateProvenance\030\004 \003(\0132\037.com.atakmap.Fede" +
      "rateProvenance\022/\n\014federateHops\030\005 \001(\0132\031.c" +
      "om.atakmap.FederateHops\"\314\003\n\010GeoEvent\022\020\n\010" +
      "sendTime\030\001 \001(\003\022\021\n\tstartTime\030\002 \001(\003\022\021\n\tsta" +
      "leTime\030\003 \001(\003\022\013\n\003lat\030\004 \001(\001\022\013\n\003lon\030\005 \001(\001\022\013" +
      "\n\003hae\030\006 \001(\001\022\n\n\002ce\030\007 \001(\001\022\n\n\002le\030\010 \001(\001\022\013\n\003u",
      "id\030\t \001(\t\022\014\n\004type\030\n \001(\t\022\023\n\013coordSource\030\013 " +
      "\001(\t\022\r\n\005other\030\014 \001(\t\022\017\n\007battery\030\r \001(\005\022\014\n\004p" +
      "loc\030\016 \001(\t\022\014\n\004palt\030\017 \001(\t\022\022\n\nscreenName\030\020 " +
      "\001(\t\022\021\n\tgroupName\030\021 \001(\t\022\021\n\tgroupRole\030\022 \001(" +
      "\t\022\r\n\005phone\030\023 \001(\t\022\r\n\005speed\030\024 \001(\001\022\016\n\006cours" +
      "e\030\025 \001(\001\022\'\n\006binary\030\026 \001(\0132\027.com.atakmap.Bi" +
      "naryBlob\022\017\n\007ptpUids\030\027 \003(\t\022\024\n\014ptpCallsign" +
      "s\030\030 \003(\t\022\017\n\007feedUid\030\031 \001(\t\022\024\n\014missionNames" +
      "\030\032 \003(\t\"\353\001\n\nBinaryBlob\022\'\n\004type\030\001 \001(\0162\031.co" +
      "m.atakmap.BINARY_TYPES\022\014\n\004data\030\002 \001(\014\022\020\n\010",
      "filename\030\003 \001(\t\022\021\n\ttimestamp\030\004 \001(\003\022\023\n\013des" +
      "cription\030\005 \001(\t\022;\n\022federateProvenance\030\006 \003" +
      "(\0132\037.com.atakmap.FederateProvenance\022/\n\014f" +
      "ederateHops\030\007 \001(\0132\031.com.atakmap.Federate" +
      "Hops\"\212\001\n\020ContactListEntry\022$\n\toperation\030\001" +
      " \001(\0162\021.com.atakmap.CRUD\022\013\n\003uid\030\002 \001(\t\022\020\n\010" +
      "callsign\030\003 \001(\t\022\r\n\005phone\030\004 \001(\t\022\013\n\003sip\030\005 \001" +
      "(\t\022\025\n\rdirectConnect\030\006 \001(\t\"\007\n\005Empty\"\376\001\n\010I" +
      "dentity\022\014\n\004name\030\001 \001(\t\022\013\n\003uid\030\002 \001(\t\022\023\n\013de" +
      "scription\030\003 \001(\t\0222\n\004type\030\004 \001(\0162$.com.atak",
      "map.Identity.ConnectionType\022\020\n\010serverId\030" +
      "\005 \001(\t\"|\n\016ConnectionType\022\031\n\025FEDERATION_HU" +
      "B_SERVER\020\000\022\031\n\025FEDERATION_HUB_CLIENT\020\001\022\031\n" +
      "\025FEDERATION_TAK_SERVER\020\002\022\031\n\025FEDERATION_T" +
      "AK_CLIENT\020\003\"w\n\014Subscription\022\'\n\010identity\030" +
      "\001 \001(\0132\025.com.atakmap.Identity\022\016\n\006filter\030\002" +
      " \001(\t\022.\n\007version\030\003 \001(\0132\035.com.atakmap.TakS" +
      "erverVersion\"\203\001\n\014ClientHealth\0227\n\006status\030" +
      "\001 \001(\0162\'.com.atakmap.ClientHealth.Serving" +
      "Status\":\n\rServingStatus\022\013\n\007UNKNOWN\020\000\022\013\n\007",
      "SERVING\020\001\022\017\n\013NOT_SERVING\020\002\"\226\001\n\014ServerHea" +
      "lth\0227\n\006status\030\001 \001(\0162\'.com.atakmap.Server" +
      "Health.ServingStatus\"M\n\rServingStatus\022\013\n" +
      "\007UNKNOWN\020\000\022\013\n\007SERVING\020\001\022\017\n\013NOT_SERVING\020\002" +
      "\022\021\n\rNOT_CONNECTED\020\003\"\306\001\n\003ROL\022\017\n\007program\030\001" +
      " \001(\t\022(\n\007payload\030\002 \003(\0132\027.com.atakmap.Bina" +
      "ryBlob\022\026\n\016federateGroups\030\003 \003(\t\022;\n\022federa" +
      "teProvenance\030\004 \003(\0132\037.com.atakmap.Federat" +
      "eProvenance\022/\n\014federateHops\030\005 \001(\0132\031.com." +
      "atakmap.FederateHops\"\372\001\n\016FederateGroups\022",
      "/\n\014streamUpdate\030\001 \001(\0132\031.com.atakmap.Serv" +
      "erHealth\022\026\n\016federateGroups\030\002 \003(\t\022;\n\022fede" +
      "rateProvenance\030\003 \003(\0132\037.com.atakmap.Feder" +
      "ateProvenance\022/\n\014federateHops\030\004 \001(\0132\031.co" +
      "m.atakmap.FederateHops\0221\n\014nestedGroups\030\005" +
      " \003(\0132\033.com.atakmap.FederateGroups\"`\n\020Tak" +
      "ServerVersion\022\r\n\005major\030\001 \001(\003\022\r\n\005minor\030\002 " +
      "\001(\003\022\r\n\005patch\030\003 \001(\003\022\016\n\006branch\030\004 \001(\t\022\017\n\007va" +
      "riant\030\005 \001(\t\"N\n\022FederateProvenance\022\032\n\022fed" +
      "erationServerId\030\001 \001(\t\022\034\n\024federationServe",
      "rName\030\002 \001(\t\"4\n\014FederateHops\022\017\n\007maxHops\030\001" +
      " \001(\003\022\023\n\013currentHops\030\002 \001(\003*A\n\004CRUD\022\013\n\007INV" +
      "ALID\020\000\022\n\n\006CREATE\020\001\022\010\n\004READ\020\002\022\n\n\006UPDATE\020\003" +
      "\022\n\n\006DELETE\020\004*/\n\014BINARY_TYPES\022\t\n\005EMPTY\020\000\022" +
      "\t\n\005OTHER\020\001\022\t\n\005IMAGE\020\0022\274\006\n\020FederatedChann" +
      "el\022A\n\014SendOneEvent\022\033.com.atakmap.Federat" +
      "edEvent\032\022.com.atakmap.Empty\"\000\022F\n\023BinaryM" +
      "essageStream\022\027.com.atakmap.BinaryBlob\032\022." +
      "com.atakmap.Empty\"\000(\001\022<\n\013SendOneBlob\022\027.c" +
      "om.atakmap.BinaryBlob\032\022.com.atakmap.Empt",
      "y\"\000\022:\n\013getIdentity\022\022.com.atakmap.Empty\032\025" +
      ".com.atakmap.Identity\"\000\022O\n\021ClientEventSt" +
      "ream\022\031.com.atakmap.Subscription\032\033.com.at" +
      "akmap.FederatedEvent\"\0000\001\022O\n\021ServerEventS" +
      "tream\022\033.com.atakmap.FederatedEvent\032\031.com" +
      ".atakmap.Subscription\"\000(\001\022E\n\013HealthCheck" +
      "\022\031.com.atakmap.ClientHealth\032\031.com.atakma" +
      "p.ServerHealth\"\000\022B\n\017ClientROLStream\022\031.co" +
      "m.atakmap.Subscription\032\020.com.atakmap.ROL" +
      "\"\0000\001\022B\n\017ServerROLStream\022\020.com.atakmap.RO",
      "L\032\031.com.atakmap.Subscription\"\000(\001\022X\n\032Serv" +
      "erFederateGroupsStream\022\031.com.atakmap.Sub" +
      "scription\032\033.com.atakmap.FederateGroups\"\000" +
      "0\001\022X\n\032ClientFederateGroupsStream\022\033.com.a" +
      "takmap.FederateGroups\032\031.com.atakmap.Subs" +
      "cription\"\000(\001B#\n\017com.atakmap.TakB\010FigProt" +
      "oP\001\242\002\003TAKb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_atakmap_FederatedEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_atakmap_FederatedEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_atakmap_FederatedEvent_descriptor,
        new java.lang.String[] { "Event", "Contact", "FederateGroups", "FederateProvenance", "FederateHops", });
    internal_static_com_atakmap_GeoEvent_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_atakmap_GeoEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_atakmap_GeoEvent_descriptor,
        new java.lang.String[] { "SendTime", "StartTime", "StaleTime", "Lat", "Lon", "Hae", "Ce", "Le", "Uid", "Type", "CoordSource", "Other", "Battery", "Ploc", "Palt", "ScreenName", "GroupName", "GroupRole", "Phone", "Speed", "Course", "Binary", "PtpUids", "PtpCallsigns", "FeedUid", "MissionNames", });
    internal_static_com_atakmap_BinaryBlob_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_atakmap_BinaryBlob_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_atakmap_BinaryBlob_descriptor,
        new java.lang.String[] { "Type", "Data", "Filename", "Timestamp", "Description", "FederateProvenance", "FederateHops", });
    internal_static_com_atakmap_ContactListEntry_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_atakmap_ContactListEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_atakmap_ContactListEntry_descriptor,
        new java.lang.String[] { "Operation", "Uid", "Callsign", "Phone", "Sip", "DirectConnect", });
    internal_static_com_atakmap_Empty_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_atakmap_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_atakmap_Empty_descriptor,
        new java.lang.String[] { });
    internal_static_com_atakmap_Identity_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_atakmap_Identity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_atakmap_Identity_descriptor,
        new java.lang.String[] { "Name", "Uid", "Description", "Type", "ServerId", });
    internal_static_com_atakmap_Subscription_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_atakmap_Subscription_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_atakmap_Subscription_descriptor,
        new java.lang.String[] { "Identity", "Filter", "Version", });
    internal_static_com_atakmap_ClientHealth_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_com_atakmap_ClientHealth_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_atakmap_ClientHealth_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_com_atakmap_ServerHealth_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_com_atakmap_ServerHealth_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_atakmap_ServerHealth_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_com_atakmap_ROL_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_com_atakmap_ROL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_atakmap_ROL_descriptor,
        new java.lang.String[] { "Program", "Payload", "FederateGroups", "FederateProvenance", "FederateHops", });
    internal_static_com_atakmap_FederateGroups_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_com_atakmap_FederateGroups_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_atakmap_FederateGroups_descriptor,
        new java.lang.String[] { "StreamUpdate", "FederateGroups", "FederateProvenance", "FederateHops", "NestedGroups", });
    internal_static_com_atakmap_TakServerVersion_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_com_atakmap_TakServerVersion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_atakmap_TakServerVersion_descriptor,
        new java.lang.String[] { "Major", "Minor", "Patch", "Branch", "Variant", });
    internal_static_com_atakmap_FederateProvenance_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_com_atakmap_FederateProvenance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_atakmap_FederateProvenance_descriptor,
        new java.lang.String[] { "FederationServerId", "FederationServerName", });
    internal_static_com_atakmap_FederateHops_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_com_atakmap_FederateHops_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_atakmap_FederateHops_descriptor,
        new java.lang.String[] { "MaxHops", "CurrentHops", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
