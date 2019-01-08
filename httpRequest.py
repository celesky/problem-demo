#!/usr/bin/python3
import http.client,urllib,requests,json 
import time

def invoke():  
    url = "http://localhost:7001/sms-service/sms/send"
    loginParam={ "loginName": "test"}
    headers = {'User-Agent' : 'Mozilla/5.0 (Linux; Android 4.2.1; en-us; Nexus 4 Build/JOP40D) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19','Content-Type':'application/json'}
    # r = requests.post(url,data=json.dumps(loginParam),headers=headers) 
    r = requests.get(url)
    # print(r.content)
    print(r.status_code)
    # decode_json=json.loads(r.content)
    # print(decode_json)
    # print(r.content)

def loop():
    counter = 0
    while counter <= 1:
        counter += 1
        try:
            invoke()
            time.sleep(0.02)

        except IOError as e :
            pass
            # print('调用异常 counter:{0} e:{1}'.format(counter,e))
        else:
            pass
            # print('调用成功 counter:{0}'.format(counter))


def main():
    loop()



if __name__ == '__main__':
    main()