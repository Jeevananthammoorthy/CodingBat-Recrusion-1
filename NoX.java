public String noX(String str) {
  if(str.length()<1) {
    return "";
  }
  if(str.substring(0,1).equals("x")) {
    return noX(str.substring(1, str.length()));
  }
  return str.substring(0,1) + noX(str.substring(1, str.length()));
}
