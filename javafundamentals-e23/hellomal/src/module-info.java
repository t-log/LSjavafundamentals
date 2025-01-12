module hellomal {
    requires hello;
    provides hello.Hello with mal.hello.HelloMal;
}