from functools import wraps
import grpc
from datetime import datetime, tzinfo
from dateutil import tz

from date_pb2 import DateTime


def grpc_call(func):
    @wraps(func)
    def grpc_call_wrapper(*args, **kwargs):
        print("{} {} {}".format("=" * 10, func.__name__, "=" * 10))
        try:
            result = func(*args, **kwargs)
            print("\t - Success - \n{}".format(result))
            return result
        except grpc.RpcError as e:
            code = e.code()
            details = e.details()
            print("\t - Error (code = {}, details = {}) - ".format(code, details))

            if code == grpc.StatusCode.UNAUTHENTICATED:
                for k, v in e.trailing_metadata():
                    if k == 'auth_url':
                        print("\t - Authorization in this link: {}".format(v))
            raise e
    return grpc_call_wrapper


def datetime_to_protobuf(t: datetime) -> DateTime:
    return DateTime(
        utc_offset_min=int(t.utcoffset().seconds / 60) if t.utcoffset() else 0,
        year=t.year,
        month=t.month,
        day=t.day,
        hour=t.hour,
        minute=t.minute,
        second=t.second,
        date_only=False
    )


def protobuf_to_datetime(pb: DateTime) -> datetime:
    return datetime(
        tzinfo=tz.tzoffset('TMP', pb.utc_offset_min * 60),
        year=pb.year,
        month=pb.month,
        day=pb.day,
        hour=pb.hour,
        minute=pb.minute,
        second=pb.second,
    )


def merge_datetime(year: int = None, month: int = None, day: int = None,
                   hour: int = None, minute: int = None, second: int = None,
                   timezone: tzinfo = tz.tzoffset('KST', 9 * 60 * 60)):
    now = datetime.now(timezone)
    return datetime(
        year=year if year is not None else now.year,
        month=month if month is not None else now.month,
        day=day if day is not None else now.day,
        hour=hour if hour is not None else now.hour,
        minute=minute if minute is not None else now.minute,
        second=second if second is not None else now.second,
        tzinfo=timezone
    )
