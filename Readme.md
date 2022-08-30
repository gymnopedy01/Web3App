# Web3j 학습 테스트 프로젝트

## Web3j 설치
```sh
$ curl -L get.web3j.io | sh && source ~/.web3j/source.sh
```
Web3j 환경설정 , 중간정도에 APP_HOME 을 추가 하여야 한다.
```sh
$ notepad ~\.web3j\web3j
APP_HOME="`pwd -P`/.web3j/web3j-cli-shadow-1.4.1"
```

Window git 환경에서는 web3j 가 실행이 안되므로 bash_profile 파일을 USER_HOME 밑으로 복사한다.
```sh
$ cp .bash_profile ~/.bash_profile
```

## Web3j 문서
[문서](https://docs.web3j.io/4.8.7/quickstart/)


## Commands
```
./gradlew.bat test                      Test your application
web3j run                               Runs your application
web3j docker run                        Runs your application in docker
```


Ganache 실행후 jsonrpc 확인
```sh
$ curl -X POST --data '{"jsonrpc":"2.0","method":"eth_sendTransaction","params":[{
        "from": "0x5A2a35A94BFa6F9FD9FAFfaB280f3042Ea331D4D",
        "to": "0x93D76fe6F1e0AD35Eb5619A901757716f9ebbf67",
        "gas": "0x76c0",
        "gasPrice": "0x9184e72a000",
        "value": "0x9184e72a"
        }],"id":1}' localhost:8545
```
