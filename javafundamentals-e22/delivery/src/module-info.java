module delivery {
    //class path
    //module path
    requires transitive invoicing; //here transitive will get the dependencies which delivery module depends on
    /*
    * if module A depends on B and B depends on C then A depends on C
    * */
    exports delivery;
}