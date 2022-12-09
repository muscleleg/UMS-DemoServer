# UMS-DemoServer
UMS 테스트를 위한  데모 서버 개발

# 필요환경
h2 database 1.4.199를 필요로 합니다.
https://www.h2database.com/html/download-archive.html

#H2 database 실행법
참고 사이트 : https://programmer93.tistory.com/61<br>

최초 실행시

jdbc:h2:~/ums<br>

라고 적어주시고 한번만 연결을 해주시면 데이터베이스 파일이 생성되면서 연결됩니다.<br>

그리고 이후에는 jdbc:h2:tcp://localhost/~/ums 로 접속해주세요.
