python -m grpc_tools.protoc --proto_path=../protos --grpc_python_out=. --python_out=. ../protos/alarm.proto ../protos/calendar.proto ../protos/date.proto