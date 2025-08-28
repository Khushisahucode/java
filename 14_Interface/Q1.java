interface Q {
    void show();
}
class Q1 implements Q{
    abstract void show();
}
/*
 * Q1.java:4: error: Q1 is not abstract and does not override abstract method show() in Q1
class Q1 implements Q{
^
Q1.java:5: error: show() in Q1 cannot implement show() in Q
    abstract void show();
                  ^
  attempting to assign weaker access privileges; was public
2 errors
 */