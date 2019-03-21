# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: date.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='date.proto',
  package='aif.kaist',
  syntax='proto3',
  serialized_options=_b('\n\026aif.kaist.iclab.protosB\nDateProtos'),
  serialized_pb=_b('\n\ndate.proto\x12\taif.kaist\"\xa2\x01\n\x08\x44\x61teTime\x12\x16\n\x0eutc_offset_min\x18\x01 \x01(\x05\x12\x0c\n\x04year\x18\x02 \x01(\x05\x12\r\n\x05month\x18\x03 \x01(\x05\x12\x0b\n\x03\x64\x61y\x18\x04 \x01(\x05\x12\x0c\n\x04hour\x18\x05 \x01(\x05\x12\x0e\n\x06minute\x18\x06 \x01(\x05\x12\x0e\n\x06second\x18\x07 \x01(\x05\x12\x13\n\x0bmillisecond\x18\x08 \x01(\x05\x12\x11\n\tdate_only\x18\t \x01(\x08\x42$\n\x16\x61if.kaist.iclab.protosB\nDateProtosb\x06proto3')
)




_DATETIME = _descriptor.Descriptor(
  name='DateTime',
  full_name='aif.kaist.DateTime',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='utc_offset_min', full_name='aif.kaist.DateTime.utc_offset_min', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='year', full_name='aif.kaist.DateTime.year', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='month', full_name='aif.kaist.DateTime.month', index=2,
      number=3, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='day', full_name='aif.kaist.DateTime.day', index=3,
      number=4, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='hour', full_name='aif.kaist.DateTime.hour', index=4,
      number=5, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='minute', full_name='aif.kaist.DateTime.minute', index=5,
      number=6, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='second', full_name='aif.kaist.DateTime.second', index=6,
      number=7, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='millisecond', full_name='aif.kaist.DateTime.millisecond', index=7,
      number=8, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='date_only', full_name='aif.kaist.DateTime.date_only', index=8,
      number=9, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=26,
  serialized_end=188,
)

DESCRIPTOR.message_types_by_name['DateTime'] = _DATETIME
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

DateTime = _reflection.GeneratedProtocolMessageType('DateTime', (_message.Message,), dict(
  DESCRIPTOR = _DATETIME,
  __module__ = 'date_pb2'
  # @@protoc_insertion_point(class_scope:aif.kaist.DateTime)
  ))
_sym_db.RegisterMessage(DateTime)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
