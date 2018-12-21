#/bin/bash
# visit through gateway
curl -X POST \
  http://localhost:7001/sms-service/sms/send \
  -H 'cache-control: no-cache' \
  -H 'content-type: multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW' \
  -F content=21123131231231231312112313123123123131