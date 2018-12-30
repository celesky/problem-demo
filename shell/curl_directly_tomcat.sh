#/bin/bash
    # access through tomcat directly
curl -X POST \
  http://localhost:8080/sms/send \
  -H 'cache-control: no-cache' \
  -H 'content-type: multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW' \
  -F content=21123131231231231312112313123123123131