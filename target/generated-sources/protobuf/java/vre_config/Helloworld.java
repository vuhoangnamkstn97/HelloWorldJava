// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package vre_config;

public final class Helloworld {
  private Helloworld() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Information_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Information_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClubMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClubMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020helloworld.proto\"K\n\013Information\022\022\n\npla" +
      "yerName\030\001 \001(\t\022\022\n\nplayerClub\030\002 \001(\t\022\024\n\014pla" +
      "yerNumber\030\003 \001(\005\"\036\n\013ClubMessage\022\017\n\007messag" +
      "e\030\001 \001(\t27\n\013TestService\022(\n\010SendInfo\022\014.Inf" +
      "ormation\032\014.ClubMessage\"\000B\016\n\nvre_configP\001" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Information_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Information_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Information_descriptor,
        new java.lang.String[] { "PlayerName", "PlayerClub", "PlayerNumber", });
    internal_static_ClubMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ClubMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClubMessage_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
