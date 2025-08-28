import java.sql.Date;
import java.util.Date;
public class D {
    Date x;
}
 
 /*D.java:4: error: reference to Date is ambiguous
    Date x;
    ^
  both class java.sql.Date in java.sql and class java.util.Date in java.util match
D.java:2: error: a type with the same simple name is already defined by the single-type-import of Date
import java.util.Date;
^
2 errors*/
