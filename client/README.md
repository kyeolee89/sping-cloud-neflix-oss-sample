## Hystrix Test

- server-1115 / client 서버 구동
- /hello API 호출 > **Hello World!** 출력
    - server-1115 에서 보내주는 메세지 (circuit close 상태)
- server-1115 서버 중단
- /hello API 호출 > **Hello World! (default)** 출력
    - fallbackMethod 에서 출력하는 메세지 (circuit open 상태)
    
## Hystrix Config
- thread pool 의 개수, circuit open 조건 등 customizing 필요
- https://github.com/kyeolee89/sping-cloud-neflix-oss-sample/blob/master/client/src/main/resources/application.yml