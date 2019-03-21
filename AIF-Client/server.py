from alarm_pb2_grpc import AlarmReceiverServiceServicer, add_AlarmReceiverServiceServicer_to_server
from google.protobuf.empty_pb2 import Empty
import grpc
from concurrent import futures
import time


class AlarmReceiverServer(AlarmReceiverServiceServicer):
    def ReceiveAlarm(self, request, context):
        print(request)
        return Empty()


def run_server(port: int):
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))
    add_AlarmReceiverServiceServicer_to_server(
        AlarmReceiverServer(), server
    )
    server.add_insecure_port('0.0.0.0:{}'.format(port))
    server.start()

    try:
        while True:
            time.sleep(60 * 60 * 24)
    except KeyboardInterrupt:
        server.stop(0)


if __name__ == '__main__':
    run_server(port=50052)
