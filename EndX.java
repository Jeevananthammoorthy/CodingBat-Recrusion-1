public String endX(String str) {
  if(str.length()<=1) {
    return str;
  }
  if(str.substring(0,1).equals("x")) {
    return endX(str.substring(1, str.length())) + "x";
  }
  return str.substring(0,1) + endX(str.substring(1, str.length()));
}
