package java_lssion13.codelean.util;

import java_lssion13.CodeLeanB;

public class CodeLeanD extends CodeLeanB {
    public static void main(String[] args) {
        new CodeLeanB().methodPublic();
        new CodeLeanB().methodProtected();
        new CodeLeanD().methodProtected();
    }
}
