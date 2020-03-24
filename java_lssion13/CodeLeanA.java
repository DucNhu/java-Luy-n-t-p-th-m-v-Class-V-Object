package java_lssion13;

class CodeLeanA {
    private void methodPrivate() {}
    public void methodPublic() {
        methodPrivate();
    }
    protected void methodProtected() {
        methodPrivate();
    }
    void methodDefault() {
        methodPrivate();
    }

}
