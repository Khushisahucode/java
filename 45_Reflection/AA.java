
class AA {

    String name;

    final private User cook(double d1, User u1) throws ClassNotFoundException {
        System.out.println("default method.cook...");
        return null;
    }

    private static float write() throws ArrayStoreException {
        System.out.println("public method..write.");
        int y = 12 / 0;
        System.out.println(y);
        return 0;
    }
}
