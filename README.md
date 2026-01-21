# quickfix-bug


The `SomePage.java` class has an `Unhandled exception type ExecutionException` error.

If you use the QuickFix action `Add throws declarat...` the java extension will remove the fragment name of the second Template specification and the escaped backslashes from the string.

Before executing the QuickFix:
```java
    String someString = "Escaped\\Test\\Path";

    @CheckedTemplate
    static class Templates {
        public static native TemplateInstance page();
        public static native TemplateInstance page$content();
    }
```
After performing the QuickFix:

```java
    String someString = "Escaped\Test\Path";

    @CheckedTemplate
    static class Templates {
        public static native TemplateInstance page();
        public static native TemplateInstance page();
    }
```