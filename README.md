# AIF-Demo-Project

## protos

GRPC and Protobuf spec. for AIF Demo project.

## AIF-Server

Server implementation for AIF Demo Project, where it supports CRUD operations for Google Calendar and custom alarm scheduler.

## AIF-Client

The example client (implemented in Python 3.7). 

```
AIF-Client
- run.py  # script to show how this works.
- server.py  # the server that receives alarms scheduled.
- examples/def_ops_calendar.py  # CRUD operations for Google Calendar
- examples/def_ops_alarm.py  # CRUD operations for alarm scheduling
- examples/use_cases.py  # Specific use cases (e.g., finding free time slots in a calendar, and schedule multiple alarms)
- examples/utils.py  # some utility functions

```
### How to run
1. Install dependencies.

```bash
pip install -r requirements.txt
```
Or
```bash
pip install grpcio grpcio-tools python-dateutil
```

2. Run the server that receives alarms
```bash
python ./server.py
```

3. Specify your user id and the server address above in run.py

``` python
if __name__ == '__main__':
    aif_server_address = 'aif.kaist.ac.kr:50051'
    your_user_id = 'should-set-your-id'
    receiver_address = 'should-set-your-receiver-server-address' 
```

4. Then, run the script and check your console.

```bash
python ./run.py
```

5. For CRUD operations for Google Calendar, if you are not authorized, the server sends grpc.RpcError (in Python) or io.grpc.StatusRuntimeException (in Java) with the code, UNAUTHENTICATED, and the URL for authorization. The url is included in a description and trailers. To get authorization URL only, do below:
6. To get the authorization url, do below:
```python
try:
    some_grpc_call()
except grpc.RpcError as e:
    for k, v in e.trailing_metadata():
        if k == 'auth_url':
            print(v)
```

For authorization, click the URL and do the authorization process.


### If you want to have your own implementation:

1. Install python dependencies:
```bash
pip install gricio grpcio-tools
```

2. Generate gRPC and Proto files for Python

```bash
python -m grpc_tools.protoc ^
    --proto_path=./protos ^
    --grpc_python_out=. ^
    --python_out=. ^
    ./protos/alarm.proto ./protos/calendar.proto ./protos/date.proto 
```
(^ is used for multi-line representation in Windows. For Linux, use \\)

3. Then, free to implement.