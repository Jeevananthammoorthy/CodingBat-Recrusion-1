public String changePi(String str) {
        if (str.length() <= 1) {
            return str;
        }
        if (str.substring(0, 2).equals("pi")) {
            return "3.14" + changePi(str.substring(2, str.length()));
        }
        return str.substring(0, 1) + changePi(str.substring(1, str.length()));
}
