import hello.Hello;

module helloen {
    requires hello;
    provides hello.Hello with en.hello.EnHello;
}